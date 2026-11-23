package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONObject;
public final class t71 extends AsyncTask {
    public final int f39795a;
    public String f39796b;
    public final String[] f39797c;
    public final z71 d;

    public t71(z71 z71Var, String str, int i7) {
        this.f39795a = i7;
        switch (i7) {
            case 1:
                this.d = z71Var;
                this.f39797c = new String[4];
                this.f39796b = str;
                return;
            case 2:
                this.d = z71Var;
                this.f39797c = new String[2];
                this.f39796b = str;
                return;
            case 3:
                this.d = z71Var;
                this.f39797c = new String[2];
                this.f39796b = str;
                return;
            case 4:
                this.d = z71Var;
                this.f39797c = new String[2];
                this.f39796b = str;
                return;
            default:
                this.d = z71Var;
                this.f39797c = new String[2];
                this.f39796b = str;
                return;
        }
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        switch (this.f39795a) {
            case 0:
                Void[] voidArr = (Void[]) objArr;
                String[] strArr = this.f39797c;
                Locale locale = Locale.US;
                this.d.getClass();
                String c10 = z71.c(this, "http://www.aparat.com/video/video/embed/vt/frame/showvideo/yes/videohash/" + this.f39796b, null, true);
                if (isCancelled()) {
                    return null;
                }
                try {
                    Matcher matcher = z71.f42701s0.matcher(c10);
                    if (matcher.find()) {
                        JSONArray jSONArray = new JSONArray(matcher.group(1));
                        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                            JSONArray jSONArray2 = jSONArray.getJSONArray(i7);
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
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr[0];
            case 1:
                Void[] voidArr2 = (Void[]) objArr;
                String[] strArr2 = this.f39797c;
                Locale locale2 = Locale.US;
                this.d.getClass();
                String c11 = z71.c(this, "https://coub.com/api/v2/coubs/" + this.f39796b + ".json", null, true);
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
                    org.telegram.messenger.a8.g(e11, true);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr2[0];
            case 2:
                Void[] voidArr3 = (Void[]) objArr;
                String[] strArr3 = this.f39797c;
                String str = this.f39796b;
                this.d.getClass();
                String c12 = z71.c(this, str, null, false);
                if (isCancelled()) {
                    return null;
                }
                try {
                    Matcher matcher2 = z71.f42702t0.matcher(c12);
                    if (matcher2.find()) {
                        strArr3[0] = new JSONObject(matcher2.group(1)).getJSONArray("quality_options").getJSONObject(0).getString("source");
                        strArr3[1] = "other";
                    }
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr3[0];
            case 3:
                Void[] voidArr4 = (Void[]) objArr;
                String[] strArr4 = this.f39797c;
                HashMap hashMap = new HashMap();
                hashMap.put("Client-ID", "jzkbprff40iqj646a697cyrvl0zt2m6");
                int indexOf = this.f39796b.indexOf(38);
                if (indexOf > 0) {
                    this.f39796b = this.f39796b.substring(0, indexOf);
                }
                Locale locale3 = Locale.US;
                this.d.getClass();
                String c13 = z71.c(this, "https://api.twitch.tv/kraken/streams/" + this.f39796b + "?stream_type=all", hashMap, false);
                if (isCancelled()) {
                    return null;
                }
                try {
                    new JSONObject(c13).getJSONObject("stream");
                    JSONObject jSONObject3 = new JSONObject(z71.c(this, "https://api.twitch.tv/api/channels/" + this.f39796b + "/access_token", hashMap, false));
                    String encode = URLEncoder.encode(jSONObject3.getString("sig"), "UTF-8");
                    String encode2 = URLEncoder.encode(jSONObject3.getString("token"), "UTF-8");
                    URLEncoder.encode("https://youtube.googleapis.com/v/" + this.f39796b, "UTF-8");
                    String str2 = this.f39796b;
                    strArr4[0] = "https://usher.ttvnw.net/api/channel/hls/" + str2 + ".m3u8?" + ("allow_source=true&allow_audio_only=true&allow_spectre=true&player=twitchweb&segment_preference=4&p=" + ((int) (Math.random() * 1.0E7d)) + "&sig=" + encode + "&token=" + encode2);
                    strArr4[1] = "hls";
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr4[0];
            default:
                Void[] voidArr5 = (Void[]) objArr;
                String[] strArr5 = this.f39797c;
                Locale locale4 = Locale.US;
                this.d.getClass();
                String c14 = z71.c(this, "https://player.vimeo.com/video/" + this.f39796b + "/config", null, true);
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
                    org.telegram.messenger.a8.g(e14, true);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr5[0];
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        switch (this.f39795a) {
            case 0:
                String str = (String) obj;
                z71 z71Var = this.d;
                if (str != null) {
                    z71Var.f42730x = true;
                    z71Var.f42731y = str;
                    z71Var.E = this.f39797c[1];
                    if (z71Var.f42728s) {
                        z71Var.i();
                    }
                    z71Var.j(false, true);
                    z71Var.f42720g0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    z71Var.h();
                    return;
                } else {
                    return;
                }
            case 1:
                String str2 = (String) obj;
                z71 z71Var2 = this.d;
                if (str2 != null) {
                    z71Var2.f42730x = true;
                    z71Var2.f42731y = str2;
                    String[] strArr = this.f39797c;
                    z71Var2.E = strArr[1];
                    z71Var2.F = strArr[2];
                    z71Var2.G = strArr[3];
                    if (z71Var2.f42728s) {
                        z71Var2.i();
                    }
                    z71Var2.j(false, true);
                    z71Var2.f42720g0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    z71Var2.h();
                    return;
                } else {
                    return;
                }
            case 2:
                String str3 = (String) obj;
                z71 z71Var3 = this.d;
                if (str3 != null) {
                    z71Var3.f42730x = true;
                    z71Var3.f42731y = str3;
                    z71Var3.E = this.f39797c[1];
                    if (z71Var3.f42728s) {
                        z71Var3.i();
                    }
                    z71Var3.j(false, true);
                    z71Var3.f42720g0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    z71Var3.h();
                    return;
                } else {
                    return;
                }
            case 3:
                String str4 = (String) obj;
                z71 z71Var4 = this.d;
                if (str4 != null) {
                    z71Var4.f42730x = true;
                    z71Var4.f42731y = str4;
                    z71Var4.E = this.f39797c[1];
                    if (z71Var4.f42728s) {
                        z71Var4.i();
                    }
                    z71Var4.j(false, true);
                    z71Var4.f42720g0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    z71Var4.h();
                    return;
                } else {
                    return;
                }
            default:
                String str5 = (String) obj;
                z71 z71Var5 = this.d;
                if (str5 != null) {
                    z71Var5.f42730x = true;
                    z71Var5.f42731y = str5;
                    z71Var5.E = this.f39797c[1];
                    if (z71Var5.f42728s) {
                        z71Var5.i();
                    }
                    z71Var5.j(false, true);
                    z71Var5.f42720g0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    z71Var5.h();
                    return;
                } else {
                    return;
                }
        }
    }
}
