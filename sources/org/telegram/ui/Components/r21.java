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

public final class r21 extends Thread {

    public final String f32063a;

    public final String f32064b;

    public final String f32065c;
    public final Utilities.Callback2 d;

    public r21(String str, String str2, String str3, Utilities.Callback2 callback2) {
        this.f32063a = str;
        this.f32064b = str2;
        this.f32065c = str3;
        this.d = callback2;
    }

    @Override
    public final void run() {
        HttpURLConnection httpURLConnection;
        String string;
        Utilities.Callback2 callback2 = this.d;
        String str = this.f32065c;
        boolean z10 = false;
        try {
            httpURLConnection = (HttpURLConnection) new URI(("https://translate.googleapis.com/translate_a/single?client=gtx&sl=" + Uri.encode(this.f32063a) + "&tl=" + Uri.encode(this.f32064b) + "&dt=t&ie=UTF-8&oe=UTF-8&otf=1&ssel=0&tsel=0&kc=7&dt=at&dt=bd&dt=ex&dt=ld&dt=md&dt=qca&dt=rw&dt=rm&dt=ss&q=") + str).toURL().openConnection();
            try {
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setRequestProperty("User-Agent", b31.N[(int) Math.round(Math.random() * ((double) 5))]);
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                StringBuilder sb2 = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), o8.d.f19363c));
                while (true) {
                    try {
                        int i10 = bufferedReader.read();
                        if (i10 == -1) {
                            break;
                        } else {
                            sb2.append((char) i10);
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    e = e;
                    try {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("failed to translate a text ");
                        sb3.append(httpURLConnection != null ? Integer.valueOf(httpURLConnection.getResponseCode()) : null);
                        sb3.append(" ");
                        sb3.append(httpURLConnection != null ? httpURLConnection.getResponseMessage() : null);
                        Log.e("translate", sb3.toString());
                    } catch (IOException e9) {
                        e9.printStackTrace();
                    }
                    e.printStackTrace();
                    if (httpURLConnection != null) {
                        try {
                            if (httpURLConnection.getResponseCode() == 429) {
                                z10 = true;
                            }
                        } catch (Exception unused) {
                            AndroidUtilities.runOnUIThread(new up0(callback2, 21));
                            return;
                        }
                    }
                    AndroidUtilities.runOnUIThread(new f50(8, callback2, z10));
                    return;
                }
                bufferedReader.close();
                JSONArray jSONArray = new JSONArray(new JSONTokener(sb2.toString()));
                JSONArray jSONArray2 = jSONArray.getJSONArray(0);
                try {
                    string = jSONArray.getString(2);
                } catch (Exception unused2) {
                    string = null;
                }
                if (string != null && string.contains("-")) {
                    string.substring(0, string.indexOf("-"));
                }
                String str2 = "";
                for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                    String string2 = jSONArray2.getJSONArray(i11).getString(0);
                    if (string2 != null && !string2.equals("null")) {
                        str2 = str2 + string2;
                    }
                }
                if (str.length() > 0 && str.charAt(0) == '\n') {
                    str2 = "\n" + str2;
                }
                AndroidUtilities.runOnUIThread(new lg0(23, callback2, str2));
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
            httpURLConnection = null;
        }
    }
}
