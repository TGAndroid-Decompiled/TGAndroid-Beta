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
public final class ap extends vk0 {
    public final org.telegram.ui.ActionBar.b6 f26876c;
    public ArrayList d;
    public WeakReference f26877e;
    public int f26878f;
    public final int h;
    public final int f26879n;
    public final long f26880r;
    public final HashMap f26881s;
    public final HashMap v;

    public ap(int i9, long j10, org.telegram.ui.ActionBar.b6 b6Var, int i10) {
        this.f26878f = -1;
        this.f26881s = new HashMap();
        this.v = new HashMap();
        this.f26879n = i10;
        this.f26880r = j10;
        this.f26876c = b6Var;
        this.h = i9;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    public final void E(int i9) {
        a11 a11Var;
        int i10 = this.f26878f;
        if (i10 == i9) {
            return;
        }
        if (i10 >= 0) {
            m(i10);
            WeakReference weakReference = this.f26877e;
            if (weakReference == null) {
                a11Var = null;
            } else {
                a11Var = (a11) weakReference.get();
            }
            if (a11Var != null) {
                a11Var.setSelected(false);
            }
        }
        this.f26878f = i9;
        m(i9);
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
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        boolean z11;
        FileInputStream fileInputStream;
        int s10;
        int intValue;
        String[] split;
        a11 a11Var = (a11) q1Var.f5501a;
        org.telegram.ui.ActionBar.e6 j10 = ((bp) this.d.get(i9)).f27261a.j(((bp) this.d.get(i9)).f27263c);
        if (j10 != null && j10.f22908b != null && !j10.P && new File(j10.f22908b).exists() && j10.f22908b != null) {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(new File(j10.f22908b));
                int i10 = 0;
                boolean z12 = false;
                while (true) {
                    try {
                        int read = fileInputStream2.read(org.telegram.ui.Cells.ma.f24719e3);
                        if (read != -1) {
                            int i11 = i10;
                            int i12 = 0;
                            int i13 = 0;
                            while (true) {
                                if (i12 < read) {
                                    byte[] bArr = org.telegram.ui.Cells.ma.f24719e3;
                                    if (bArr[i12] == 10) {
                                        int i14 = i12 - i13;
                                        int i15 = i14 + 1;
                                        String str = new String(bArr, i13, i14, "UTF-8");
                                        if (str.startsWith("WLS=")) {
                                            String substring = str.substring(4);
                                            Uri parse = Uri.parse(substring);
                                            j10.f22913e = parse.getQueryParameter("slug");
                                            File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                                            StringBuilder sb2 = new StringBuilder();
                                            fileInputStream = fileInputStream2;
                                            try {
                                                sb2.append(Utilities.MD5(substring));
                                                sb2.append(".wp");
                                                j10.f22910c = new File(filesDirFixed, sb2.toString()).getAbsolutePath();
                                                String queryParameter = parse.getQueryParameter("mode");
                                                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                                    int i16 = 0;
                                                    while (true) {
                                                        if (i16 >= split.length) {
                                                            break;
                                                        } else if ("blur".equals(split[i16])) {
                                                            j10.h = true;
                                                            break;
                                                        } else {
                                                            i16++;
                                                        }
                                                    }
                                                }
                                                if (!TextUtils.isEmpty(parse.getQueryParameter("pattern"))) {
                                                    try {
                                                        String queryParameter2 = parse.getQueryParameter("bg_color");
                                                        if (!TextUtils.isEmpty(queryParameter2)) {
                                                            j10.f22918r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                                            if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                                                j10.f22919s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                                            }
                                                            if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                                                j10.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                                            }
                                                            if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                                                j10.f22920w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                                            }
                                                        }
                                                    } catch (Exception unused) {
                                                    }
                                                    try {
                                                        String queryParameter3 = parse.getQueryParameter("rotation");
                                                        if (!TextUtils.isEmpty(queryParameter3)) {
                                                            j10.f22921x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                                        }
                                                    } catch (Exception unused2) {
                                                    }
                                                    String queryParameter4 = parse.getQueryParameter("intensity");
                                                    if (!TextUtils.isEmpty(queryParameter4)) {
                                                        j10.f22922y = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                                                    }
                                                    if (j10.f22922y == 0) {
                                                        j10.f22922y = 50;
                                                    }
                                                }
                                                i13 += i15;
                                                i11 += i15;
                                            } catch (Throwable th) {
                                                th = th;
                                                Throwable th2 = th;
                                                fileInputStream.close();
                                                throw th2;
                                            }
                                        } else {
                                            fileInputStream = fileInputStream2;
                                            if (str.startsWith("WPS")) {
                                                j10.L = i15 + i11;
                                                z12 = true;
                                                break;
                                            }
                                            int indexOf = str.indexOf(61);
                                            if (indexOf != -1 && ((s10 = org.telegram.ui.ActionBar.e5.s(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.f6.f23252ra || s10 == org.telegram.ui.ActionBar.f6.Aa || s10 == org.telegram.ui.ActionBar.f6.Nd || s10 == org.telegram.ui.ActionBar.f6.Od || s10 == org.telegram.ui.ActionBar.f6.Pd || s10 == org.telegram.ui.ActionBar.f6.Qd)) {
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
                                                if (s10 == org.telegram.ui.ActionBar.f6.f23252ra) {
                                                    j10.M = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.f6.Aa) {
                                                    j10.N = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.f6.Nd) {
                                                    j10.H = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.f6.Od) {
                                                    j10.I = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.f6.Pd) {
                                                    j10.J = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.f6.Qd) {
                                                    j10.K = intValue;
                                                }
                                            }
                                            i13 += i15;
                                            i11 += i15;
                                        }
                                    } else {
                                        fileInputStream = fileInputStream2;
                                    }
                                    i12++;
                                    fileInputStream2 = fileInputStream;
                                } else {
                                    fileInputStream = fileInputStream2;
                                    break;
                                }
                            }
                            if (z12 || i10 == i11) {
                                break;
                            }
                            fileInputStream.getChannel().position(i11);
                            i10 = i11;
                            fileInputStream2 = fileInputStream;
                        } else {
                            fileInputStream = fileInputStream2;
                            break;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileInputStream = fileInputStream2;
                    }
                }
                fileInputStream.close();
            } catch (Throwable th4) {
                FileLog.e(th4);
            }
            if (j10.f22910c != null && !j10.f22915f && !new File(j10.f22910c).exists()) {
                HashMap hashMap = this.v;
                if (!hashMap.containsKey(j10)) {
                    hashMap.put(j10, j10.f22913e);
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = j10.f22913e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(j10.A).sendRequest(getwallpaper, new org.telegram.ui.rc(14, this, j10));
                }
            } else {
                j10.P = true;
            }
        }
        bp bpVar = (bp) this.d.get(i9);
        bp bpVar2 = a11Var.C;
        if (bpVar2 != null && nf.b.a(bpVar2.f27261a.f22750c, bpVar.f27261a.f22750c) && !org.telegram.ui.dy.f37625t4 && a11Var.R == bpVar.f27263c) {
            z10 = true;
        } else {
            z10 = false;
        }
        a11Var.setFocusable(true);
        a11Var.setEnabled(true);
        a11Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23091i5, false));
        a11Var.f(bpVar, this.f26880r, z10);
        if (i9 == this.f26878f) {
            z11 = true;
        } else {
            z11 = false;
        }
        a11Var.g(z11, z10);
        if (i9 == this.f26878f) {
            this.f26877e = new WeakReference(a11Var);
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        Context context = viewGroup.getContext();
        org.telegram.ui.ActionBar.b6 b6Var = this.f26876c;
        return new f2.q1(new a11(this.h, this.f26879n, context, b6Var));
    }

    public ap(int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        this(i9, 0L, b6Var, i10);
    }
}
