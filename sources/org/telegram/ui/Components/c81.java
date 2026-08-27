package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;

public final class c81 extends AsyncTask {

    public final int f27376a;

    public String f27377b;

    public final String[] f27378c;
    public final i81 d;

    public c81(i81 i81Var, String str, int i10) {
        this.f27376a = i10;
        switch (i10) {
            case 1:
                this.d = i81Var;
                this.f27378c = new String[4];
                this.f27377b = str;
                break;
            case 2:
                this.d = i81Var;
                this.f27378c = new String[2];
                this.f27377b = str;
                break;
            case 3:
                this.d = i81Var;
                this.f27378c = new String[2];
                this.f27377b = str;
                break;
            case 4:
                this.d = i81Var;
                this.f27378c = new String[2];
                this.f27377b = str;
                break;
            default:
                this.d = i81Var;
                this.f27378c = new String[2];
                this.f27377b = str;
                break;
        }
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        switch (this.f27376a) {
            case 0:
                String[] strArr = this.f27378c;
                Locale locale = Locale.US;
                String str = "http://www.aparat.com/video/video/embed/vt/frame/showvideo/yes/videohash/" + this.f27377b;
                this.d.getClass();
                String strC = i81.c(this, str, null, true);
                if (isCancelled()) {
                    return null;
                }
                try {
                    Matcher matcher = i81.f29285n0.matcher(strC);
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
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr[0];
            case 1:
                String[] strArr2 = this.f27378c;
                Locale locale2 = Locale.US;
                String str2 = "https://coub.com/api/v2/coubs/" + this.f27377b + ".json";
                this.d.getClass();
                String strC2 = i81.c(this, str2, null, true);
                if (isCancelled()) {
                    return null;
                }
                try {
                    JSONObject jSONObject2 = new JSONObject(strC2).getJSONObject("file_versions").getJSONObject("mobile");
                    String string = jSONObject2.getString("video");
                    String string2 = jSONObject2.getJSONArray("audio").getString(0);
                    if (string != null && string2 != null) {
                        strArr2[0] = string;
                        strArr2[1] = "other";
                        strArr2[2] = string2;
                        strArr2[3] = "other";
                    }
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr2[0];
            case 2:
                String[] strArr3 = this.f27378c;
                String str3 = this.f27377b;
                this.d.getClass();
                String strC3 = i81.c(this, str3, null, false);
                if (isCancelled()) {
                    return null;
                }
                try {
                    Matcher matcher2 = i81.f29286o0.matcher(strC3);
                    if (matcher2.find()) {
                        strArr3[0] = new JSONObject(matcher2.group(1)).getJSONArray("quality_options").getJSONObject(0).getString("source");
                        strArr3[1] = "other";
                    }
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr3[0];
            case 3:
                String[] strArr4 = this.f27378c;
                HashMap map = new HashMap();
                map.put("Client-ID", "jzkbprff40iqj646a697cyrvl0zt2m6");
                int iIndexOf = this.f27377b.indexOf(38);
                if (iIndexOf > 0) {
                    this.f27377b = this.f27377b.substring(0, iIndexOf);
                }
                Locale locale3 = Locale.US;
                String str4 = "https://api.twitch.tv/kraken/streams/" + this.f27377b + "?stream_type=all";
                this.d.getClass();
                String strC4 = i81.c(this, str4, map, false);
                if (isCancelled()) {
                    return null;
                }
                try {
                    new JSONObject(strC4).getJSONObject("stream");
                    JSONObject jSONObject3 = new JSONObject(i81.c(this, "https://api.twitch.tv/api/channels/" + this.f27377b + "/access_token", map, false));
                    String strEncode = URLEncoder.encode(jSONObject3.getString("sig"), "UTF-8");
                    String strEncode2 = URLEncoder.encode(jSONObject3.getString("token"), "UTF-8");
                    URLEncoder.encode("https://youtube.googleapis.com/v/" + this.f27377b, "UTF-8");
                    String str5 = "allow_source=true&allow_audio_only=true&allow_spectre=true&player=twitchweb&segment_preference=4&p=" + ((int) (Math.random() * 1.0E7d)) + "&sig=" + strEncode + "&token=" + strEncode2;
                    strArr4[0] = "https://usher.ttvnw.net/api/channel/hls/" + this.f27377b + ".m3u8?" + str5;
                    strArr4[1] = "hls";
                    break;
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr4[0];
            default:
                String[] strArr5 = this.f27378c;
                Locale locale4 = Locale.US;
                String str6 = "https://player.vimeo.com/video/" + this.f27377b + "/config";
                this.d.getClass();
                String strC5 = i81.c(this, str6, null, true);
                if (isCancelled()) {
                    return null;
                }
                try {
                    JSONObject jSONObject4 = new JSONObject(strC5).getJSONObject("request").getJSONObject("files");
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
                    break;
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
        switch (this.f27376a) {
            case 0:
                String str = (String) obj;
                i81 i81Var = this.d;
                if (str != null) {
                    i81Var.f29310w = true;
                    i81Var.f29311x = str;
                    i81Var.f29312y = this.f27378c[1];
                    if (i81Var.f29309s) {
                        i81Var.i();
                    }
                    i81Var.j(false, true);
                    i81Var.f29298b0.d(true, true);
                } else if (!isCancelled()) {
                    i81Var.h();
                }
                break;
            case 1:
                String str2 = (String) obj;
                i81 i81Var2 = this.d;
                if (str2 != null) {
                    i81Var2.f29310w = true;
                    i81Var2.f29311x = str2;
                    String[] strArr = this.f27378c;
                    i81Var2.f29312y = strArr[1];
                    i81Var2.A = strArr[2];
                    i81Var2.B = strArr[3];
                    if (i81Var2.f29309s) {
                        i81Var2.i();
                    }
                    i81Var2.j(false, true);
                    i81Var2.f29298b0.d(true, true);
                } else if (!isCancelled()) {
                    i81Var2.h();
                }
                break;
            case 2:
                String str3 = (String) obj;
                i81 i81Var3 = this.d;
                if (str3 != null) {
                    i81Var3.f29310w = true;
                    i81Var3.f29311x = str3;
                    i81Var3.f29312y = this.f27378c[1];
                    if (i81Var3.f29309s) {
                        i81Var3.i();
                    }
                    i81Var3.j(false, true);
                    i81Var3.f29298b0.d(true, true);
                } else if (!isCancelled()) {
                    i81Var3.h();
                }
                break;
            case 3:
                String str4 = (String) obj;
                i81 i81Var4 = this.d;
                if (str4 != null) {
                    i81Var4.f29310w = true;
                    i81Var4.f29311x = str4;
                    i81Var4.f29312y = this.f27378c[1];
                    if (i81Var4.f29309s) {
                        i81Var4.i();
                    }
                    i81Var4.j(false, true);
                    i81Var4.f29298b0.d(true, true);
                } else if (!isCancelled()) {
                    i81Var4.h();
                }
                break;
            default:
                String str5 = (String) obj;
                i81 i81Var5 = this.d;
                if (str5 != null) {
                    i81Var5.f29310w = true;
                    i81Var5.f29311x = str5;
                    i81Var5.f29312y = this.f27378c[1];
                    if (i81Var5.f29309s) {
                        i81Var5.i();
                    }
                    i81Var5.j(false, true);
                    i81Var5.f29298b0.d(true, true);
                } else if (!isCancelled()) {
                    i81Var5.h();
                }
                break;
        }
    }
}
