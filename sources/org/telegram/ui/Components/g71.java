package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONObject;
public final class g71 extends AsyncTask {
    public final int f34870a;
    public String f34871b;
    public final String[] f34872c;
    public final m71 d;

    public g71(m71 m71Var, String str, int i7) {
        this.f34870a = i7;
        switch (i7) {
            case 1:
                this.d = m71Var;
                this.f34872c = new String[4];
                this.f34871b = str;
                return;
            case 2:
                this.d = m71Var;
                this.f34872c = new String[2];
                this.f34871b = str;
                return;
            case 3:
                this.d = m71Var;
                this.f34872c = new String[2];
                this.f34871b = str;
                return;
            case 4:
                this.d = m71Var;
                this.f34872c = new String[2];
                this.f34871b = str;
                return;
            default:
                this.d = m71Var;
                this.f34872c = new String[2];
                this.f34871b = str;
                return;
        }
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        switch (this.f34870a) {
            case 0:
                Void[] voidArr = (Void[]) objArr;
                String[] strArr = this.f34872c;
                Locale locale = Locale.US;
                this.d.getClass();
                String c10 = m71.c(this, "http://www.aparat.com/video/video/embed/vt/frame/showvideo/yes/videohash/" + this.f34871b, null, true);
                if (isCancelled()) {
                    return null;
                }
                try {
                    Matcher matcher = m71.f37130s0.matcher(c10);
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
                String[] strArr2 = this.f34872c;
                Locale locale2 = Locale.US;
                this.d.getClass();
                String c11 = m71.c(this, "https://coub.com/api/v2/coubs/" + this.f34871b + ".json", null, true);
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
                String[] strArr3 = this.f34872c;
                String str = this.f34871b;
                this.d.getClass();
                String c12 = m71.c(this, str, null, false);
                if (isCancelled()) {
                    return null;
                }
                try {
                    Matcher matcher2 = m71.f37131t0.matcher(c12);
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
                String[] strArr4 = this.f34872c;
                HashMap hashMap = new HashMap();
                hashMap.put("Client-ID", "jzkbprff40iqj646a697cyrvl0zt2m6");
                int indexOf = this.f34871b.indexOf(38);
                if (indexOf > 0) {
                    this.f34871b = this.f34871b.substring(0, indexOf);
                }
                Locale locale3 = Locale.US;
                this.d.getClass();
                String c13 = m71.c(this, "https://api.twitch.tv/kraken/streams/" + this.f34871b + "?stream_type=all", hashMap, false);
                if (isCancelled()) {
                    return null;
                }
                try {
                    new JSONObject(c13).getJSONObject("stream");
                    JSONObject jSONObject3 = new JSONObject(m71.c(this, "https://api.twitch.tv/api/channels/" + this.f34871b + "/access_token", hashMap, false));
                    String encode = URLEncoder.encode(jSONObject3.getString("sig"), "UTF-8");
                    String encode2 = URLEncoder.encode(jSONObject3.getString("token"), "UTF-8");
                    URLEncoder.encode("https://youtube.googleapis.com/v/" + this.f34871b, "UTF-8");
                    String str2 = this.f34871b;
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
                String[] strArr5 = this.f34872c;
                Locale locale4 = Locale.US;
                this.d.getClass();
                String c14 = m71.c(this, "https://player.vimeo.com/video/" + this.f34871b + "/config", null, true);
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
        switch (this.f34870a) {
            case 0:
                String str = (String) obj;
                m71 m71Var = this.d;
                if (str != null) {
                    m71Var.f37159x = true;
                    m71Var.f37160y = str;
                    m71Var.E = this.f34872c[1];
                    if (m71Var.f37157s) {
                        m71Var.i();
                    }
                    m71Var.j(false, true);
                    m71Var.f37149g0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    m71Var.h();
                    return;
                } else {
                    return;
                }
            case 1:
                String str2 = (String) obj;
                m71 m71Var2 = this.d;
                if (str2 != null) {
                    m71Var2.f37159x = true;
                    m71Var2.f37160y = str2;
                    String[] strArr = this.f34872c;
                    m71Var2.E = strArr[1];
                    m71Var2.F = strArr[2];
                    m71Var2.G = strArr[3];
                    if (m71Var2.f37157s) {
                        m71Var2.i();
                    }
                    m71Var2.j(false, true);
                    m71Var2.f37149g0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    m71Var2.h();
                    return;
                } else {
                    return;
                }
            case 2:
                String str3 = (String) obj;
                m71 m71Var3 = this.d;
                if (str3 != null) {
                    m71Var3.f37159x = true;
                    m71Var3.f37160y = str3;
                    m71Var3.E = this.f34872c[1];
                    if (m71Var3.f37157s) {
                        m71Var3.i();
                    }
                    m71Var3.j(false, true);
                    m71Var3.f37149g0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    m71Var3.h();
                    return;
                } else {
                    return;
                }
            case 3:
                String str4 = (String) obj;
                m71 m71Var4 = this.d;
                if (str4 != null) {
                    m71Var4.f37159x = true;
                    m71Var4.f37160y = str4;
                    m71Var4.E = this.f34872c[1];
                    if (m71Var4.f37157s) {
                        m71Var4.i();
                    }
                    m71Var4.j(false, true);
                    m71Var4.f37149g0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    m71Var4.h();
                    return;
                } else {
                    return;
                }
            default:
                String str5 = (String) obj;
                m71 m71Var5 = this.d;
                if (str5 != null) {
                    m71Var5.f37159x = true;
                    m71Var5.f37160y = str5;
                    m71Var5.E = this.f34872c[1];
                    if (m71Var5.f37157s) {
                        m71Var5.i();
                    }
                    m71Var5.j(false, true);
                    m71Var5.f37149g0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    m71Var5.h();
                    return;
                } else {
                    return;
                }
        }
    }
}
