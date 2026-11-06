package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONObject;
public final class z61 extends AsyncTask {
    public final int f40855a;
    public String f40856b;
    public final String[] f40857c;
    public final f71 d;

    public z61(f71 f71Var, String str, int i7) {
        this.f40855a = i7;
        switch (i7) {
            case 1:
                this.d = f71Var;
                this.f40857c = new String[4];
                this.f40856b = str;
                return;
            case 2:
                this.d = f71Var;
                this.f40857c = new String[2];
                this.f40856b = str;
                return;
            case 3:
                this.d = f71Var;
                this.f40857c = new String[2];
                this.f40856b = str;
                return;
            case 4:
                this.d = f71Var;
                this.f40857c = new String[2];
                this.f40856b = str;
                return;
            default:
                this.d = f71Var;
                this.f40857c = new String[2];
                this.f40856b = str;
                return;
        }
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        switch (this.f40855a) {
            case 0:
                Void[] voidArr = (Void[]) objArr;
                String[] strArr = this.f40857c;
                Locale locale = Locale.US;
                this.d.getClass();
                String c10 = f71.c(this, "http://www.aparat.com/video/video/embed/vt/frame/showvideo/yes/videohash/" + this.f40856b, null, true);
                if (isCancelled()) {
                    return null;
                }
                try {
                    Matcher matcher = f71.f33506r0.matcher(c10);
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
                String[] strArr2 = this.f40857c;
                Locale locale2 = Locale.US;
                this.d.getClass();
                String c11 = f71.c(this, "https://coub.com/api/v2/coubs/" + this.f40856b + ".json", null, true);
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
                String[] strArr3 = this.f40857c;
                String str = this.f40856b;
                this.d.getClass();
                String c12 = f71.c(this, str, null, false);
                if (isCancelled()) {
                    return null;
                }
                try {
                    Matcher matcher2 = f71.f33507s0.matcher(c12);
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
                String[] strArr4 = this.f40857c;
                HashMap hashMap = new HashMap();
                hashMap.put("Client-ID", "jzkbprff40iqj646a697cyrvl0zt2m6");
                int indexOf = this.f40856b.indexOf(38);
                if (indexOf > 0) {
                    this.f40856b = this.f40856b.substring(0, indexOf);
                }
                Locale locale3 = Locale.US;
                this.d.getClass();
                String c13 = f71.c(this, "https://api.twitch.tv/kraken/streams/" + this.f40856b + "?stream_type=all", hashMap, false);
                if (isCancelled()) {
                    return null;
                }
                try {
                    new JSONObject(c13).getJSONObject("stream");
                    JSONObject jSONObject3 = new JSONObject(f71.c(this, "https://api.twitch.tv/api/channels/" + this.f40856b + "/access_token", hashMap, false));
                    String encode = URLEncoder.encode(jSONObject3.getString("sig"), "UTF-8");
                    String encode2 = URLEncoder.encode(jSONObject3.getString("token"), "UTF-8");
                    URLEncoder.encode("https://youtube.googleapis.com/v/" + this.f40856b, "UTF-8");
                    String str2 = this.f40856b;
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
                String[] strArr5 = this.f40857c;
                Locale locale4 = Locale.US;
                this.d.getClass();
                String c14 = f71.c(this, "https://player.vimeo.com/video/" + this.f40856b + "/config", null, true);
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
        switch (this.f40855a) {
            case 0:
                String str = (String) obj;
                f71 f71Var = this.d;
                if (str != null) {
                    f71Var.f33535x = true;
                    f71Var.f33536y = str;
                    f71Var.D = this.f40857c[1];
                    if (f71Var.f33533s) {
                        f71Var.i();
                    }
                    f71Var.j(false, true);
                    f71Var.f33525f0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    f71Var.h();
                    return;
                } else {
                    return;
                }
            case 1:
                String str2 = (String) obj;
                f71 f71Var2 = this.d;
                if (str2 != null) {
                    f71Var2.f33535x = true;
                    f71Var2.f33536y = str2;
                    String[] strArr = this.f40857c;
                    f71Var2.D = strArr[1];
                    f71Var2.E = strArr[2];
                    f71Var2.F = strArr[3];
                    if (f71Var2.f33533s) {
                        f71Var2.i();
                    }
                    f71Var2.j(false, true);
                    f71Var2.f33525f0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    f71Var2.h();
                    return;
                } else {
                    return;
                }
            case 2:
                String str3 = (String) obj;
                f71 f71Var3 = this.d;
                if (str3 != null) {
                    f71Var3.f33535x = true;
                    f71Var3.f33536y = str3;
                    f71Var3.D = this.f40857c[1];
                    if (f71Var3.f33533s) {
                        f71Var3.i();
                    }
                    f71Var3.j(false, true);
                    f71Var3.f33525f0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    f71Var3.h();
                    return;
                } else {
                    return;
                }
            case 3:
                String str4 = (String) obj;
                f71 f71Var4 = this.d;
                if (str4 != null) {
                    f71Var4.f33535x = true;
                    f71Var4.f33536y = str4;
                    f71Var4.D = this.f40857c[1];
                    if (f71Var4.f33533s) {
                        f71Var4.i();
                    }
                    f71Var4.j(false, true);
                    f71Var4.f33525f0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    f71Var4.h();
                    return;
                } else {
                    return;
                }
            default:
                String str5 = (String) obj;
                f71 f71Var5 = this.d;
                if (str5 != null) {
                    f71Var5.f33535x = true;
                    f71Var5.f33536y = str5;
                    f71Var5.D = this.f40857c[1];
                    if (f71Var5.f33533s) {
                        f71Var5.i();
                    }
                    f71Var5.j(false, true);
                    f71Var5.f33525f0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    f71Var5.h();
                    return;
                } else {
                    return;
                }
        }
    }
}
