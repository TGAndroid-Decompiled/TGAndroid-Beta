package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
public final class i91 extends AsyncTask {
    public final int f23960a;
    public String f23961b;
    public final String[] f23962c;
    public final o91 d;

    public i91(o91 o91Var, String str, int i10) {
        this.f23960a = i10;
        switch (i10) {
            case 1:
                this.d = o91Var;
                this.f23962c = new String[4];
                this.f23961b = str;
                return;
            case 2:
                this.d = o91Var;
                this.f23962c = new String[2];
                this.f23961b = str;
                return;
            case 3:
                this.d = o91Var;
                this.f23962c = new String[2];
                this.f23961b = str;
                return;
            case 4:
                this.d = o91Var;
                this.f23962c = new String[2];
                this.f23961b = str;
                return;
            default:
                this.d = o91Var;
                this.f23962c = new String[2];
                this.f23961b = str;
                return;
        }
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        switch (this.f23960a) {
            case 0:
                Void[] voidArr = (Void[]) objArr;
                String[] strArr = this.f23962c;
                Locale locale = Locale.US;
                this.d.getClass();
                String c10 = o91.c(this, "http://www.aparat.com/video/video/embed/vt/frame/showvideo/yes/videohash/" + this.f23961b, null, true);
                if (isCancelled()) {
                    return null;
                }
                try {
                    Matcher matcher = o91.f25706r0.matcher(c10);
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
                String[] strArr2 = this.f23962c;
                Locale locale2 = Locale.US;
                this.d.getClass();
                String c11 = o91.c(this, "https://coub.com/api/v2/coubs/" + this.f23961b + ".json", null, true);
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
                String[] strArr3 = this.f23962c;
                String str = this.f23961b;
                this.d.getClass();
                String c12 = o91.c(this, str, null, false);
                if (isCancelled()) {
                    return null;
                }
                try {
                    Matcher matcher2 = o91.f25707s0.matcher(c12);
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
                String[] strArr4 = this.f23962c;
                HashMap hashMap = new HashMap();
                hashMap.put("Client-ID", "jzkbprff40iqj646a697cyrvl0zt2m6");
                int indexOf = this.f23961b.indexOf(38);
                if (indexOf > 0) {
                    this.f23961b = this.f23961b.substring(0, indexOf);
                }
                Locale locale3 = Locale.US;
                this.d.getClass();
                String c13 = o91.c(this, "https://api.twitch.tv/kraken/streams/" + this.f23961b + "?stream_type=all", hashMap, false);
                if (isCancelled()) {
                    return null;
                }
                try {
                    new JSONObject(c13).getJSONObject("stream");
                    JSONObject jSONObject3 = new JSONObject(o91.c(this, "https://api.twitch.tv/api/channels/" + this.f23961b + "/access_token", hashMap, false));
                    String encode = URLEncoder.encode(jSONObject3.getString("sig"), "UTF-8");
                    String encode2 = URLEncoder.encode(jSONObject3.getString("token"), "UTF-8");
                    URLEncoder.encode("https://youtube.googleapis.com/v/" + this.f23961b, "UTF-8");
                    String str2 = this.f23961b;
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
                String[] strArr5 = this.f23962c;
                Locale locale4 = Locale.US;
                this.d.getClass();
                String c14 = o91.c(this, "https://player.vimeo.com/video/" + this.f23961b + "/config", null, true);
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
        switch (this.f23960a) {
            case 0:
                String str = (String) obj;
                o91 o91Var = this.d;
                if (str != null) {
                    o91Var.f25733w = true;
                    o91Var.f25734x = str;
                    o91Var.f25735y = this.f23962c[1];
                    if (o91Var.f25732s) {
                        o91Var.i();
                    }
                    o91Var.j(false, true);
                    o91Var.f25724f0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    o91Var.h();
                    return;
                } else {
                    return;
                }
            case 1:
                String str2 = (String) obj;
                o91 o91Var2 = this.d;
                if (str2 != null) {
                    o91Var2.f25733w = true;
                    o91Var2.f25734x = str2;
                    String[] strArr = this.f23962c;
                    o91Var2.f25735y = strArr[1];
                    o91Var2.E = strArr[2];
                    o91Var2.F = strArr[3];
                    if (o91Var2.f25732s) {
                        o91Var2.i();
                    }
                    o91Var2.j(false, true);
                    o91Var2.f25724f0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    o91Var2.h();
                    return;
                } else {
                    return;
                }
            case 2:
                String str3 = (String) obj;
                o91 o91Var3 = this.d;
                if (str3 != null) {
                    o91Var3.f25733w = true;
                    o91Var3.f25734x = str3;
                    o91Var3.f25735y = this.f23962c[1];
                    if (o91Var3.f25732s) {
                        o91Var3.i();
                    }
                    o91Var3.j(false, true);
                    o91Var3.f25724f0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    o91Var3.h();
                    return;
                } else {
                    return;
                }
            case 3:
                String str4 = (String) obj;
                o91 o91Var4 = this.d;
                if (str4 != null) {
                    o91Var4.f25733w = true;
                    o91Var4.f25734x = str4;
                    o91Var4.f25735y = this.f23962c[1];
                    if (o91Var4.f25732s) {
                        o91Var4.i();
                    }
                    o91Var4.j(false, true);
                    o91Var4.f25724f0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    o91Var4.h();
                    return;
                } else {
                    return;
                }
            default:
                String str5 = (String) obj;
                o91 o91Var5 = this.d;
                if (str5 != null) {
                    o91Var5.f25733w = true;
                    o91Var5.f25734x = str5;
                    o91Var5.f25735y = this.f23962c[1];
                    if (o91Var5.f25732s) {
                        o91Var5.i();
                    }
                    o91Var5.j(false, true);
                    o91Var5.f25724f0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    o91Var5.h();
                    return;
                } else {
                    return;
                }
        }
    }
}
