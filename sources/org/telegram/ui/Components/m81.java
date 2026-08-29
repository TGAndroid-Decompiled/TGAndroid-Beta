package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
public final class m81 extends AsyncTask {
    public final int f30598a;
    public String f30599b;
    public final String[] f30600c;
    public final s81 d;

    public m81(s81 s81Var, String str, int i10) {
        this.f30598a = i10;
        switch (i10) {
            case 1:
                this.d = s81Var;
                this.f30600c = new String[4];
                this.f30599b = str;
                return;
            case 2:
                this.d = s81Var;
                this.f30600c = new String[2];
                this.f30599b = str;
                return;
            case 3:
                this.d = s81Var;
                this.f30600c = new String[2];
                this.f30599b = str;
                return;
            case 4:
                this.d = s81Var;
                this.f30600c = new String[2];
                this.f30599b = str;
                return;
            default:
                this.d = s81Var;
                this.f30600c = new String[2];
                this.f30599b = str;
                return;
        }
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        switch (this.f30598a) {
            case 0:
                Void[] voidArr = (Void[]) objArr;
                String[] strArr = this.f30600c;
                Locale locale = Locale.US;
                this.d.getClass();
                String c3 = s81.c(this, "http://www.aparat.com/video/video/embed/vt/frame/showvideo/yes/videohash/" + this.f30599b, null, true);
                if (isCancelled()) {
                    return null;
                }
                try {
                    Matcher matcher = s81.f32559n0.matcher(c3);
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
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr[0];
            case 1:
                Void[] voidArr2 = (Void[]) objArr;
                String[] strArr2 = this.f30600c;
                Locale locale2 = Locale.US;
                this.d.getClass();
                String c6 = s81.c(this, "https://coub.com/api/v2/coubs/" + this.f30599b + ".json", null, true);
                if (isCancelled()) {
                    return null;
                }
                try {
                    JSONObject jSONObject2 = new JSONObject(c6).getJSONObject("file_versions").getJSONObject("mobile");
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
                String[] strArr3 = this.f30600c;
                String str = this.f30599b;
                this.d.getClass();
                String c10 = s81.c(this, str, null, false);
                if (isCancelled()) {
                    return null;
                }
                try {
                    Matcher matcher2 = s81.f32560o0.matcher(c10);
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
                String[] strArr4 = this.f30600c;
                HashMap hashMap = new HashMap();
                hashMap.put("Client-ID", "jzkbprff40iqj646a697cyrvl0zt2m6");
                int indexOf = this.f30599b.indexOf(38);
                if (indexOf > 0) {
                    this.f30599b = this.f30599b.substring(0, indexOf);
                }
                Locale locale3 = Locale.US;
                this.d.getClass();
                String c11 = s81.c(this, "https://api.twitch.tv/kraken/streams/" + this.f30599b + "?stream_type=all", hashMap, false);
                if (isCancelled()) {
                    return null;
                }
                try {
                    new JSONObject(c11).getJSONObject("stream");
                    JSONObject jSONObject3 = new JSONObject(s81.c(this, "https://api.twitch.tv/api/channels/" + this.f30599b + "/access_token", hashMap, false));
                    String encode = URLEncoder.encode(jSONObject3.getString("sig"), "UTF-8");
                    String encode2 = URLEncoder.encode(jSONObject3.getString("token"), "UTF-8");
                    URLEncoder.encode("https://youtube.googleapis.com/v/" + this.f30599b, "UTF-8");
                    String str2 = this.f30599b;
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
                String[] strArr5 = this.f30600c;
                Locale locale4 = Locale.US;
                this.d.getClass();
                String c12 = s81.c(this, "https://player.vimeo.com/video/" + this.f30599b + "/config", null, true);
                if (isCancelled()) {
                    return null;
                }
                try {
                    JSONObject jSONObject4 = new JSONObject(c12).getJSONObject("request").getJSONObject("files");
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
        switch (this.f30598a) {
            case 0:
                String str = (String) obj;
                s81 s81Var = this.d;
                if (str != null) {
                    s81Var.f32584w = true;
                    s81Var.f32585x = str;
                    s81Var.f32586y = this.f30600c[1];
                    if (s81Var.f32583s) {
                        s81Var.i();
                    }
                    s81Var.j(false, true);
                    s81Var.f32572b0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    s81Var.h();
                    return;
                } else {
                    return;
                }
            case 1:
                String str2 = (String) obj;
                s81 s81Var2 = this.d;
                if (str2 != null) {
                    s81Var2.f32584w = true;
                    s81Var2.f32585x = str2;
                    String[] strArr = this.f30600c;
                    s81Var2.f32586y = strArr[1];
                    s81Var2.A = strArr[2];
                    s81Var2.B = strArr[3];
                    if (s81Var2.f32583s) {
                        s81Var2.i();
                    }
                    s81Var2.j(false, true);
                    s81Var2.f32572b0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    s81Var2.h();
                    return;
                } else {
                    return;
                }
            case 2:
                String str3 = (String) obj;
                s81 s81Var3 = this.d;
                if (str3 != null) {
                    s81Var3.f32584w = true;
                    s81Var3.f32585x = str3;
                    s81Var3.f32586y = this.f30600c[1];
                    if (s81Var3.f32583s) {
                        s81Var3.i();
                    }
                    s81Var3.j(false, true);
                    s81Var3.f32572b0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    s81Var3.h();
                    return;
                } else {
                    return;
                }
            case 3:
                String str4 = (String) obj;
                s81 s81Var4 = this.d;
                if (str4 != null) {
                    s81Var4.f32584w = true;
                    s81Var4.f32585x = str4;
                    s81Var4.f32586y = this.f30600c[1];
                    if (s81Var4.f32583s) {
                        s81Var4.i();
                    }
                    s81Var4.j(false, true);
                    s81Var4.f32572b0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    s81Var4.h();
                    return;
                } else {
                    return;
                }
            default:
                String str5 = (String) obj;
                s81 s81Var5 = this.d;
                if (str5 != null) {
                    s81Var5.f32584w = true;
                    s81Var5.f32585x = str5;
                    s81Var5.f32586y = this.f30600c[1];
                    if (s81Var5.f32583s) {
                        s81Var5.i();
                    }
                    s81Var5.j(false, true);
                    s81Var5.f32572b0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    s81Var5.h();
                    return;
                } else {
                    return;
                }
        }
    }
}
