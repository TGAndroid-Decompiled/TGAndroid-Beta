package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
public final class z81 extends AsyncTask {
    public final int f33828a;
    public String f33829b;
    public final String[] f33830c;
    public final f91 d;

    public z81(f91 f91Var, String str, int i10) {
        this.f33828a = i10;
        switch (i10) {
            case 1:
                this.d = f91Var;
                this.f33830c = new String[4];
                this.f33829b = str;
                return;
            case 2:
                this.d = f91Var;
                this.f33830c = new String[2];
                this.f33829b = str;
                return;
            case 3:
                this.d = f91Var;
                this.f33830c = new String[2];
                this.f33829b = str;
                return;
            case 4:
                this.d = f91Var;
                this.f33830c = new String[2];
                this.f33829b = str;
                return;
            default:
                this.d = f91Var;
                this.f33830c = new String[2];
                this.f33829b = str;
                return;
        }
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        switch (this.f33828a) {
            case 0:
                Void[] voidArr = (Void[]) objArr;
                String[] strArr = this.f33830c;
                Locale locale = Locale.US;
                this.d.getClass();
                String c3 = f91.c(this, "http://www.aparat.com/video/video/embed/vt/frame/showvideo/yes/videohash/" + this.f33829b, null, true);
                if (isCancelled()) {
                    return null;
                }
                try {
                    Matcher matcher = f91.f26802o0.matcher(c3);
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
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr[0];
            case 1:
                Void[] voidArr2 = (Void[]) objArr;
                String[] strArr2 = this.f33830c;
                Locale locale2 = Locale.US;
                this.d.getClass();
                String c10 = f91.c(this, "https://coub.com/api/v2/coubs/" + this.f33829b + ".json", null, true);
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
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr2[0];
            case 2:
                Void[] voidArr3 = (Void[]) objArr;
                String[] strArr3 = this.f33830c;
                String str = this.f33829b;
                this.d.getClass();
                String c11 = f91.c(this, str, null, false);
                if (isCancelled()) {
                    return null;
                }
                try {
                    Matcher matcher2 = f91.f26803p0.matcher(c11);
                    if (matcher2.find()) {
                        strArr3[0] = new JSONObject(matcher2.group(1)).getJSONArray("quality_options").getJSONObject(0).getString("source");
                        strArr3[1] = "other";
                    }
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr3[0];
            case 3:
                Void[] voidArr4 = (Void[]) objArr;
                String[] strArr4 = this.f33830c;
                HashMap hashMap = new HashMap();
                hashMap.put("Client-ID", "jzkbprff40iqj646a697cyrvl0zt2m6");
                int indexOf = this.f33829b.indexOf(38);
                if (indexOf > 0) {
                    this.f33829b = this.f33829b.substring(0, indexOf);
                }
                Locale locale3 = Locale.US;
                this.d.getClass();
                String c12 = f91.c(this, "https://api.twitch.tv/kraken/streams/" + this.f33829b + "?stream_type=all", hashMap, false);
                if (isCancelled()) {
                    return null;
                }
                try {
                    new JSONObject(c12).getJSONObject("stream");
                    JSONObject jSONObject3 = new JSONObject(f91.c(this, "https://api.twitch.tv/api/channels/" + this.f33829b + "/access_token", hashMap, false));
                    String encode = URLEncoder.encode(jSONObject3.getString("sig"), "UTF-8");
                    String encode2 = URLEncoder.encode(jSONObject3.getString("token"), "UTF-8");
                    URLEncoder.encode("https://youtube.googleapis.com/v/" + this.f33829b, "UTF-8");
                    String str2 = this.f33829b;
                    strArr4[0] = "https://usher.ttvnw.net/api/channel/hls/" + str2 + ".m3u8?" + ("allow_source=true&allow_audio_only=true&allow_spectre=true&player=twitchweb&segment_preference=4&p=" + ((int) (Math.random() * 1.0E7d)) + "&sig=" + encode + "&token=" + encode2);
                    strArr4[1] = "hls";
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr4[0];
            default:
                Void[] voidArr5 = (Void[]) objArr;
                String[] strArr5 = this.f33830c;
                Locale locale4 = Locale.US;
                this.d.getClass();
                String c13 = f91.c(this, "https://player.vimeo.com/video/" + this.f33829b + "/config", null, true);
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
                } catch (Exception e13) {
                    FileLog.e(e13);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr5[0];
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        switch (this.f33828a) {
            case 0:
                String str = (String) obj;
                f91 f91Var = this.d;
                if (str != null) {
                    f91Var.f26828w = true;
                    f91Var.f26829x = str;
                    f91Var.f26830y = this.f33830c[1];
                    if (f91Var.f26827s) {
                        f91Var.i();
                    }
                    f91Var.j(false, true);
                    f91Var.f26817c0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    f91Var.h();
                    return;
                } else {
                    return;
                }
            case 1:
                String str2 = (String) obj;
                f91 f91Var2 = this.d;
                if (str2 != null) {
                    f91Var2.f26828w = true;
                    f91Var2.f26829x = str2;
                    String[] strArr = this.f33830c;
                    f91Var2.f26830y = strArr[1];
                    f91Var2.B = strArr[2];
                    f91Var2.C = strArr[3];
                    if (f91Var2.f26827s) {
                        f91Var2.i();
                    }
                    f91Var2.j(false, true);
                    f91Var2.f26817c0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    f91Var2.h();
                    return;
                } else {
                    return;
                }
            case 2:
                String str3 = (String) obj;
                f91 f91Var3 = this.d;
                if (str3 != null) {
                    f91Var3.f26828w = true;
                    f91Var3.f26829x = str3;
                    f91Var3.f26830y = this.f33830c[1];
                    if (f91Var3.f26827s) {
                        f91Var3.i();
                    }
                    f91Var3.j(false, true);
                    f91Var3.f26817c0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    f91Var3.h();
                    return;
                } else {
                    return;
                }
            case 3:
                String str4 = (String) obj;
                f91 f91Var4 = this.d;
                if (str4 != null) {
                    f91Var4.f26828w = true;
                    f91Var4.f26829x = str4;
                    f91Var4.f26830y = this.f33830c[1];
                    if (f91Var4.f26827s) {
                        f91Var4.i();
                    }
                    f91Var4.j(false, true);
                    f91Var4.f26817c0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    f91Var4.h();
                    return;
                } else {
                    return;
                }
            default:
                String str5 = (String) obj;
                f91 f91Var5 = this.d;
                if (str5 != null) {
                    f91Var5.f26828w = true;
                    f91Var5.f26829x = str5;
                    f91Var5.f26830y = this.f33830c[1];
                    if (f91Var5.f26827s) {
                        f91Var5.i();
                    }
                    f91Var5.j(false, true);
                    f91Var5.f26817c0.d(true, true);
                    return;
                } else if (!isCancelled()) {
                    f91Var5.h();
                    return;
                } else {
                    return;
                }
        }
    }
}
