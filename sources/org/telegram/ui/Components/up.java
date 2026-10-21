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
public final class up extends im0 {
    public final org.telegram.ui.ActionBar.d6 f30992c;
    public ArrayList d;
    public WeakReference e;
    public final int h;
    public final int f30994n;
    public final long f30995r;
    public int f30993f = -1;
    public final HashMap f30996s = new HashMap();
    public final HashMap v = new HashMap();

    public up(int i10, long j10, org.telegram.ui.on onVar, int i11) {
        this.f30994n = i11;
        this.f30995r = j10;
        this.f30992c = onVar;
        this.h = i10;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    public final void E(int i10) {
        r21 r21Var;
        int i11 = this.f30993f;
        if (i11 == i10) {
            return;
        }
        if (i11 >= 0) {
            m(i11);
            WeakReference weakReference = this.e;
            if (weakReference == null) {
                r21Var = null;
            } else {
                r21Var = (r21) weakReference.get();
            }
            if (r21Var != null) {
                r21Var.setSelected(false);
            }
        }
        this.f30993f = i10;
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
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        boolean z11;
        FileInputStream fileInputStream;
        char c10;
        int v;
        int intValue;
        String[] split;
        r21 r21Var = (r21) b1Var.f45917a;
        org.telegram.ui.ActionBar.g6 i11 = ((vp) this.d.get(i10)).f31850a.i(((vp) this.d.get(i10)).f31852c);
        if (i11 != null && i11.f20883b != null && !i11.T && new File(i11.f20883b).exists() && i11.f20883b != null) {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(new File(i11.f20883b));
                int i12 = 0;
                boolean z12 = false;
                while (true) {
                    try {
                        int read = fileInputStream2.read(org.telegram.ui.Cells.ma.f22611g3);
                        if (read != -1) {
                            int i13 = i12;
                            int i14 = 0;
                            int i15 = 0;
                            while (true) {
                                if (i14 < read) {
                                    byte[] bArr = org.telegram.ui.Cells.ma.f22611g3;
                                    if (bArr[i14] == 10) {
                                        int i16 = i14 - i15;
                                        int i17 = i16 + 1;
                                        String str = new String(bArr, i15, i16, "UTF-8");
                                        if (str.startsWith("WLS=")) {
                                            String substring = str.substring(4);
                                            Uri parse = Uri.parse(substring);
                                            i11.e = parse.getQueryParameter("slug");
                                            File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                                            StringBuilder sb2 = new StringBuilder();
                                            fileInputStream = fileInputStream2;
                                            try {
                                                sb2.append(Utilities.MD5(substring));
                                                sb2.append(".wp");
                                                i11.f20885c = new File(filesDirFixed, sb2.toString()).getAbsolutePath();
                                                String queryParameter = parse.getQueryParameter("mode");
                                                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                                    int i18 = 0;
                                                    while (true) {
                                                        if (i18 >= split.length) {
                                                            break;
                                                        } else if ("blur".equals(split[i18])) {
                                                            i11.h = true;
                                                            break;
                                                        } else {
                                                            i18++;
                                                        }
                                                    }
                                                }
                                                if (!TextUtils.isEmpty(parse.getQueryParameter("pattern"))) {
                                                    try {
                                                        String queryParameter2 = parse.getQueryParameter("bg_color");
                                                        if (!TextUtils.isEmpty(queryParameter2)) {
                                                            i11.f20896r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                                            if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                                                i11.f20897s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                                            }
                                                            if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                                                i11.v = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                                            }
                                                            if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                                                i11.f20898w = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                                            }
                                                        }
                                                    } catch (Exception unused) {
                                                    }
                                                    try {
                                                        String queryParameter3 = parse.getQueryParameter("rotation");
                                                        if (!TextUtils.isEmpty(queryParameter3)) {
                                                            i11.f20899x = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                                                        }
                                                    } catch (Exception unused2) {
                                                    }
                                                    String queryParameter4 = parse.getQueryParameter("intensity");
                                                    if (!TextUtils.isEmpty(queryParameter4)) {
                                                        i11.f20900y = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                                                    }
                                                    if (i11.f20900y == 0) {
                                                        i11.f20900y = 50;
                                                    }
                                                }
                                                c10 = 65535;
                                                i15 += i17;
                                                i13 += i17;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                Throwable th3 = th;
                                                fileInputStream.close();
                                                throw th3;
                                            }
                                        } else {
                                            fileInputStream = fileInputStream2;
                                            if (str.startsWith("WPS")) {
                                                i11.P = i17 + i13;
                                                z12 = true;
                                                break;
                                            }
                                            int indexOf = str.indexOf(61);
                                            c10 = 65535;
                                            if (indexOf != -1 && ((v = org.telegram.ui.ActionBar.g5.v(str.substring(0, indexOf))) == org.telegram.ui.ActionBar.h6.f21251ra || v == org.telegram.ui.ActionBar.h6.Aa || v == org.telegram.ui.ActionBar.h6.Nd || v == org.telegram.ui.ActionBar.h6.Od || v == org.telegram.ui.ActionBar.h6.Pd || v == org.telegram.ui.ActionBar.h6.Qd)) {
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
                                                if (v == org.telegram.ui.ActionBar.h6.f21251ra) {
                                                    i11.Q = intValue;
                                                } else if (v == org.telegram.ui.ActionBar.h6.Aa) {
                                                    i11.R = intValue;
                                                } else if (v == org.telegram.ui.ActionBar.h6.Nd) {
                                                    i11.L = intValue;
                                                } else if (v == org.telegram.ui.ActionBar.h6.Od) {
                                                    i11.M = intValue;
                                                } else if (v == org.telegram.ui.ActionBar.h6.Pd) {
                                                    i11.N = intValue;
                                                } else if (v == org.telegram.ui.ActionBar.h6.Qd) {
                                                    i11.O = intValue;
                                                }
                                            }
                                            i15 += i17;
                                            i13 += i17;
                                        }
                                    } else {
                                        fileInputStream = fileInputStream2;
                                        c10 = 65535;
                                    }
                                    i14++;
                                    fileInputStream2 = fileInputStream;
                                } else {
                                    fileInputStream = fileInputStream2;
                                    break;
                                }
                            }
                            if (z12 || i12 == i13) {
                                break;
                            }
                            fileInputStream.getChannel().position(i13);
                            i12 = i13;
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
            if (i11.f20885c != null && !i11.f20889f && !new File(i11.f20885c).exists()) {
                HashMap hashMap = this.v;
                if (!hashMap.containsKey(i11)) {
                    hashMap.put(i11, i11.e);
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = i11.e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(i11.E).sendRequest(getwallpaper, new org.telegram.ui.vc(14, this, i11));
                }
            } else {
                i11.T = true;
            }
        }
        vp vpVar = (vp) this.d.get(i10);
        vp vpVar2 = r21Var.G;
        if (vpVar2 != null && gg.b.a(vpVar2.f31850a.f20725c, vpVar.f31850a.f20725c) && !org.telegram.ui.cy.f36067x4 && r21Var.V == vpVar.f31852c) {
            z10 = true;
        } else {
            z10 = false;
        }
        r21Var.setFocusable(true);
        r21Var.setEnabled(true);
        r21Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21078i5, false));
        r21Var.f(vpVar, this.f30995r, z10);
        if (i10 == this.f30993f) {
            z11 = true;
        } else {
            z11 = false;
        }
        r21Var.g(z11, z10);
        if (i10 == this.f30993f) {
            this.e = new WeakReference(r21Var);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        org.telegram.ui.ActionBar.d6 d6Var = this.f30992c;
        return new s4.b1(new r21(this.h, this.f30994n, context, d6Var));
    }
}
