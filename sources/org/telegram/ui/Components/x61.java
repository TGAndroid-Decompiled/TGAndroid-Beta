package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONObject;
public final class x61 extends AsyncTask {
    public final int f40253a;
    public String f40254b;
    public final String[] f40255c;
    public final d71 d;

    public x61(d71 d71Var, String str, int i3) {
        this.f40253a = i3;
        switch (i3) {
            case 1:
                this.d = d71Var;
                this.f40255c = new String[4];
                this.f40254b = str;
                return;
            case 2:
                this.d = d71Var;
                this.f40255c = new String[2];
                this.f40254b = str;
                return;
            case 3:
                this.d = d71Var;
                this.f40255c = new String[2];
                this.f40254b = str;
                return;
            case 4:
                this.d = d71Var;
                this.f40255c = new String[2];
                this.f40254b = str;
                return;
            default:
                this.d = d71Var;
                this.f40255c = new String[2];
                this.f40254b = str;
                return;
        }
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        switch (this.f40253a) {
            case 0:
                Void[] voidArr = (Void[]) objArr;
                String[] strArr = this.f40255c;
                Locale locale = Locale.US;
                this.d.getClass();
                String c2 = d71.c(this, "http://www.aparat.com/video/video/embed/vt/frame/showvideo/yes/videohash/" + this.f40254b, null, true);
                if (isCancelled()) {
                    return null;
                }
                try {
                    Matcher matcher = d71.f32988s0.matcher(c2);
                    if (matcher.find()) {
                        JSONArray jSONArray = new JSONArray(matcher.group(1));
                        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                            JSONArray jSONArray2 = jSONArray.getJSONArray(i3);
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
                String[] strArr2 = this.f40255c;
                Locale locale2 = Locale.US;
                this.d.getClass();
                String c10 = d71.c(this, "https://coub.com/api/v2/coubs/" + this.f40254b + ".json", null, true);
                if (isCancelled()) {
                    return null;
                }
                try {
                    JSONObject jSONObject2 = new JSONObject(c10).getJSONObject("file_versions").getJSONObject("mobile");
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
                String[] strArr3 = this.f40255c;
                String str = this.f40254b;
                this.d.getClass();
                String c11 = d71.c(this, str, null, false);
                if (isCancelled()) {
                    return null;
                }
                try {
                    Matcher matcher2 = d71.f32989t0.matcher(c11);
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
                String[] strArr4 = this.f40255c;
                HashMap hashMap = new HashMap();
                hashMap.put("Client-ID", "jzkbprff40iqj646a697cyrvl0zt2m6");
                int indexOf = this.f40254b.indexOf(38);
                if (indexOf > 0) {
                    this.f40254b = this.f40254b.substring(0, indexOf);
                }
                Locale locale3 = Locale.US;
                this.d.getClass();
                String c12 = d71.c(this, "https://api.twitch.tv/kraken/streams/" + this.f40254b + "?stream_type=all", hashMap, false);
                if (isCancelled()) {
                    return null;
                }
                try {
                    new JSONObject(c12).getJSONObject("stream");
                    JSONObject jSONObject3 = new JSONObject(d71.c(this, "https://api.twitch.tv/api/channels/" + this.f40254b + "/access_token", hashMap, false));
                    String encode = URLEncoder.encode(jSONObject3.getString("sig"), "UTF-8");
                    String encode2 = URLEncoder.encode(jSONObject3.getString("token"), "UTF-8");
                    URLEncoder.encode("https://youtube.googleapis.com/v/" + this.f40254b, "UTF-8");
                    String str2 = this.f40254b;
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
                String[] strArr5 = this.f40255c;
                Locale locale4 = Locale.US;
                this.d.getClass();
                String c13 = d71.c(this, "https://player.vimeo.com/video/" + this.f40254b + "/config", null, true);
                if (isCancelled()) {
                    return null;
                }
                try {
                    JSONObject jSONObject4 = new JSONObject(c13).getJSONObject("request").getJSONObject("files");
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
        switch (this.f40253a) {
            case 0:
                String str = (String) obj;
                d71 d71Var = this.d;
                if (str != null) {
                    d71Var.f33017x = true;
                    d71Var.f33018y = str;
                    d71Var.E = this.f40255c[1];
                    if (d71Var.f33015s) {
                        d71Var.i();
                    }
                    d71Var.j(false, true);
                    d71Var.f33007g0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    d71Var.h();
                    return;
                } else {
                    return;
                }
            case 1:
                String str2 = (String) obj;
                d71 d71Var2 = this.d;
                if (str2 != null) {
                    d71Var2.f33017x = true;
                    d71Var2.f33018y = str2;
                    String[] strArr = this.f40255c;
                    d71Var2.E = strArr[1];
                    d71Var2.F = strArr[2];
                    d71Var2.G = strArr[3];
                    if (d71Var2.f33015s) {
                        d71Var2.i();
                    }
                    d71Var2.j(false, true);
                    d71Var2.f33007g0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    d71Var2.h();
                    return;
                } else {
                    return;
                }
            case 2:
                String str3 = (String) obj;
                d71 d71Var3 = this.d;
                if (str3 != null) {
                    d71Var3.f33017x = true;
                    d71Var3.f33018y = str3;
                    d71Var3.E = this.f40255c[1];
                    if (d71Var3.f33015s) {
                        d71Var3.i();
                    }
                    d71Var3.j(false, true);
                    d71Var3.f33007g0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    d71Var3.h();
                    return;
                } else {
                    return;
                }
            case 3:
                String str4 = (String) obj;
                d71 d71Var4 = this.d;
                if (str4 != null) {
                    d71Var4.f33017x = true;
                    d71Var4.f33018y = str4;
                    d71Var4.E = this.f40255c[1];
                    if (d71Var4.f33015s) {
                        d71Var4.i();
                    }
                    d71Var4.j(false, true);
                    d71Var4.f33007g0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    d71Var4.h();
                    return;
                } else {
                    return;
                }
            default:
                String str5 = (String) obj;
                d71 d71Var5 = this.d;
                if (str5 != null) {
                    d71Var5.f33017x = true;
                    d71Var5.f33018y = str5;
                    d71Var5.E = this.f40255c[1];
                    if (d71Var5.f33015s) {
                        d71Var5.i();
                    }
                    d71Var5.j(false, true);
                    d71Var5.f33007g0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    d71Var5.h();
                    return;
                } else {
                    return;
                }
        }
    }
}
