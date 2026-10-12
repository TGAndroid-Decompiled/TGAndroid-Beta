package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
public final class w91 extends AsyncTask {
    public final int f30836a;
    public String f30837b;
    public final String[] f30838c;
    public final ca1 d;

    public w91(ca1 ca1Var, String str, int i10) {
        this.f30836a = i10;
        switch (i10) {
            case 1:
                this.d = ca1Var;
                this.f30838c = new String[4];
                this.f30837b = str;
                return;
            case 2:
                this.d = ca1Var;
                this.f30838c = new String[2];
                this.f30837b = str;
                return;
            case 3:
                this.d = ca1Var;
                this.f30838c = new String[2];
                this.f30837b = str;
                return;
            case 4:
                this.d = ca1Var;
                this.f30838c = new String[2];
                this.f30837b = str;
                return;
            default:
                this.d = ca1Var;
                this.f30838c = new String[2];
                this.f30837b = str;
                return;
        }
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        switch (this.f30836a) {
            case 0:
                Void[] voidArr = (Void[]) objArr;
                String[] strArr = this.f30838c;
                Locale locale = Locale.US;
                this.d.getClass();
                String c10 = ca1.c(this, "http://www.aparat.com/video/video/embed/vt/frame/showvideo/yes/videohash/" + this.f30837b, null, true);
                if (isCancelled()) {
                    return null;
                }
                try {
                    Matcher matcher = ca1.f23981r0.matcher(c10);
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
                    FileLog.e(e);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr[0];
            case 1:
                Void[] voidArr2 = (Void[]) objArr;
                String[] strArr2 = this.f30838c;
                Locale locale2 = Locale.US;
                this.d.getClass();
                String c11 = ca1.c(this, "https://coub.com/api/v2/coubs/" + this.f30837b + ".json", null, true);
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
                    FileLog.e(e7);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr2[0];
            case 2:
                Void[] voidArr3 = (Void[]) objArr;
                String[] strArr3 = this.f30838c;
                String str = this.f30837b;
                this.d.getClass();
                String c12 = ca1.c(this, str, null, false);
                if (isCancelled()) {
                    return null;
                }
                try {
                    Matcher matcher2 = ca1.f23982s0.matcher(c12);
                    if (matcher2.find()) {
                        strArr3[0] = new JSONObject(matcher2.group(1)).getJSONArray("quality_options").getJSONObject(0).getString("source");
                        strArr3[1] = "other";
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr3[0];
            case 3:
                Void[] voidArr4 = (Void[]) objArr;
                String[] strArr4 = this.f30838c;
                HashMap hashMap = new HashMap();
                hashMap.put("Client-ID", "jzkbprff40iqj646a697cyrvl0zt2m6");
                int indexOf = this.f30837b.indexOf(38);
                if (indexOf > 0) {
                    this.f30837b = this.f30837b.substring(0, indexOf);
                }
                Locale locale3 = Locale.US;
                this.d.getClass();
                String c13 = ca1.c(this, "https://api.twitch.tv/kraken/streams/" + this.f30837b + "?stream_type=all", hashMap, false);
                if (isCancelled()) {
                    return null;
                }
                try {
                    new JSONObject(c13).getJSONObject("stream");
                    JSONObject jSONObject3 = new JSONObject(ca1.c(this, "https://api.twitch.tv/api/channels/" + this.f30837b + "/access_token", hashMap, false));
                    String encode = URLEncoder.encode(jSONObject3.getString("sig"), "UTF-8");
                    String encode2 = URLEncoder.encode(jSONObject3.getString("token"), "UTF-8");
                    URLEncoder.encode("https://youtube.googleapis.com/v/" + this.f30837b, "UTF-8");
                    String str2 = this.f30837b;
                    strArr4[0] = "https://usher.ttvnw.net/api/channel/hls/" + str2 + ".m3u8?" + ("allow_source=true&allow_audio_only=true&allow_spectre=true&player=twitchweb&segment_preference=4&p=" + ((int) (Math.random() * 1.0E7d)) + "&sig=" + encode + "&token=" + encode2);
                    strArr4[1] = "hls";
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr4[0];
            default:
                Void[] voidArr5 = (Void[]) objArr;
                String[] strArr5 = this.f30838c;
                Locale locale4 = Locale.US;
                this.d.getClass();
                String c14 = ca1.c(this, "https://player.vimeo.com/video/" + this.f30837b + "/config", null, true);
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
                    FileLog.e(e12);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr5[0];
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        switch (this.f30836a) {
            case 0:
                String str = (String) obj;
                ca1 ca1Var = this.d;
                if (str != null) {
                    ca1Var.f24008w = true;
                    ca1Var.f24009x = str;
                    ca1Var.f24010y = this.f30838c[1];
                    if (ca1Var.f24007s) {
                        ca1Var.i();
                    }
                    ca1Var.j(false, true);
                    ca1Var.f23999f0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    ca1Var.h();
                    return;
                } else {
                    return;
                }
            case 1:
                String str2 = (String) obj;
                ca1 ca1Var2 = this.d;
                if (str2 != null) {
                    ca1Var2.f24008w = true;
                    ca1Var2.f24009x = str2;
                    String[] strArr = this.f30838c;
                    ca1Var2.f24010y = strArr[1];
                    ca1Var2.E = strArr[2];
                    ca1Var2.F = strArr[3];
                    if (ca1Var2.f24007s) {
                        ca1Var2.i();
                    }
                    ca1Var2.j(false, true);
                    ca1Var2.f23999f0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    ca1Var2.h();
                    return;
                } else {
                    return;
                }
            case 2:
                String str3 = (String) obj;
                ca1 ca1Var3 = this.d;
                if (str3 != null) {
                    ca1Var3.f24008w = true;
                    ca1Var3.f24009x = str3;
                    ca1Var3.f24010y = this.f30838c[1];
                    if (ca1Var3.f24007s) {
                        ca1Var3.i();
                    }
                    ca1Var3.j(false, true);
                    ca1Var3.f23999f0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    ca1Var3.h();
                    return;
                } else {
                    return;
                }
            case 3:
                String str4 = (String) obj;
                ca1 ca1Var4 = this.d;
                if (str4 != null) {
                    ca1Var4.f24008w = true;
                    ca1Var4.f24009x = str4;
                    ca1Var4.f24010y = this.f30838c[1];
                    if (ca1Var4.f24007s) {
                        ca1Var4.i();
                    }
                    ca1Var4.j(false, true);
                    ca1Var4.f23999f0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    ca1Var4.h();
                    return;
                } else {
                    return;
                }
            default:
                String str5 = (String) obj;
                ca1 ca1Var5 = this.d;
                if (str5 != null) {
                    ca1Var5.f24008w = true;
                    ca1Var5.f24009x = str5;
                    ca1Var5.f24010y = this.f30838c[1];
                    if (ca1Var5.f24007s) {
                        ca1Var5.i();
                    }
                    ca1Var5.j(false, true);
                    ca1Var5.f23999f0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    ca1Var5.h();
                    return;
                } else {
                    return;
                }
        }
    }
}
