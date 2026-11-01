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
public final class tp0 extends FrameLayout implements org.telegram.messenger.vs {
    public static final int I = 0;
    public int D;
    public boolean E;
    public String F;
    public vo0 G;
    public sp0 H;
    public final rp0[] f30690a;
    public int f30691b;
    public int f30692c;
    public long d;
    public ArrayList e;
    public final ArrayList f30693f;
    public boolean h;
    public boolean f30694n;
    public String f30695r;
    public final ArrayList f30696s;
    public final HashMap f30697w;
    public TLRPC.WebPage f30698x;
    public int f30699y;

    public tp0(Activity activity, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity);
        this.f30690a = new rp0[2];
        this.f30691b = 0;
        this.f30693f = new ArrayList();
        this.f30694n = true;
        this.f30696s = new ArrayList();
        this.f30697w = new HashMap();
        int i10 = 0;
        while (true) {
            rp0[] rp0VarArr = this.f30690a;
            if (i10 < rp0VarArr.length) {
                rp0VarArr[i10] = new rp0(this, activity, p6Var);
                addView(this.f30690a[i10], w7.b6.c(-1.0f, -1));
                i10++;
            } else {
                rp0VarArr[0].setVisibility(0);
                this.f30690a[1].setVisibility(8);
                return;
            }
        }
    }

    public static void a(rp0 rp0Var, TLRPC.WebPage webPage, String str) {
        g9 g9Var = (g9) rp0Var.f30062s;
        ((ImageView) rp0Var.f30058c).setImageResource(2131232203);
        ((ImageView) rp0Var.f30058c).setVisibility(0);
        ((FrameLayout) rp0Var.f30060n).setVisibility(8);
        ((ImageView) rp0Var.d).setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        ((org.telegram.ui.ActionBar.u5) rp0Var.e).l(str2, false);
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
        ((org.telegram.ui.ActionBar.u5) rp0Var.f30059f).l(str3, false);
        TLRPC.Photo photo = webPage.photo;
        if (photo != null) {
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(photo.sizes, 320, false, null, false);
            TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(webPage.photo.sizes, org.telegram.messenger.i0.L(40.0f), false, null, false);
            if (w9 != null) {
                g9Var.setRoundRadius(org.telegram.messenger.i0.L(4.0f));
                g9Var.g(1, 0L, webPage, "50_50", "50_50_b", null, org.telegram.messenger.jc.f(w9, webPage.photo), org.telegram.messenger.jc.f(w10, webPage.photo));
                g9Var.setVisibility(0);
            } else {
                g9Var.setVisibility(8);
            }
        } else {
            g9Var.setVisibility(8);
        }
        ((LinearLayout) rp0Var.f30057b).setClickable(false);
    }

    public static void b(g9 g9Var, org.telegram.messenger.ff ffVar) {
        if (ffVar == null) {
            g9Var.setVisibility(8);
            return;
        }
        int i10 = ffVar.C;
        String str = ffVar.I;
        g9Var.setVisibility(0);
        g9Var.r();
        String str2 = ffVar.f14604c;
        if (str2 != null) {
            g9Var.h(str2, null, null);
        } else if (str != null) {
            if (ffVar.f14603b) {
                g9Var.h("vthumb://" + i10 + ":" + str, null, null);
                return;
            }
            g9Var.s(ffVar.J, ffVar.K, true);
            g9Var.h("thumb://" + i10 + ":" + str, null, null);
        } else {
            g9Var.setImageDrawable(null);
        }
    }

    public final String c(rp0 rp0Var) {
        int measuredWidth;
        String s10;
        ArrayList arrayList = this.f30693f;
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            long longValue = ((Long) obj).longValue();
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            if (longValue == this.d) {
                sb2.append(org.telegram.messenger.dd.L0(2131745918, null));
            } else {
                if (arrayList.size() == 1) {
                    s10 = org.telegram.messenger.o5.l(this.f30692c, longValue);
                } else {
                    s10 = org.telegram.messenger.o5.s(this.f30692c, longValue);
                }
                sb2.append(s10);
            }
        }
        String a02 = org.telegram.messenger.dd.a0(null, null, 2131745457, sb2.toString());
        org.telegram.ui.ActionBar.u5 u5Var = (org.telegram.ui.ActionBar.u5) rp0Var.f30059f;
        if (u5Var.getMeasuredWidth() <= 0) {
            measuredWidth = org.telegram.messenger.i0.f16172q.x - org.telegram.messenger.i0.L(140.0f);
        } else {
            measuredWidth = u5Var.getMeasuredWidth();
        }
        float f7 = measuredWidth;
        if (arrayList.size() <= 2 && u5Var.getPaint().measureText(a02) <= f7) {
            return a02;
        }
        return org.telegram.messenger.dd.G(arrayList.size(), "ShareSendToMany", new Object[0]);
    }

    public final void d() {
        if (this.f30699y != 0) {
            ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.f30692c).f15043a).cancelRequest(this.f30699y, true);
            this.f30699y = 0;
        }
        this.D++;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        if (i10 == org.telegram.messenger.at.f14807w0 && this.f30698x != null && i11 == this.f30692c) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i12 = 0; i12 < hVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i12);
                if (webPage != null && webPage.f19949id == this.f30698x.f19949id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.f30698x = null;
                        d();
                        if (this.f30691b != 0) {
                            this.f30691b = 0;
                            sp0 sp0Var = this.H;
                            if (sp0Var != null) {
                                ((org.telegram.ui.hv) sp0Var).i(0);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (webPage instanceof TLRPC.TL_webPage) {
                        this.f30698x = webPage;
                        ArrayList arrayList = this.f30696s;
                        if (arrayList.isEmpty()) {
                            str = "";
                        } else {
                            str = TextUtils.join(" ", arrayList).toString();
                        }
                        HashMap hashMap = this.f30697w;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, webPage);
                        }
                        a(this.f30690a[0], webPage, str);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void e(java.lang.CharSequence r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tp0.e(java.lang.CharSequence, boolean):void");
    }

    public final g9 f(int i10) {
        g9[] g9VarArr;
        if (this.f30691b == 1 && (g9VarArr = (g9[]) this.f30690a[0].f30061r) != null && i10 >= 0 && i10 < g9VarArr.length && g9VarArr[i10].getVisibility() == 0) {
            return g9VarArr[i10];
        }
        return null;
    }

    public final void g(int i10) {
        h(i10);
        this.d = org.telegram.messenger.e20.i(org.telegram.messenger.c.a(i10).f15043a).e();
        this.e = null;
        this.h = true;
        this.f30694n = true;
        this.f30695r = null;
        this.f30698x = null;
        d();
        this.f30696s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.f30698x;
    }

    public int getMode() {
        return this.f30691b;
    }

    public final void h(int i10) {
        int i11 = this.f30692c;
        int i12 = org.telegram.messenger.at.f14807w0;
        if (i11 == i10) {
            this.f30692c = i10;
            if (isAttachedToWindow()) {
                org.telegram.messenger.at.f(this.f30692c).c(this, i12);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            org.telegram.messenger.at.f(this.f30692c).n(this, i12);
        }
        this.f30692c = i10;
        if (isAttachedToWindow()) {
            org.telegram.messenger.at.f(this.f30692c).c(this, i12);
        }
    }

    public final void i(int i10, ArrayList arrayList) {
        boolean z10;
        sp0 sp0Var;
        org.telegram.messenger.ff ffVar;
        org.telegram.messenger.ff ffVar2;
        int i11;
        h(i10);
        this.d = org.telegram.messenger.e20.i(org.telegram.messenger.c.a(i10).f15043a).e();
        this.e = arrayList;
        this.h = false;
        org.telegram.messenger.ff ffVar3 = null;
        this.f30698x = null;
        d();
        this.f30696s.clear();
        int i12 = this.f30691b;
        if (i12 != 1 && i12 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30691b = 1;
        if (z10) {
            k();
        }
        rp0[] rp0VarArr = this.f30690a;
        rp0 rp0Var = rp0VarArr[0];
        org.telegram.ui.ActionBar.u5 u5Var = (org.telegram.ui.ActionBar.u5) rp0Var.f30059f;
        g9[] g9VarArr = (g9[]) rp0Var.f30061r;
        org.telegram.ui.ActionBar.u5 u5Var2 = (org.telegram.ui.ActionBar.u5) rp0Var.e;
        ((ImageView) rp0Var.f30058c).setImageResource(2131231112);
        ((ImageView) rp0Var.f30058c).setVisibility(0);
        ((g9) rp0Var.f30062s).setVisibility(8);
        ((FrameLayout) rp0Var.f30060n).setVisibility(0);
        ((ImageView) rp0Var.d).setVisibility(8);
        ((LinearLayout) rp0Var.f30057b).setClickable(true);
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i15 < size) {
                Object obj = arrayList2.get(i15);
                i15++;
                if (((org.telegram.messenger.ff) obj).f14603b) {
                    i13++;
                } else {
                    i14++;
                }
            }
            int size2 = arrayList2.size();
            if (size2 == 1) {
                if (((org.telegram.messenger.ff) arrayList2.get(0)).f14603b) {
                    i11 = 2131745451;
                } else {
                    i11 = 2131745462;
                }
                u5Var2.l(org.telegram.messenger.dd.L0(i11, null), false);
            } else if (i13 == 0) {
                u5Var2.l(org.telegram.messenger.dd.G(size2, "ShareSendPhotos", new Object[0]), false);
            } else if (i14 == 0) {
                u5Var2.l(org.telegram.messenger.dd.G(size2, "ShareSendVideos", new Object[0]), false);
            } else {
                u5Var2.l(org.telegram.messenger.dd.G(size2, "ShareSendItems", new Object[0]), false);
            }
            u5Var.l(c(rp0Var), false);
            g9 g9Var = g9VarArr[0];
            if (arrayList2.size() > 0) {
                ffVar = (org.telegram.messenger.ff) arrayList2.get(0);
            } else {
                ffVar = null;
            }
            b(g9Var, ffVar);
            g9 g9Var2 = g9VarArr[1];
            if (arrayList2.size() > 1) {
                ffVar2 = (org.telegram.messenger.ff) arrayList2.get(1);
            } else {
                ffVar2 = null;
            }
            b(g9Var2, ffVar2);
            g9 g9Var3 = g9VarArr[2];
            if (arrayList2.size() > 2) {
                ffVar3 = (org.telegram.messenger.ff) arrayList2.get(2);
            }
            b(g9Var3, ffVar3);
        } else {
            u5Var2.l("", false);
            u5Var.l("", false);
            for (g9 g9Var4 : g9VarArr) {
                g9Var4.setVisibility(8);
            }
        }
        rp0 rp0Var2 = rp0VarArr[0];
        String str = this.F;
        if (str != null) {
            ((org.telegram.ui.ActionBar.u5) rp0Var2.h).l(str, false);
        }
        int i16 = this.f30691b;
        if (i12 != i16 && (sp0Var = this.H) != null) {
            ((org.telegram.ui.hv) sp0Var).i(i16);
        }
    }

    public final void j() {
        rp0[] rp0VarArr;
        vo0 vo0Var = this.G;
        if (vo0Var != null) {
            org.telegram.messenger.i0.r(vo0Var);
            this.G = null;
        }
        this.E = false;
        for (rp0 rp0Var : this.f30690a) {
            org.telegram.ui.ActionBar.u5 u5Var = (org.telegram.ui.ActionBar.u5) rp0Var.f30059f;
            u5Var.setAlpha(1.0f);
            u5Var.setScaleX(1.0f);
            u5Var.setScaleY(1.0f);
            ((org.telegram.ui.ActionBar.u5) rp0Var.h).setAlpha(0.0f);
        }
    }

    public final void k() {
        rp0[] rp0VarArr = this.f30690a;
        rp0 rp0Var = rp0VarArr[0];
        rp0 rp0Var2 = rp0VarArr[1];
        rp0VarArr[0] = rp0Var2;
        rp0VarArr[1] = rp0Var;
        rp0Var2.getClass();
        rp0VarArr[0].setVisibility(0);
        rp0VarArr[0].setScaleX(0.8f);
        rp0VarArr[0].setScaleY(0.8f);
        rp0VarArr[0].setAlpha(0.0f);
        rp0VarArr[0].setTranslationY(org.telegram.messenger.i0.L(20.0f));
        ViewPropertyAnimator translationY = rp0VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        gr grVar = gr.h;
        org.telegram.messenger.a30.m(translationY, grVar, 320L);
        rp0 rp0Var3 = rp0VarArr[1];
        rp0Var3.getClass();
        rp0Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-org.telegram.messenger.i0.L(20.0f)).setInterpolator(grVar).setDuration(320L).withEndAction(new vo0(rp0Var3, 2)).start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.at.f(this.f30692c).c(this, org.telegram.messenger.at.f14807w0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.at.f(this.f30692c).n(this, org.telegram.messenger.at.f14807w0);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (rp0 rp0Var : this.f30690a) {
            ((LinearLayout) rp0Var.f30057b).setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(sp0 sp0Var) {
        this.H = sp0Var;
    }
}
