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
public final class np extends yl0 {
    public final org.telegram.ui.ActionBar.d6 f29039c;
    public ArrayList d;
    public WeakReference f29040e;
    public int f29041f;
    public final int h;
    public final int f29042n;
    public final long f29043r;
    public final HashMap f29044s;
    public final HashMap v;

    public np(int i10, long j3, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
        this.f29041f = -1;
        this.f29044s = new HashMap();
        this.v = new HashMap();
        this.f29042n = i11;
        this.f29043r = j3;
        this.f29039c = d6Var;
        this.h = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void E(int i10) {
        s21 s21Var;
        int i11 = this.f29041f;
        if (i11 == i10) {
            return;
        }
        if (i11 >= 0) {
            m(i11);
            WeakReference weakReference = this.f29040e;
            if (weakReference == null) {
                s21Var = null;
            } else {
                s21Var = (s21) weakReference.get();
            }
            if (s21Var != null) {
                s21Var.setSelected(false);
            }
        }
        this.f29041f = i10;
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
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        FileInputStream fileInputStream;
        int s10;
        int intValue;
        String[] split;
        s21 s21Var = (s21) c1Var.f46531a;
        org.telegram.ui.ActionBar.h6 j3 = ((op) this.d.get(i10)).f29428a.j(((op) this.d.get(i10)).f29430c);
        if (j3 != null && j3.f20694b != null && !j3.T && new File(j3.f20694b).exists() && j3.f20694b != null) {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(new File(j3.f20694b));
                int i11 = 0;
                boolean z12 = false;
                while (true) {
                    try {
                        int read = fileInputStream2.read(org.telegram.ui.Cells.pa.f22664p3);
                        if (read != -1) {
                            int i12 = i11;
                            int i13 = 0;
                            int i14 = 0;
                            while (true) {
                                if (i13 < read) {
                                    byte[] bArr = org.telegram.ui.Cells.pa.f22664p3;
                                    if (bArr[i13] == 10) {
                                        int i15 = i13 - i14;
                                        int i16 = i15 + 1;
                                        String str = new String(bArr, i14, i15, "UTF-8");
                                        if (str.startsWith("WLS=")) {
                                            String substring = str.substring(4);
                                            Uri parse = Uri.parse(substring);
                                            j3.f20699e = parse.getQueryParameter("slug");
                                            File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                                            StringBuilder sb2 = new StringBuilder();
                                            fileInputStream = fileInputStream2;
                                            try {
                                                sb2.append(Utilities.MD5(substring));
                                                sb2.append(".wp");
                                                j3.f20696c = new File(filesDirFixed, sb2.toString()).getAbsolutePath();
                                                String queryParameter = parse.getQueryParameter("mode");
                                                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                                    int i17 = 0;
                                                    while (true) {
                                                        if (i17 >= split.length) {
                                                            break;
                                                        } else if ("blur".equals(split[i17])) {
                                                            j3.h = true;
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
                                                            j3.f20708r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                                            if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                                                j3.f20709s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                                            }
                                                            if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                                                j3.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                                            }
                                                            if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                                                j3.f20710w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                                            }
                                                        }
                                                    } catch (Exception unused) {
                                                    }
                                                    try {
                                                        String queryParameter3 = parse.getQueryParameter("rotation");
                                                        if (!TextUtils.isEmpty(queryParameter3)) {
                                                            j3.f20711x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                                        }
                                                    } catch (Exception unused2) {
                                                    }
                                                    String queryParameter4 = parse.getQueryParameter("intensity");
                                                    if (!TextUtils.isEmpty(queryParameter4)) {
                                                        j3.f20712y = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                                                    }
                                                    if (j3.f20712y == 0) {
                                                        j3.f20712y = 50;
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
                                                j3.P = i16 + i12;
                                                z12 = true;
                                                break;
                                            }
                                            int indexOf = str.indexOf(61);
                                            if (indexOf != -1 && ((s10 = org.telegram.ui.ActionBar.f5.s(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.i6.f21086ra || s10 == org.telegram.ui.ActionBar.i6.Aa || s10 == org.telegram.ui.ActionBar.i6.Nd || s10 == org.telegram.ui.ActionBar.i6.Od || s10 == org.telegram.ui.ActionBar.i6.Pd || s10 == org.telegram.ui.ActionBar.i6.Qd)) {
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
                                                if (s10 == org.telegram.ui.ActionBar.i6.f21086ra) {
                                                    j3.Q = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.i6.Aa) {
                                                    j3.R = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.i6.Nd) {
                                                    j3.L = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.i6.Od) {
                                                    j3.M = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.i6.Pd) {
                                                    j3.N = intValue;
                                                } else if (s10 == org.telegram.ui.ActionBar.i6.Qd) {
                                                    j3.O = intValue;
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
                            if (z12 || i11 == i12) {
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
            if (j3.f20696c != null && !j3.f20701f && !new File(j3.f20696c).exists()) {
                HashMap hashMap = this.v;
                if (!hashMap.containsKey(j3)) {
                    hashMap.put(j3, j3.f20699e);
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = j3.f20699e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(j3.E).sendRequest(getwallpaper, new org.telegram.ui.no(7, this, j3));
                }
            } else {
                j3.T = true;
            }
        }
        op opVar = (op) this.d.get(i10);
        op opVar2 = s21Var.G;
        if (opVar2 != null && fg.b.a(opVar2.f29428a.f20506c, opVar.f29428a.f20506c) && !org.telegram.ui.uy.f41373v4 && s21Var.V == opVar.f29430c) {
            z10 = true;
        } else {
            z10 = false;
        }
        s21Var.setFocusable(true);
        s21Var.setEnabled(true);
        s21Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20912i5, false));
        s21Var.f(opVar, this.f29043r, z10);
        if (i10 == this.f29041f) {
            z11 = true;
        } else {
            z11 = false;
        }
        s21Var.g(z11, z10);
        if (i10 == this.f29041f) {
            this.f29040e = new WeakReference(s21Var);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        org.telegram.ui.ActionBar.d6 d6Var = this.f29039c;
        return new s4.c1(new s21(this.h, this.f29042n, context, d6Var));
    }

    public np(int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        this(i10, 0L, d6Var, i11);
    }
}
