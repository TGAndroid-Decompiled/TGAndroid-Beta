package org.telegram.ui.Components;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ep0 extends FrameLayout implements org.telegram.messenger.gs {
    public static final int J = 0;
    public int E;
    public boolean F;
    public String G;
    public hb0 H;
    public dp0 I;
    public final hi.k1[] f34949a;
    public int f34950b;
    public int f34951c;
    public long d;
    public ArrayList f34952e;
    public final ArrayList f34953f;
    public boolean h;
    public boolean f34954n;
    public String f34955r;
    public final ArrayList f34956s;
    public final HashMap f34957w;
    public TLRPC.WebPage f34958x;
    public int f34959y;

    public ep0(Activity activity, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity);
        this.f34949a = new hi.k1[2];
        this.f34950b = 0;
        this.f34953f = new ArrayList();
        this.f34954n = true;
        this.f34956s = new ArrayList();
        this.f34957w = new HashMap();
        int i7 = 0;
        while (true) {
            hi.k1[] k1VarArr = this.f34949a;
            if (i7 < k1VarArr.length) {
                k1VarArr[i7] = new hi.k1(this, activity, h6Var);
                addView(this.f34949a[i7], c8.ma.c(-1.0f, -1));
                i7++;
            } else {
                k1VarArr[0].setVisibility(0);
                this.f34949a[1].setVisibility(8);
                return;
            }
        }
    }

    public static void a(hi.k1 k1Var, TLRPC.WebPage webPage, String str) {
        q9 q9Var = (q9) k1Var.f14862r;
        ((ImageView) k1Var.f14858c).setImageResource(2131232206);
        ((ImageView) k1Var.f14858c).setVisibility(0);
        ((FrameLayout) k1Var.h).setVisibility(8);
        ((ImageView) k1Var.f14863s).setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        ((org.telegram.ui.ActionBar.m5) k1Var.d).l(str2, false);
        String str3 = webPage.title;
        if (str3 == null || webPage.site_name == null) {
            str3 = webPage.description;
        }
        if (str3 == null) {
            String str4 = webPage.display_url;
            if (str4 != null) {
                str = str4;
            }
            str3 = str;
        }
        ((org.telegram.ui.ActionBar.m5) k1Var.f14859e).l(str3, false);
        TLRPC.Photo photo = webPage.photo;
        if (photo != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, 320, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(webPage.photo.sizes, org.telegram.messenger.g0.L(40.0f), false, null, false);
            if (w10 != null) {
                q9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                q9Var.g(1, 0L, webPage, "50_50", "50_50_b", null, org.telegram.messenger.gc.f(w10, webPage.photo), org.telegram.messenger.gc.f(w11, webPage.photo));
                q9Var.setVisibility(0);
            } else {
                q9Var.setVisibility(8);
            }
        } else {
            q9Var.setVisibility(8);
        }
        ((LinearLayout) k1Var.f14857b).setClickable(false);
    }

    public static void b(q9 q9Var, org.telegram.messenger.ff ffVar) {
        if (ffVar == null) {
            q9Var.setVisibility(8);
            return;
        }
        int i7 = ffVar.C;
        String str = ffVar.I;
        q9Var.setVisibility(0);
        q9Var.r();
        String str2 = ffVar.f28060c;
        if (str2 != null) {
            q9Var.h(str2, null, null);
        } else if (str != null) {
            if (ffVar.f28059b) {
                q9Var.h("vthumb://" + i7 + ":" + str, null, null);
                return;
            }
            q9Var.s(ffVar.J, ffVar.K, true);
            q9Var.h("thumb://" + i7 + ":" + str, null, null);
        } else {
            q9Var.setImageDrawable(null);
        }
    }

    public final String c(hi.k1 k1Var) {
        int measuredWidth;
        String s5;
        ArrayList arrayList = this.f34953f;
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            long longValue = ((Long) obj).longValue();
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            if (longValue == this.d) {
                sb2.append(org.telegram.messenger.hd.N0(2131745705, null));
            } else {
                if (arrayList.size() == 1) {
                    s5 = org.telegram.messenger.n5.l(this.f34951c, longValue);
                } else {
                    s5 = org.telegram.messenger.n5.s(this.f34951c, longValue);
                }
                sb2.append(s5);
            }
        }
        String a02 = org.telegram.messenger.hd.a0(null, null, 2131745243, sb2.toString());
        org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) k1Var.f14859e;
        if (m5Var.getMeasuredWidth() <= 0) {
            measuredWidth = org.telegram.messenger.g0.f24046q.x - org.telegram.messenger.g0.L(140.0f);
        } else {
            measuredWidth = m5Var.getMeasuredWidth();
        }
        float f10 = measuredWidth;
        if (arrayList.size() <= 2 && m5Var.getPaint().measureText(a02) <= f10) {
            return a02;
        }
        return org.telegram.messenger.hd.G(arrayList.size(), "ShareSendToMany", new Object[0]);
    }

    public final void d() {
        if (this.f34959y != 0) {
            ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.f34951c).f23202a).cancelRequest(this.f34959y, true);
            this.f34959y = 0;
        }
        this.E++;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        String str;
        if (i7 == org.telegram.messenger.ls.f25405w0 && this.f34958x != null && i10 == this.f34951c) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i11 = 0; i11 < hVar.m(); i11++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i11);
                if (webPage != null && webPage.f28589id == this.f34958x.f28589id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.f34958x = null;
                        d();
                        if (this.f34950b != 0) {
                            this.f34950b = 0;
                            dp0 dp0Var = this.I;
                            if (dp0Var != null) {
                                ((org.telegram.ui.ju) dp0Var).g(0);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (webPage instanceof TLRPC.TL_webPage) {
                        this.f34958x = webPage;
                        ArrayList arrayList = this.f34956s;
                        if (arrayList.isEmpty()) {
                            str = "";
                        } else {
                            str = TextUtils.join(" ", arrayList).toString();
                        }
                        HashMap hashMap = this.f34957w;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, webPage);
                        }
                        a(this.f34949a[0], webPage, str);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void e(java.lang.CharSequence r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ep0.e(java.lang.CharSequence, boolean):void");
    }

    public final q9 f(int i7) {
        q9[] q9VarArr;
        if (this.f34950b == 1 && (q9VarArr = (q9[]) this.f34949a[0].f14861n) != null && i7 >= 0 && i7 < q9VarArr.length && q9VarArr[i7].getVisibility() == 0) {
            return q9VarArr[i7];
        }
        return null;
    }

    public final void g(int i7) {
        h(i7);
        this.d = org.telegram.messenger.k10.i(org.telegram.messenger.c.a(i7).f23202a).e();
        this.f34952e = null;
        this.h = true;
        this.f34954n = true;
        this.f34955r = null;
        this.f34958x = null;
        d();
        this.f34956s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.f34958x;
    }

    public int getMode() {
        return this.f34950b;
    }

    public final void h(int i7) {
        int i10 = this.f34951c;
        int i11 = org.telegram.messenger.ls.f25405w0;
        if (i10 == i7) {
            this.f34951c = i7;
            if (isAttachedToWindow()) {
                org.telegram.messenger.ls.f(this.f34951c).c(this, i11);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            org.telegram.messenger.ls.f(this.f34951c).n(this, i11);
        }
        this.f34951c = i7;
        if (isAttachedToWindow()) {
            org.telegram.messenger.ls.f(this.f34951c).c(this, i11);
        }
    }

    public final void i(int i7, ArrayList arrayList) {
        boolean z10;
        dp0 dp0Var;
        org.telegram.messenger.ff ffVar;
        org.telegram.messenger.ff ffVar2;
        int i10;
        h(i7);
        this.d = org.telegram.messenger.k10.i(org.telegram.messenger.c.a(i7).f23202a).e();
        this.f34952e = arrayList;
        this.h = false;
        org.telegram.messenger.ff ffVar3 = null;
        this.f34958x = null;
        d();
        this.f34956s.clear();
        int i11 = this.f34950b;
        if (i11 != 1 && i11 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34950b = 1;
        if (z10) {
            k();
        }
        hi.k1[] k1VarArr = this.f34949a;
        hi.k1 k1Var = k1VarArr[0];
        org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) k1Var.f14859e;
        q9[] q9VarArr = (q9[]) k1Var.f14861n;
        org.telegram.ui.ActionBar.m5 m5Var2 = (org.telegram.ui.ActionBar.m5) k1Var.d;
        ((ImageView) k1Var.f14858c).setImageResource(2131231112);
        ((ImageView) k1Var.f14858c).setVisibility(0);
        ((q9) k1Var.f14862r).setVisibility(8);
        ((FrameLayout) k1Var.h).setVisibility(0);
        ((ImageView) k1Var.f14863s).setVisibility(8);
        ((LinearLayout) k1Var.f14857b).setClickable(true);
        ArrayList arrayList2 = this.f34952e;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList2.get(i14);
                i14++;
                if (((org.telegram.messenger.ff) obj).f28059b) {
                    i12++;
                } else {
                    i13++;
                }
            }
            int size2 = arrayList2.size();
            if (size2 == 1) {
                if (((org.telegram.messenger.ff) arrayList2.get(0)).f28059b) {
                    i10 = 2131745237;
                } else {
                    i10 = 2131745248;
                }
                m5Var2.l(org.telegram.messenger.hd.N0(i10, null), false);
            } else if (i12 == 0) {
                m5Var2.l(org.telegram.messenger.hd.G(size2, "ShareSendPhotos", new Object[0]), false);
            } else if (i13 == 0) {
                m5Var2.l(org.telegram.messenger.hd.G(size2, "ShareSendVideos", new Object[0]), false);
            } else {
                m5Var2.l(org.telegram.messenger.hd.G(size2, "ShareSendItems", new Object[0]), false);
            }
            m5Var.l(c(k1Var), false);
            q9 q9Var = q9VarArr[0];
            if (arrayList2.size() > 0) {
                ffVar = (org.telegram.messenger.ff) arrayList2.get(0);
            } else {
                ffVar = null;
            }
            b(q9Var, ffVar);
            q9 q9Var2 = q9VarArr[1];
            if (arrayList2.size() > 1) {
                ffVar2 = (org.telegram.messenger.ff) arrayList2.get(1);
            } else {
                ffVar2 = null;
            }
            b(q9Var2, ffVar2);
            q9 q9Var3 = q9VarArr[2];
            if (arrayList2.size() > 2) {
                ffVar3 = (org.telegram.messenger.ff) arrayList2.get(2);
            }
            b(q9Var3, ffVar3);
        } else {
            m5Var2.l("", false);
            m5Var.l("", false);
            for (q9 q9Var4 : q9VarArr) {
                q9Var4.setVisibility(8);
            }
        }
        hi.k1 k1Var2 = k1VarArr[0];
        String str = this.G;
        if (str != null) {
            ((org.telegram.ui.ActionBar.m5) k1Var2.f14860f).l(str, false);
        }
        int i15 = this.f34950b;
        if (i11 != i15 && (dp0Var = this.I) != null) {
            ((org.telegram.ui.ju) dp0Var).g(i15);
        }
    }

    public final void j() {
        hi.k1[] k1VarArr;
        hb0 hb0Var = this.H;
        if (hb0Var != null) {
            org.telegram.messenger.g0.r(hb0Var);
            this.H = null;
        }
        this.F = false;
        for (hi.k1 k1Var : this.f34949a) {
            org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) k1Var.f14859e;
            m5Var.setAlpha(1.0f);
            m5Var.setScaleX(1.0f);
            m5Var.setScaleY(1.0f);
            ((org.telegram.ui.ActionBar.m5) k1Var.f14860f).setAlpha(0.0f);
        }
    }

    public final void k() {
        hi.k1[] k1VarArr = this.f34949a;
        hi.k1 k1Var = k1VarArr[0];
        hi.k1 k1Var2 = k1VarArr[1];
        k1VarArr[0] = k1Var2;
        k1VarArr[1] = k1Var;
        k1Var2.getClass();
        k1VarArr[0].setVisibility(0);
        k1VarArr[0].setScaleX(0.8f);
        k1VarArr[0].setScaleY(0.8f);
        k1VarArr[0].setAlpha(0.0f);
        k1VarArr[0].setTranslationY(org.telegram.messenger.g0.L(20.0f));
        ViewPropertyAnimator translationY = k1VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        nr nrVar = nr.h;
        org.telegram.messenger.o10.o(translationY, nrVar, 320L);
        hi.k1 k1Var3 = k1VarArr[1];
        k1Var3.getClass();
        k1Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-org.telegram.messenger.g0.L(20.0f)).setInterpolator(nrVar).setDuration(320L).withEndAction(new cp0(k1Var3, 0)).start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ls.f(this.f34951c).c(this, org.telegram.messenger.ls.f25405w0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ls.f(this.f34951c).n(this, org.telegram.messenger.ls.f25405w0);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (hi.k1 k1Var : this.f34949a) {
            ((LinearLayout) k1Var.f14857b).setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(dp0 dp0Var) {
        this.I = dp0Var;
    }
}
