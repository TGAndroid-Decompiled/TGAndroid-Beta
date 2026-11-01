package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONObject;
public final class h81 extends AsyncTask {
    public final int f26705a;
    public String f26706b;
    public final String[] f26707c;
    public final n81 d;

    public h81(n81 n81Var, String str, int i10) {
        this.f26705a = i10;
        switch (i10) {
            case 1:
                this.d = n81Var;
                this.f26707c = new String[4];
                this.f26706b = str;
                return;
            case 2:
                this.d = n81Var;
                this.f26707c = new String[2];
                this.f26706b = str;
                return;
            case 3:
                this.d = n81Var;
                this.f26707c = new String[2];
                this.f26706b = str;
                return;
            case 4:
                this.d = n81Var;
                this.f26707c = new String[2];
                this.f26706b = str;
                return;
            default:
                this.d = n81Var;
                this.f26707c = new String[2];
                this.f26706b = str;
                return;
        }
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        switch (this.f26705a) {
            case 0:
                Void[] voidArr = (Void[]) objArr;
                String[] strArr = this.f26707c;
                Locale locale = Locale.US;
                this.d.getClass();
                String c10 = n81.c(this, "http://www.aparat.com/video/video/embed/vt/frame/showvideo/yes/videohash/" + this.f26706b, null, true);
                if (isCancelled()) {
                    return null;
                }
                try {
                    Matcher matcher = n81.f28716r0.matcher(c10);
                    if (matcher.find()) {
                        JSONArray jSONArray = new JSONArray(matcher.group(1));
                        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                            JSONArray jSONArray2 = jSONArray.getJSONArray(i10);
                            if (jSONArray2.length() != 0) {
                                JSONObject jSONObject = jSONArray2.getJSONObject(0);
                                if (jSONObject.has("file")) {
                                    strArr[0] = jSONObject.getString("file");
                                    strArr[1] = "other";
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr[0];
            case 1:
                Void[] voidArr2 = (Void[]) objArr;
                String[] strArr2 = this.f26707c;
                Locale locale2 = Locale.US;
                this.d.getClass();
                String c11 = n81.c(this, "https://coub.com/api/v2/coubs/" + this.f26706b + ".json", null, true);
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
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr2[0];
            case 2:
                Void[] voidArr3 = (Void[]) objArr;
                String[] strArr3 = this.f26707c;
                String str = this.f26706b;
                this.d.getClass();
                String c12 = n81.c(this, str, null, false);
                if (isCancelled()) {
                    return null;
                }
                try {
                    Matcher matcher2 = n81.f28717s0.matcher(c12);
                    if (matcher2.find()) {
                        strArr3[0] = new JSONObject(matcher2.group(1)).getJSONArray("quality_options").getJSONObject(0).getString("source");
                        strArr3[1] = "other";
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.f8.g(e10, true);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr3[0];
            case 3:
                Void[] voidArr4 = (Void[]) objArr;
                String[] strArr4 = this.f26707c;
                HashMap hashMap = new HashMap();
                hashMap.put("Client-ID", "jzkbprff40iqj646a697cyrvl0zt2m6");
                int indexOf = this.f26706b.indexOf(38);
                if (indexOf > 0) {
                    this.f26706b = this.f26706b.substring(0, indexOf);
                }
                Locale locale3 = Locale.US;
                this.d.getClass();
                String c13 = n81.c(this, "https://api.twitch.tv/kraken/streams/" + this.f26706b + "?stream_type=all", hashMap, false);
                if (isCancelled()) {
                    return null;
                }
                try {
                    new JSONObject(c13).getJSONObject("stream");
                    JSONObject jSONObject3 = new JSONObject(n81.c(this, "https://api.twitch.tv/api/channels/" + this.f26706b + "/access_token", hashMap, false));
                    String encode = URLEncoder.encode(jSONObject3.getString("sig"), "UTF-8");
                    String encode2 = URLEncoder.encode(jSONObject3.getString("token"), "UTF-8");
                    URLEncoder.encode("https://youtube.googleapis.com/v/" + this.f26706b, "UTF-8");
                    String str2 = this.f26706b;
                    strArr4[0] = "https://usher.ttvnw.net/api/channel/hls/" + str2 + ".m3u8?" + ("allow_source=true&allow_audio_only=true&allow_spectre=true&player=twitchweb&segment_preference=4&p=" + ((int) (Math.random() * 1.0E7d)) + "&sig=" + encode + "&token=" + encode2);
                    strArr4[1] = "hls";
                } catch (Exception e11) {
                    org.telegram.messenger.f8.g(e11, true);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr4[0];
            default:
                Void[] voidArr5 = (Void[]) objArr;
                String[] strArr5 = this.f26707c;
                Locale locale4 = Locale.US;
                this.d.getClass();
                String c14 = n81.c(this, "https://player.vimeo.com/video/" + this.f26706b + "/config", null, true);
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
                } catch (Exception e12) {
                    org.telegram.messenger.f8.g(e12, true);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr5[0];
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        switch (this.f26705a) {
            case 0:
                String str = (String) obj;
                n81 n81Var = this.d;
                if (str != null) {
                    n81Var.f28744x = true;
                    n81Var.f28745y = str;
                    n81Var.D = this.f26707c[1];
                    if (n81Var.f28742s) {
                        n81Var.i();
                    }
                    n81Var.j(false, true);
                    n81Var.f28734f0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    n81Var.h();
                    return;
                } else {
                    return;
                }
            case 1:
                String str2 = (String) obj;
                n81 n81Var2 = this.d;
                if (str2 != null) {
                    n81Var2.f28744x = true;
                    n81Var2.f28745y = str2;
                    String[] strArr = this.f26707c;
                    n81Var2.D = strArr[1];
                    n81Var2.E = strArr[2];
                    n81Var2.F = strArr[3];
                    if (n81Var2.f28742s) {
                        n81Var2.i();
                    }
                    n81Var2.j(false, true);
                    n81Var2.f28734f0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    n81Var2.h();
                    return;
                } else {
                    return;
                }
            case 2:
                String str3 = (String) obj;
                n81 n81Var3 = this.d;
                if (str3 != null) {
                    n81Var3.f28744x = true;
                    n81Var3.f28745y = str3;
                    n81Var3.D = this.f26707c[1];
                    if (n81Var3.f28742s) {
                        n81Var3.i();
                    }
                    n81Var3.j(false, true);
                    n81Var3.f28734f0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    n81Var3.h();
                    return;
                } else {
                    return;
                }
            case 3:
                String str4 = (String) obj;
                n81 n81Var4 = this.d;
                if (str4 != null) {
                    n81Var4.f28744x = true;
                    n81Var4.f28745y = str4;
                    n81Var4.D = this.f26707c[1];
                    if (n81Var4.f28742s) {
                        n81Var4.i();
                    }
                    n81Var4.j(false, true);
                    n81Var4.f28734f0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    n81Var4.h();
                    return;
                } else {
                    return;
                }
            default:
                String str5 = (String) obj;
                n81 n81Var5 = this.d;
                if (str5 != null) {
                    n81Var5.f28744x = true;
                    n81Var5.f28745y = str5;
                    n81Var5.D = this.f26707c[1];
                    if (n81Var5.f28742s) {
                        n81Var5.i();
                    }
                    n81Var5.j(false, true);
                    n81Var5.f28734f0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    n81Var5.h();
                    return;
                } else {
                    return;
                }
        }
    }
}
