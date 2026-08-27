package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import org.json.JSONTokener;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

public final class h81 extends AsyncTask {

    public final String f28941a;

    public final CountDownLatch f28942b = new CountDownLatch(1);

    public final String[] f28943c = new String[2];
    public String d;

    public final i81 f28944e;

    public h81(i81 i81Var, String str) {
        this.f28944e = i81Var;
        this.f28941a = str;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        String[] strArr;
        char c10;
        String str;
        boolean z10;
        int i10;
        char c11;
        char c12;
        Object obj;
        boolean z11;
        String strConcat;
        String str2;
        String strGroup;
        ?? r10;
        boolean z12;
        boolean z13;
        i81 i81Var = this.f28944e;
        String str3 = "https://www.youtube.com/embed/" + this.f28941a;
        i81Var.getClass();
        HashMap map = null;
        boolean z14 = true;
        String strC = i81.c(this, str3, null, true);
        if (isCancelled()) {
            return null;
        }
        String strP = a9.p.p(new StringBuilder("video_id="), this.f28941a, "&ps=default&gl=US&hl=en");
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strP);
            sb2.append("&eurl=");
            sb2.append(URLEncoder.encode("https://youtube.googleapis.com/v/" + this.f28941a, "UTF-8"));
            strP = sb2.toString();
            while (true) {
                int i11 = 2;
                if (i10 >= 5) {
                    c11 = 0;
                    c12 = 1;
                    break;
                }
                i81 i81Var2 = this.f28944e;
                String str4 = "https://www.youtube.com/get_video_info?" + strP + strArr[i10];
                i81Var2.getClass();
                String strC2 = i81.c(this, str4, map, z14);
                if (isCancelled()) {
                    return map;
                }
                if (strC2 != null) {
                    String[] strArrSplit = strC2.split("&");
                    Object objDecode = map;
                    String str5 = str;
                    int i12 = 0;
                    z12 = false;
                    z13 = false;
                    boolean z15 = z10;
                    ?? r11 = z14;
                    while (i12 < strArrSplit.length) {
                        if (strArrSplit[i12].startsWith("dashmpd")) {
                            String[] strArrSplit2 = strArrSplit[i12].split("=");
                            if (strArrSplit2.length == i11) {
                                try {
                                    this.f28943c[c10] = URLDecoder.decode(strArrSplit2[r11], "UTF-8");
                                } catch (Exception e9) {
                                    FileLog.e(e9);
                                }
                            }
                            z13 = true;
                        } else {
                            if (strArrSplit[i12].startsWith("url_encoded_fmt_stream_map")) {
                                String[] strArrSplit3 = strArrSplit[i12].split("=");
                                if (strArrSplit3.length == i11) {
                                    try {
                                        String[] strArrSplit4 = URLDecoder.decode(strArrSplit3[r11], "UTF-8").split("[&,]");
                                        int i13 = 0;
                                        String strDecode = null;
                                        boolean z16 = false;
                                        while (i13 < strArrSplit4.length) {
                                            try {
                                                String[] strArrSplit5 = strArrSplit4[i13].split("=");
                                                String[] strArr2 = strArrSplit4;
                                                int i14 = i13;
                                                if (strArrSplit5[0].startsWith("type")) {
                                                    if (URLDecoder.decode(strArrSplit5[1], "UTF-8").contains("video/mp4")) {
                                                        z16 = true;
                                                    }
                                                } else if (strArrSplit5[0].startsWith("url")) {
                                                    strDecode = URLDecoder.decode(strArrSplit5[1], "UTF-8");
                                                } else if (strArrSplit5[0].startsWith("itag")) {
                                                    strDecode = null;
                                                    z16 = false;
                                                }
                                                if (z16 && strDecode != null) {
                                                    str5 = strDecode;
                                                    break;
                                                }
                                                i13 = i14 + 1;
                                                strArrSplit4 = strArr2;
                                            } catch (Exception e10) {
                                                e = e10;
                                                FileLog.e(e);
                                            }
                                        }
                                    } catch (Exception e11) {
                                        e = e11;
                                    }
                                }
                            } else if (strArrSplit[i12].startsWith("use_cipher_signature")) {
                                String[] strArrSplit6 = strArrSplit[i12].split("=");
                                if (strArrSplit6.length == 2 && strArrSplit6[1].toLowerCase().equals("true")) {
                                    z15 = true;
                                }
                            } else if (strArrSplit[i12].startsWith("hlsvp")) {
                                String[] strArrSplit7 = strArrSplit[i12].split("=");
                                if (strArrSplit7.length == 2) {
                                    try {
                                        objDecode = URLDecoder.decode(strArrSplit7[1], "UTF-8");
                                    } catch (Exception e12) {
                                        FileLog.e(e12);
                                    }
                                }
                            } else if (strArrSplit[i12].startsWith("livestream")) {
                                String[] strArrSplit8 = strArrSplit[i12].split("=");
                                if (strArrSplit8.length == 2 && strArrSplit8[1].toLowerCase().equals("1")) {
                                    z12 = true;
                                }
                            }
                            i12++;
                            r11 = 1;
                            c10 = 0;
                            i11 = 2;
                        }
                        i12++;
                        r11 = 1;
                        c10 = 0;
                        i11 = 2;
                    }
                    z10 = z15;
                    str = str5;
                    r10 = objDecode;
                } else {
                    r10 = 0;
                    z12 = false;
                    z13 = false;
                }
                c11 = 0;
                c12 = 1;
                if (z12) {
                    if (r10 == 0 || z10 || r10.contains("/s/")) {
                        return null;
                    }
                    ?? r12 = this.f28943c;
                    r12[0] = r10;
                    r12[1] = "hls";
                }
                if (z13) {
                    break;
                }
                i10++;
                map = null;
                z14 = true;
                c10 = 0;
            }
        } catch (Exception e13) {
            FileLog.e(e13);
        }
        if (strC != null) {
            Matcher matcher = i81.f29287p0.matcher(strC);
            if (matcher.find()) {
                StringBuilder sbF = s3.c.f(strP, "&sts=");
                sbF.append(strC.substring(matcher.start() + 6, matcher.end()));
                strP = sbF.toString();
            } else {
                strP = s3.c.l(strP, "&sts=");
            }
        }
        this.f28943c[1] = "dash";
        strArr = new String[]{"", "&el=leanback", "&el=embedded", "&el=detailpage", "&el=vevo"};
        c10 = 0;
        str = null;
        z10 = false;
        i10 = 0;
        String[] strArr3 = this.f28943c;
        if (strArr3[c11] == null && str != null) {
            strArr3[c11] = str;
            strArr3[c12] = "other";
        }
        String str6 = strArr3[c11];
        if (str6 != null && ((z10 || str6.contains("/s/")) && strC != null)) {
            int iIndexOf = this.f28943c[c11].indexOf("/s/");
            int iIndexOf2 = this.f28943c[c11].indexOf(47, iIndexOf + 10);
            if (iIndexOf == -1) {
                obj = null;
                z11 = true;
            } else {
                if (iIndexOf2 == -1) {
                    iIndexOf2 = this.f28943c[c11].length();
                }
                this.d = this.f28943c[c11].substring(iIndexOf, iIndexOf2);
                Matcher matcher2 = i81.f29288q0.matcher(strC);
                if (matcher2.find()) {
                    try {
                        Object objNextValue = new JSONTokener(matcher2.group(1)).nextValue();
                        if (objNextValue instanceof String) {
                            strConcat = (String) objNextValue;
                        } else {
                            strConcat = null;
                        }
                    } catch (Exception e14) {
                        FileLog.e(e14);
                    }
                } else {
                    strConcat = null;
                }
                if (strConcat != null) {
                    Matcher matcher3 = i81.f29294w0.matcher(strConcat);
                    if (matcher3.find()) {
                        str2 = matcher3.group(1) + matcher3.group(2);
                    } else {
                        str2 = null;
                    }
                    z11 = false;
                    SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("youtubecode", 0);
                    String strO = null;
                    if (str2 != null) {
                        String string = sharedPreferences.getString(str2, null);
                        strGroup = sharedPreferences.getString(str2.concat("n"), null);
                        strO = string;
                    } else {
                        strGroup = null;
                    }
                    if (strO == null) {
                        if (strConcat.startsWith("//")) {
                            strConcat = "https:".concat(strConcat);
                        } else if (strConcat.startsWith("/")) {
                            strConcat = "https://www.youtube.com".concat(strConcat);
                        }
                        this.f28944e.getClass();
                        obj = null;
                        String strC3 = i81.c(this, strConcat, null, true);
                        if (!isCancelled()) {
                            if (strC3 != null) {
                                Matcher matcher4 = i81.f29289r0.matcher(strC3);
                                if (matcher4.find()) {
                                    strGroup = matcher4.group(1);
                                } else {
                                    Matcher matcher5 = i81.f29290s0.matcher(strC3);
                                    if (matcher5.find()) {
                                        strGroup = matcher5.group(1);
                                    }
                                }
                                if (strGroup != null) {
                                    try {
                                        strO = new com.google.firebase.messaging.t(strC3).o(strGroup);
                                        if (!TextUtils.isEmpty(strO) && str2 != null) {
                                            sharedPreferences.edit().putString(str2, strO).putString(str2 + "n", strGroup).commit();
                                        }
                                    } catch (Exception e15) {
                                        FileLog.e(e15);
                                    }
                                }
                            }
                        }
                    } else {
                        obj = null;
                    }
                    if (!TextUtils.isEmpty(strO)) {
                        try {
                            AndroidUtilities.runOnUIThread(new r61(1, this, strO + strGroup + "('" + this.d.substring(3) + "');"));
                            this.f28942b.await();
                        } catch (Exception e16) {
                            FileLog.e(e16);
                            z11 = true;
                        }
                    }
                } else {
                    obj = null;
                }
                z11 = true;
            }
            return obj;
        }
        obj = null;
        z11 = z10;
        if (!isCancelled() && !z11) {
            return this.f28943c;
        }
        return obj;
    }

    @Override
    public final void onPostExecute(Object obj) {
        String[] strArr = (String[]) obj;
        String str = strArr[0];
        i81 i81Var = this.f28944e;
        if (str == null) {
            if (isCancelled()) {
                return;
            }
            i81Var.h();
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb2 = new StringBuilder("start play youtube video ");
            sb2.append(strArr[1]);
            sb2.append(" ");
            org.telegram.ui.Cells.pa.v(strArr[0], sb2);
        }
        i81Var.f29310w = true;
        i81Var.f29311x = strArr[0];
        String str2 = strArr[1];
        i81Var.f29312y = str2;
        if (str2.equals("hls")) {
            i81Var.D = true;
        }
        if (i81Var.f29309s) {
            i81Var.i();
        }
        i81Var.j(false, true);
        i81Var.f29298b0.d(true, true);
    }
}
