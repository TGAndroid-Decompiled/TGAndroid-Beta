package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public final class jb1 implements xb1 {
    public final String f29582a;
    public final String f29583b;
    public final Context f29584c;
    public u7.s e;
    public yb1 f29585f;
    public vb1 f29586g;
    public pb1 h;
    public int f29587i;
    public int f29588j;
    public int f29589k;
    public boolean f29590l;
    public boolean f29592n;
    public boolean f29593o;
    public boolean f29594p;
    public int f29595q;
    public int f29596r;
    public String f29597s;
    public String f29598t;
    public String f29599u;
    public boolean f29591m = false;
    public final int d = 1;

    public jb1(Context context, String str, String str2) {
        this.f29584c = context.getApplicationContext();
        this.f29582a = str;
        this.f29583b = str2;
    }

    @Override
    public final void a(String str) {
        pb1 pb1Var = this.h;
        if (pb1Var != null) {
            if (pb1Var.E || (pb1Var.f31537w && pb1Var.D)) {
                pb1Var.f31519a.o(str);
            }
        }
    }

    @Override
    public final void b(boolean z10, boolean z11, boolean z12) {
        pb1 pb1Var = this.h;
        if (pb1Var != null && pb1Var.f31537w && !pb1Var.f31538x) {
            pb1Var.j(z10, z11, z12);
        }
    }

    @Override
    public final void c(String str) {
        if (this.e != null) {
            FileLog.e("widget " + this.f29582a + ": " + str);
        }
        pb1 pb1Var = this.h;
        if (pb1Var != null) {
            pb1Var.f31519a.j();
        }
    }

    @Override
    public final void d(yb1 yb1Var) {
        vb1 vb1Var;
        boolean z10;
        boolean z11;
        db1 d;
        pb1 pb1Var;
        if (yb1Var == this.f29585f && (vb1Var = yb1Var.D) != null) {
            if (this.f29586g == null || yb1Var.f35016t) {
                this.f29586g = null;
                this.f29589k = vb1Var.d;
                boolean z12 = vb1Var.h;
                if (z12 != this.f29590l) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f29590l = z12;
                int max = Math.max(1, vb1Var.e);
                if (max != this.f29587i) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f29587i = max;
                pb1 pb1Var2 = this.h;
                if (pb1Var2 != null) {
                    pb1Var2.l(z11);
                }
                if ((z11 || z10) && this.e != null && (d = fb1.d(this)) != null && this.f29587i > 0) {
                    int c10 = fb1.c(this.f29589k);
                    int max2 = Math.max(50, Math.min(600, fb1.c(this.f29587i)));
                    int i10 = this.f29590l;
                    if (c10 > 0 && d.f27488f == 0) {
                        String a2 = d.a();
                        ConcurrentHashMap concurrentHashMap = fb1.f28144b;
                        eb1 eb1Var = (eb1) concurrentHashMap.get(a2);
                        if (eb1Var == null) {
                            eb1Var = new eb1();
                            eb1 eb1Var2 = (eb1) concurrentHashMap.putIfAbsent(a2, eb1Var);
                            if (eb1Var2 != null) {
                                eb1Var = eb1Var2;
                            }
                        }
                        synchronized (eb1Var) {
                            int i11 = 0;
                            while (true) {
                                if (i11 >= eb1Var.f27798a.size()) {
                                    break;
                                }
                                int[] iArr = (int[]) eb1Var.f27798a.get(i11);
                                if (iArr[0] != c10) {
                                    i11++;
                                } else if (iArr[1] != max2 || iArr[2] != i10 || i11 != 0) {
                                    eb1Var.f27798a.remove(i11);
                                }
                            }
                            eb1Var.f27798a.add(0, new int[]{c10, max2, i10});
                            while (eb1Var.f27798a.size() > 4) {
                                ArrayList arrayList = eb1Var.f27798a;
                                arrayList.remove(arrayList.size() - 1);
                            }
                            MessagesStorage.getInstance(d.f27486b).putWidgetHeight(d.f27487c, d.d, c10, max2, i10, 4);
                        }
                    }
                    an0 an0Var = d.f27491j;
                    if (an0Var != null) {
                        an0Var.l("frame off screen");
                    }
                }
                if (j() && !z11 && (pb1Var = this.h) != null) {
                    pb1Var.l(true);
                }
            }
        }
    }

    @Override
    public final void e(JSONObject jSONObject) {
        org.telegram.ui.ActionBar.r2 U;
        int i10;
        an0 an0Var;
        if (this.e != null) {
            db1 d = fb1.d(this);
            String optString = jSONObject.optString("kind");
            View view = null;
            if (!"openLink".equals(optString) && !"openTelegramLink".equals(optString)) {
                if ("haptic".equals(optString)) {
                    if (d != null && d.f27494m > 0 && (an0Var = d.f27493l) != null) {
                        view = an0Var.i();
                    }
                    if (view != null) {
                        String optString2 = jSONObject.optString("haptic");
                        if ("selection".equals(optString2)) {
                            i10 = 4;
                        } else if ("notification".equals(optString2)) {
                            i10 = 16;
                        } else {
                            i10 = 3;
                        }
                        view.performHapticFeedback(i10);
                        return;
                    }
                    return;
                }
                return;
            }
            String optString3 = jSONObject.optString("url");
            boolean equals = "openTelegramLink".equals(optString);
            if (!TextUtils.isEmpty(optString3) && !fb1.f28148i && (U = LaunchActivity.U()) != null && U.getParentActivity() != null) {
                Activity parentActivity = U.getParentActivity();
                if (equals) {
                    qf.d.r(parentActivity, optString3);
                    return;
                }
                fb1.f28148i = true;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, U.getResourceProvider());
                String string = LocaleController.getString(R.string.WidgetOpenLinkTitle);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
                e2Var.R = string;
                e2Var.T = LocaleController.formatString(R.string.WidgetOpenLinkText, optString3);
                alertDialog$Builder.k(LocaleController.getString(R.string.Open), new p1(29, parentActivity, optString3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                e2Var.setOnDismissListener(new fi.e1(5));
                if (U.showDialog(e2Var) == null) {
                    fb1.f28148i = false;
                }
            }
        }
    }

    @Override
    public final void f(JSONObject jSONObject) {
        pb1 pb1Var;
        yb1 yb1Var;
        db1 d;
        if (this.e != null) {
            String optString = jSONObject.optString("dead");
            if (!TextUtils.isEmpty(optString) && (d = fb1.d(this)) != null) {
                int i10 = d.f27499r;
                int i11 = this.f29595q;
                if (i10 != i11) {
                    d.f27499r = i11;
                    d.f27498q++;
                    d.f27500s = true;
                    FileLog.d("widget " + this.f29582a + " stopped (" + d.f27498q + "): " + optString);
                    fb1.a(d);
                    fb1.b();
                }
            }
        }
        if (jSONObject.optBoolean("loaded") && this.f29586g != null && (yb1Var = this.f29585f) != null) {
            d(yb1Var);
        } else if (j() && (pb1Var = this.h) != null) {
            pb1Var.l(true);
        }
    }

    @Override
    public final void g(String str, JSONObject jSONObject) {
        db1 d;
        String str2;
        if (this.e != null && (d = fb1.d(this)) != null) {
            String a2 = d.a();
            JSONObject jSONObject2 = (JSONObject) fb1.f28145c.get(a2);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            try {
                jSONObject2.put(str, jSONObject);
            } catch (Exception unused) {
            }
            fb1.f28145c.put(a2, jSONObject2);
            for (db1 db1Var : fb1.f28143a.values()) {
                if (db1Var.f27490i != null && a2.equals(db1Var.a())) {
                    jb1 jb1Var = db1Var.f27490i;
                    try {
                        str2 = LocaleController.getInstance().getCurrentLocale().toLanguageTag();
                    } catch (Exception unused2) {
                        str2 = null;
                    }
                    String jSONObject3 = jSONObject2.toString();
                    jb1Var.f29598t = str2;
                    jb1Var.f29599u = jSONObject3;
                }
            }
            if ("local".equals(str)) {
                fb1.d.put(a2, d);
                k5 k5Var = fb1.e;
                AndroidUtilities.cancelRunOnUIThread(k5Var);
                AndroidUtilities.runOnUIThread(k5Var, 1000L);
            }
        }
    }

    public final void h() {
        int i10;
        yb1 yb1Var = this.f29585f;
        if (yb1Var != null && !yb1Var.f35015s && yb1Var.f35014r != 0 && !yb1Var.A) {
            vb1 vb1Var = yb1Var.D;
            if (vb1Var == null || (((i10 = yb1Var.C) != 0 && Math.abs(vb1Var.d - i10) > 1) || !vb1Var.a())) {
                yb1Var.A = true;
                WidgetSandboxNative.repaint(yb1Var.f35014r);
            }
        }
    }

    public final vb1 i() {
        vb1 vb1Var;
        yb1 yb1Var = this.f29585f;
        if (yb1Var == null) {
            vb1Var = null;
        } else {
            vb1Var = yb1Var.D;
        }
        if (vb1Var != null && (this.f29586g == null || yb1Var.f35016t)) {
            return vb1Var;
        }
        vb1 vb1Var2 = this.f29586g;
        if (vb1Var2 != null && Math.abs(vb1Var2.d - this.f29588j) <= 1) {
            return this.f29586g;
        }
        if (vb1Var != null) {
            return vb1Var;
        }
        return this.f29586g;
    }

    public final boolean j() {
        yb1 yb1Var;
        vb1 vb1Var;
        if (this.f29596r != this.f29595q && (yb1Var = this.f29585f) != null && (vb1Var = yb1Var.D) != null) {
            if (vb1Var.f33624g || yb1Var.v) {
                this.f29596r = this.f29595q;
                if (this.e != null) {
                    fb1.b();
                    db1 d = fb1.d(this);
                    if (d != null) {
                        fb1.a(d);
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final void k(boolean z10) {
        boolean z11;
        this.f29592n = z10;
        yb1 yb1Var = this.f29585f;
        if (yb1Var != null) {
            if (z10 && !this.f29594p) {
                z11 = true;
            } else {
                z11 = false;
            }
            yb1Var.e(z11);
        }
    }

    public final void l(int i10) {
        if (i10 > 0 && i10 != this.f29588j) {
            this.f29588j = i10;
            yb1 yb1Var = this.f29585f;
            if (yb1Var != null && i10 > 0 && i10 != yb1Var.C && !yb1Var.f35015s) {
                yb1Var.C = i10;
                long j10 = yb1Var.f35014r;
                if (j10 != 0) {
                    WidgetSandboxNative.width(j10, i10 / yb1Var.h);
                }
            }
        }
    }

    public final void m() {
        this.f29593o = false;
        if (this.f29585f == null) {
            return;
        }
        vb1 i10 = i();
        if (i10 != null) {
            this.f29586g = i10;
        }
        this.f29585f.a();
        this.f29585f = null;
    }
}
