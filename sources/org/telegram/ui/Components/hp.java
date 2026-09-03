package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class hp extends ql0 {
    public final org.telegram.ui.ActionBar.f6 f25467c;
    public ArrayList d;
    public WeakReference e;
    public int f25468f;
    public final int h;
    public final int f25469n;
    public final long f25470r;
    public final HashMap f25471s;
    public final HashMap v;

    public hp(int i10, long j10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        this.f25468f = -1;
        this.f25471s = new HashMap();
        this.v = new HashMap();
        this.f25469n = i11;
        this.f25470r = j10;
        this.f25467c = f6Var;
        this.h = i10;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    public final void E(int i10) {
        w11 w11Var;
        int i11 = this.f25468f;
        if (i11 == i10) {
            return;
        }
        if (i11 >= 0) {
            m(i11);
            WeakReference weakReference = this.e;
            if (weakReference == null) {
                w11Var = null;
            } else {
                w11Var = (w11) weakReference.get();
            }
            if (w11Var != null) {
                w11Var.setSelected(false);
            }
        }
        this.f25468f = i10;
        m(i10);
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.d;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        boolean z10;
        FileInputStream fileInputStream;
        int s6;
        int intValue;
        String[] split;
        w11 w11Var = (w11) l1Var.f5774a;
        org.telegram.ui.ActionBar.i6 j10 = ((ip) this.d.get(i10)).f25749a.j(((ip) this.d.get(i10)).f25751c);
        if (j10 != null && j10.f19782b != null && !j10.Q && new File(j10.f19782b).exists() && j10.f19782b != null) {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(new File(j10.f19782b));
                int i11 = 0;
                boolean z11 = false;
                while (true) {
                    try {
                        int read = fileInputStream2.read(org.telegram.ui.Cells.ka.f21296f3);
                        if (read != -1) {
                            int i12 = i11;
                            int i13 = 0;
                            int i14 = 0;
                            while (true) {
                                if (i13 < read) {
                                    byte[] bArr = org.telegram.ui.Cells.ka.f21296f3;
                                    if (bArr[i13] == 10) {
                                        int i15 = i13 - i14;
                                        int i16 = i15 + 1;
                                        String str = new String(bArr, i14, i15, "UTF-8");
                                        if (str.startsWith("WLS=")) {
                                            String substring = str.substring(4);
                                            Uri parse = Uri.parse(substring);
                                            j10.e = parse.getQueryParameter("slug");
                                            File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                                            StringBuilder sb = new StringBuilder();
                                            fileInputStream = fileInputStream2;
                                            try {
                                                sb.append(Utilities.MD5(substring));
                                                sb.append(".wp");
                                                j10.f19784c = new File(filesDirFixed, sb.toString()).getAbsolutePath();
                                                String queryParameter = parse.getQueryParameter("mode");
                                                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                                    int i17 = 0;
                                                    while (true) {
                                                        if (i17 >= split.length) {
                                                            break;
                                                        } else if ("blur".equals(split[i17])) {
                                                            j10.h = true;
                                                            break;
                                                        } else {
                                                            i17++;
                                                        }
                                                    }
                                                }
                                                if (!TextUtils.isEmpty(parse.getQueryParameter("pattern"))) {
                                                    try {
                                                        String queryParameter2 = parse.getQueryParameter("bg_color");
                                                        if (!TextUtils.isEmpty(queryParameter2)) {
                                                            j10.f19792r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                                            if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                                                j10.f19793s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                                            }
                                                            if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                                                j10.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                                            }
                                                            if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                                                j10.f19794w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                                            }
                                                        }
                                                    } catch (Exception unused) {
                                                    }
                                                    try {
                                                        String queryParameter3 = parse.getQueryParameter("rotation");
                                                        if (!TextUtils.isEmpty(queryParameter3)) {
                                                            j10.f19795x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                                        }
                                                    } catch (Exception unused2) {
                                                    }
                                                    String queryParameter4 = parse.getQueryParameter("intensity");
                                                    if (!TextUtils.isEmpty(queryParameter4)) {
                                                        j10.f19796y = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                                                    }
                                                    if (j10.f19796y == 0) {
                                                        j10.f19796y = 50;
                                                    }
                                                }
                                                i14 += i16;
                                                i12 += i16;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                Throwable th3 = th;
                                                fileInputStream.close();
                                                throw th3;
                                            }
                                        } else {
                                            fileInputStream = fileInputStream2;
                                            if (str.startsWith("WPS")) {
                                                j10.M = i16 + i12;
                                                z11 = true;
                                                break;
                                            }
                                            int indexOf = str.indexOf(61);
                                            if (indexOf != -1 && ((s6 = org.telegram.ui.ActionBar.h5.s(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.j6.f20136ra || s6 == org.telegram.ui.ActionBar.j6.Aa || s6 == org.telegram.ui.ActionBar.j6.Nd || s6 == org.telegram.ui.ActionBar.j6.Od || s6 == org.telegram.ui.ActionBar.j6.Pd || s6 == org.telegram.ui.ActionBar.j6.Qd)) {
                                                String substring2 = str.substring(indexOf + 1);
                                                if (substring2.length() > 0 && substring2.charAt(0) == '#') {
                                                    try {
                                                        intValue = Color.parseColor(substring2);
                                                    } catch (Exception unused3) {
                                                        intValue = Utilities.parseInt((CharSequence) substring2).intValue();
                                                    }
                                                } else {
                                                    intValue = Utilities.parseInt((CharSequence) substring2).intValue();
                                                }
                                                if (s6 == org.telegram.ui.ActionBar.j6.f20136ra) {
                                                    j10.N = intValue;
                                                } else if (s6 == org.telegram.ui.ActionBar.j6.Aa) {
                                                    j10.O = intValue;
                                                } else if (s6 == org.telegram.ui.ActionBar.j6.Nd) {
                                                    j10.I = intValue;
                                                } else if (s6 == org.telegram.ui.ActionBar.j6.Od) {
                                                    j10.J = intValue;
                                                } else if (s6 == org.telegram.ui.ActionBar.j6.Pd) {
                                                    j10.K = intValue;
                                                } else if (s6 == org.telegram.ui.ActionBar.j6.Qd) {
                                                    j10.L = intValue;
                                                }
                                            }
                                            i14 += i16;
                                            i12 += i16;
                                        }
                                    } else {
                                        fileInputStream = fileInputStream2;
                                    }
                                    i13++;
                                    fileInputStream2 = fileInputStream;
                                } else {
                                    fileInputStream = fileInputStream2;
                                    break;
                                }
                            }
                            if (z11 || i11 == i12) {
                                break;
                            }
                            fileInputStream.getChannel().position(i12);
                            i11 = i12;
                            fileInputStream2 = fileInputStream;
                        } else {
                            fileInputStream = fileInputStream2;
                            break;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        fileInputStream = fileInputStream2;
                    }
                }
                fileInputStream.close();
            } catch (Throwable th5) {
                FileLog.e(th5);
            }
            if (j10.f19784c != null && !j10.f19788f && !new File(j10.f19784c).exists()) {
                HashMap hashMap = this.v;
                if (!hashMap.containsKey(j10)) {
                    hashMap.put(j10, j10.e);
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = j10.e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(j10.B).sendRequest(getwallpaper, new org.telegram.ui.no(7, this, j10));
                }
            } else {
                j10.Q = true;
            }
        }
        ip ipVar = (ip) this.d.get(i10);
        ip ipVar2 = w11Var.D;
        if (ipVar2 != null && sf.b.a(ipVar2.f25749a.f19640c, ipVar.f25749a.f19640c) && !org.telegram.ui.qy.f37517u4 && w11Var.S == ipVar.f25751c) {
            z4 = true;
        } else {
            z4 = false;
        }
        w11Var.setFocusable(true);
        w11Var.setEnabled(true);
        w11Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19970i5, false));
        w11Var.f(ipVar, this.f25470r, z4);
        if (i10 == this.f25468f) {
            z10 = true;
        } else {
            z10 = false;
        }
        w11Var.g(z10, z4);
        if (i10 == this.f25468f) {
            this.e = new WeakReference(w11Var);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        org.telegram.ui.ActionBar.f6 f6Var = this.f25467c;
        return new f2.l1(new w11(this.h, this.f25469n, context, f6Var));
    }

    public hp(int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        this(i10, 0L, f6Var, i11);
    }
}
