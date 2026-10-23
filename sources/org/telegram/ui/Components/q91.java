package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
public final class q91 extends AsyncTask {
    public final int f29510a;
    public String f29511b;
    public final String[] f29512c;
    public final w91 d;

    public q91(w91 w91Var, String str, int i10) {
        this.f29510a = i10;
        switch (i10) {
            case 1:
                this.d = w91Var;
                this.f29512c = new String[4];
                this.f29511b = str;
                return;
            case 2:
                this.d = w91Var;
                this.f29512c = new String[2];
                this.f29511b = str;
                return;
            case 3:
                this.d = w91Var;
                this.f29512c = new String[2];
                this.f29511b = str;
                return;
            case 4:
                this.d = w91Var;
                this.f29512c = new String[2];
                this.f29511b = str;
                return;
            default:
                this.d = w91Var;
                this.f29512c = new String[2];
                this.f29511b = str;
                return;
        }
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        switch (this.f29510a) {
            case 0:
                Void[] voidArr = (Void[]) objArr;
                String[] strArr = this.f29512c;
                Locale locale = Locale.US;
                this.d.getClass();
                String c10 = w91.c(this, "http://www.aparat.com/video/video/embed/vt/frame/showvideo/yes/videohash/" + this.f29511b, null, true);
                if (isCancelled()) {
                    return null;
                }
                try {
                    Matcher matcher = w91.f32012r0.matcher(c10);
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
                String[] strArr2 = this.f29512c;
                Locale locale2 = Locale.US;
                this.d.getClass();
                String c11 = w91.c(this, "https://coub.com/api/v2/coubs/" + this.f29511b + ".json", null, true);
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
                String[] strArr3 = this.f29512c;
                String str = this.f29511b;
                this.d.getClass();
                String c12 = w91.c(this, str, null, false);
                if (isCancelled()) {
                    return null;
                }
                try {
                    Matcher matcher2 = w91.f32013s0.matcher(c12);
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
                String[] strArr4 = this.f29512c;
                HashMap hashMap = new HashMap();
                hashMap.put("Client-ID", "jzkbprff40iqj646a697cyrvl0zt2m6");
                int indexOf = this.f29511b.indexOf(38);
                if (indexOf > 0) {
                    this.f29511b = this.f29511b.substring(0, indexOf);
                }
                Locale locale3 = Locale.US;
                this.d.getClass();
                String c13 = w91.c(this, "https://api.twitch.tv/kraken/streams/" + this.f29511b + "?stream_type=all", hashMap, false);
                if (isCancelled()) {
                    return null;
                }
                try {
                    new JSONObject(c13).getJSONObject("stream");
                    JSONObject jSONObject3 = new JSONObject(w91.c(this, "https://api.twitch.tv/api/channels/" + this.f29511b + "/access_token", hashMap, false));
                    String encode = URLEncoder.encode(jSONObject3.getString("sig"), "UTF-8");
                    String encode2 = URLEncoder.encode(jSONObject3.getString("token"), "UTF-8");
                    URLEncoder.encode("https://youtube.googleapis.com/v/" + this.f29511b, "UTF-8");
                    String str2 = this.f29511b;
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
                String[] strArr5 = this.f29512c;
                Locale locale4 = Locale.US;
                this.d.getClass();
                String c14 = w91.c(this, "https://player.vimeo.com/video/" + this.f29511b + "/config", null, true);
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
        switch (this.f29510a) {
            case 0:
                String str = (String) obj;
                w91 w91Var = this.d;
                if (str != null) {
                    w91Var.f32039w = true;
                    w91Var.f32040x = str;
                    w91Var.f32041y = this.f29512c[1];
                    if (w91Var.f32038s) {
                        w91Var.i();
                    }
                    w91Var.j(false, true);
                    w91Var.f32030f0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    w91Var.h();
                    return;
                } else {
                    return;
                }
            case 1:
                String str2 = (String) obj;
                w91 w91Var2 = this.d;
                if (str2 != null) {
                    w91Var2.f32039w = true;
                    w91Var2.f32040x = str2;
                    String[] strArr = this.f29512c;
                    w91Var2.f32041y = strArr[1];
                    w91Var2.E = strArr[2];
                    w91Var2.F = strArr[3];
                    if (w91Var2.f32038s) {
                        w91Var2.i();
                    }
                    w91Var2.j(false, true);
                    w91Var2.f32030f0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    w91Var2.h();
                    return;
                } else {
                    return;
                }
            case 2:
                String str3 = (String) obj;
                w91 w91Var3 = this.d;
                if (str3 != null) {
                    w91Var3.f32039w = true;
                    w91Var3.f32040x = str3;
                    w91Var3.f32041y = this.f29512c[1];
                    if (w91Var3.f32038s) {
                        w91Var3.i();
                    }
                    w91Var3.j(false, true);
                    w91Var3.f32030f0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    w91Var3.h();
                    return;
                } else {
                    return;
                }
            case 3:
                String str4 = (String) obj;
                w91 w91Var4 = this.d;
                if (str4 != null) {
                    w91Var4.f32039w = true;
                    w91Var4.f32040x = str4;
                    w91Var4.f32041y = this.f29512c[1];
                    if (w91Var4.f32038s) {
                        w91Var4.i();
                    }
                    w91Var4.j(false, true);
                    w91Var4.f32030f0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    w91Var4.h();
                    return;
                } else {
                    return;
                }
            default:
                String str5 = (String) obj;
                w91 w91Var5 = this.d;
                if (str5 != null) {
                    w91Var5.f32039w = true;
                    w91Var5.f32040x = str5;
                    w91Var5.f32041y = this.f29512c[1];
                    if (w91Var5.f32038s) {
                        w91Var5.i();
                    }
                    w91Var5.j(false, true);
                    w91Var5.f32030f0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    w91Var5.h();
                    return;
                } else {
                    return;
                }
        }
    }
}
