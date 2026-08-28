package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
public final class a81 extends AsyncTask {
    public final int f26724a;
    public String f26725b;
    public final String[] f26726c;
    public final g81 d;

    public a81(g81 g81Var, String str, int i9) {
        this.f26724a = i9;
        switch (i9) {
            case 1:
                this.d = g81Var;
                this.f26726c = new String[4];
                this.f26725b = str;
                return;
            case 2:
                this.d = g81Var;
                this.f26726c = new String[2];
                this.f26725b = str;
                return;
            case 3:
                this.d = g81Var;
                this.f26726c = new String[2];
                this.f26725b = str;
                return;
            case 4:
                this.d = g81Var;
                this.f26726c = new String[2];
                this.f26725b = str;
                return;
            default:
                this.d = g81Var;
                this.f26726c = new String[2];
                this.f26725b = str;
                return;
        }
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        switch (this.f26724a) {
            case 0:
                Void[] voidArr = (Void[]) objArr;
                String[] strArr = this.f26726c;
                Locale locale = Locale.US;
                this.d.getClass();
                String c10 = g81.c(this, "http://www.aparat.com/video/video/embed/vt/frame/showvideo/yes/videohash/" + this.f26725b, null, true);
                if (isCancelled()) {
                    return null;
                }
                try {
                    Matcher matcher = g81.f28682n0.matcher(c10);
                    if (matcher.find()) {
                        JSONArray jSONArray = new JSONArray(matcher.group(1));
                        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                            JSONArray jSONArray2 = jSONArray.getJSONArray(i9);
                            if (jSONArray2.length() != 0) {
                                JSONObject jSONObject = jSONArray2.getJSONObject(0);
                                if (jSONObject.has("file")) {
                                    strArr[0] = jSONObject.getString("file");
                                    strArr[1] = "other";
                                }
                            }
                        }
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr[0];
            case 1:
                Void[] voidArr2 = (Void[]) objArr;
                String[] strArr2 = this.f26726c;
                Locale locale2 = Locale.US;
                this.d.getClass();
                String c11 = g81.c(this, "https://coub.com/api/v2/coubs/" + this.f26725b + ".json", null, true);
                if (isCancelled()) {
                    return null;
                }
                try {
                    JSONObject jSONObject2 = new JSONObject(c11).getJSONObject("file_versions").getJSONObject("mobile");
                    String string = jSONObject2.getString("video");
                    String string2 = jSONObject2.getJSONArray("audio").getString(0);
                    if (string != null && string2 != null) {
                        strArr2[0] = string;
                        strArr2[1] = "other";
                        strArr2[2] = string2;
                        strArr2[3] = "other";
                    }
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr2[0];
            case 2:
                Void[] voidArr3 = (Void[]) objArr;
                String[] strArr3 = this.f26726c;
                String str = this.f26725b;
                this.d.getClass();
                String c12 = g81.c(this, str, null, false);
                if (isCancelled()) {
                    return null;
                }
                try {
                    Matcher matcher2 = g81.f28683o0.matcher(c12);
                    if (matcher2.find()) {
                        strArr3[0] = new JSONObject(matcher2.group(1)).getJSONArray("quality_options").getJSONObject(0).getString("source");
                        strArr3[1] = "other";
                    }
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr3[0];
            case 3:
                Void[] voidArr4 = (Void[]) objArr;
                String[] strArr4 = this.f26726c;
                HashMap hashMap = new HashMap();
                hashMap.put("Client-ID", "jzkbprff40iqj646a697cyrvl0zt2m6");
                int indexOf = this.f26725b.indexOf(38);
                if (indexOf > 0) {
                    this.f26725b = this.f26725b.substring(0, indexOf);
                }
                Locale locale3 = Locale.US;
                this.d.getClass();
                String c13 = g81.c(this, "https://api.twitch.tv/kraken/streams/" + this.f26725b + "?stream_type=all", hashMap, false);
                if (isCancelled()) {
                    return null;
                }
                try {
                    new JSONObject(c13).getJSONObject("stream");
                    JSONObject jSONObject3 = new JSONObject(g81.c(this, "https://api.twitch.tv/api/channels/" + this.f26725b + "/access_token", hashMap, false));
                    String encode = URLEncoder.encode(jSONObject3.getString("sig"), "UTF-8");
                    String encode2 = URLEncoder.encode(jSONObject3.getString("token"), "UTF-8");
                    URLEncoder.encode("https://youtube.googleapis.com/v/" + this.f26725b, "UTF-8");
                    String str2 = this.f26725b;
                    strArr4[0] = "https://usher.ttvnw.net/api/channel/hls/" + str2 + ".m3u8?" + ("allow_source=true&allow_audio_only=true&allow_spectre=true&player=twitchweb&segment_preference=4&p=" + ((int) (Math.random() * 1.0E7d)) + "&sig=" + encode + "&token=" + encode2);
                    strArr4[1] = "hls";
                } catch (Exception e13) {
                    FileLog.e(e13);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr4[0];
            default:
                Void[] voidArr5 = (Void[]) objArr;
                String[] strArr5 = this.f26726c;
                Locale locale4 = Locale.US;
                this.d.getClass();
                String c14 = g81.c(this, "https://player.vimeo.com/video/" + this.f26725b + "/config", null, true);
                if (isCancelled()) {
                    return null;
                }
                try {
                    JSONObject jSONObject4 = new JSONObject(c14).getJSONObject("request").getJSONObject("files");
                    if (jSONObject4.has("hls")) {
                        JSONObject jSONObject5 = jSONObject4.getJSONObject("hls");
                        try {
                            strArr5[0] = jSONObject5.getString("url");
                        } catch (Exception unused) {
                            strArr5[0] = jSONObject5.getJSONObject("cdns").getJSONObject(jSONObject5.getString("default_cdn")).getString("url");
                        }
                        strArr5[1] = "hls";
                    } else if (jSONObject4.has("progressive")) {
                        strArr5[1] = "other";
                        strArr5[0] = jSONObject4.getJSONArray("progressive").getJSONObject(0).getString("url");
                    }
                } catch (Exception e14) {
                    FileLog.e(e14);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr5[0];
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        switch (this.f26724a) {
            case 0:
                String str = (String) obj;
                g81 g81Var = this.d;
                if (str != null) {
                    g81Var.f28707w = true;
                    g81Var.f28708x = str;
                    g81Var.f28709y = this.f26726c[1];
                    if (g81Var.f28706s) {
                        g81Var.i();
                    }
                    g81Var.j(false, true);
                    g81Var.f28695b0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    g81Var.h();
                    return;
                } else {
                    return;
                }
            case 1:
                String str2 = (String) obj;
                g81 g81Var2 = this.d;
                if (str2 != null) {
                    g81Var2.f28707w = true;
                    g81Var2.f28708x = str2;
                    String[] strArr = this.f26726c;
                    g81Var2.f28709y = strArr[1];
                    g81Var2.A = strArr[2];
                    g81Var2.B = strArr[3];
                    if (g81Var2.f28706s) {
                        g81Var2.i();
                    }
                    g81Var2.j(false, true);
                    g81Var2.f28695b0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    g81Var2.h();
                    return;
                } else {
                    return;
                }
            case 2:
                String str3 = (String) obj;
                g81 g81Var3 = this.d;
                if (str3 != null) {
                    g81Var3.f28707w = true;
                    g81Var3.f28708x = str3;
                    g81Var3.f28709y = this.f26726c[1];
                    if (g81Var3.f28706s) {
                        g81Var3.i();
                    }
                    g81Var3.j(false, true);
                    g81Var3.f28695b0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    g81Var3.h();
                    return;
                } else {
                    return;
                }
            case 3:
                String str4 = (String) obj;
                g81 g81Var4 = this.d;
                if (str4 != null) {
                    g81Var4.f28707w = true;
                    g81Var4.f28708x = str4;
                    g81Var4.f28709y = this.f26726c[1];
                    if (g81Var4.f28706s) {
                        g81Var4.i();
                    }
                    g81Var4.j(false, true);
                    g81Var4.f28695b0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    g81Var4.h();
                    return;
                } else {
                    return;
                }
            default:
                String str5 = (String) obj;
                g81 g81Var5 = this.d;
                if (str5 != null) {
                    g81Var5.f28707w = true;
                    g81Var5.f28708x = str5;
                    g81Var5.f28709y = this.f26726c[1];
                    if (g81Var5.f28706s) {
                        g81Var5.i();
                    }
                    g81Var5.j(false, true);
                    g81Var5.f28695b0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    g81Var5.h();
                    return;
                } else {
                    return;
                }
        }
    }
}
