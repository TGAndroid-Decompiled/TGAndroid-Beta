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
public final class sp0 extends FrameLayout implements org.telegram.messenger.us {
    public static final int I = 0;
    public int D;
    public boolean E;
    public String F;
    public uo0 G;
    public rp0 H;
    public final qp0[] f30320a;
    public int f30321b;
    public int f30322c;
    public long d;
    public ArrayList e;
    public final ArrayList f30323f;
    public boolean h;
    public boolean f30324n;
    public String f30325r;
    public final ArrayList f30326s;
    public final HashMap f30327w;
    public TLRPC.WebPage f30328x;
    public int f30329y;

    public sp0(Activity activity, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity);
        this.f30320a = new qp0[2];
        this.f30321b = 0;
        this.f30323f = new ArrayList();
        this.f30324n = true;
        this.f30326s = new ArrayList();
        this.f30327w = new HashMap();
        int i10 = 0;
        while (true) {
            qp0[] qp0VarArr = this.f30320a;
            if (i10 < qp0VarArr.length) {
                qp0VarArr[i10] = new qp0(this, activity, p6Var);
                addView(this.f30320a[i10], w7.b6.c(-1.0f, -1));
                i10++;
            } else {
                qp0VarArr[0].setVisibility(0);
                this.f30320a[1].setVisibility(8);
                return;
            }
        }
    }

    public static void a(qp0 qp0Var, TLRPC.WebPage webPage, String str) {
        g9 g9Var = (g9) qp0Var.f29722s;
        ((ImageView) qp0Var.f29718c).setImageResource(2131232203);
        ((ImageView) qp0Var.f29718c).setVisibility(0);
        ((FrameLayout) qp0Var.f29720n).setVisibility(8);
        ((ImageView) qp0Var.d).setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        ((org.telegram.ui.ActionBar.u5) qp0Var.e).l(str2, false);
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
        ((org.telegram.ui.ActionBar.u5) qp0Var.f29719f).l(str3, false);
        TLRPC.Photo photo = webPage.photo;
        if (photo != null) {
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(photo.sizes, 320, false, null, false);
            TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(webPage.photo.sizes, org.telegram.messenger.i0.L(40.0f), false, null, false);
            if (w9 != null) {
                g9Var.setRoundRadius(org.telegram.messenger.i0.L(4.0f));
                g9Var.g(1, 0L, webPage, "50_50", "50_50_b", null, org.telegram.messenger.ic.f(w9, webPage.photo), org.telegram.messenger.ic.f(w10, webPage.photo));
                g9Var.setVisibility(0);
            } else {
                g9Var.setVisibility(8);
            }
        } else {
            g9Var.setVisibility(8);
        }
        ((LinearLayout) qp0Var.f29717b).setClickable(false);
    }

    public static void b(g9 g9Var, org.telegram.messenger.ef efVar) {
        if (efVar == null) {
            g9Var.setVisibility(8);
            return;
        }
        int i10 = efVar.C;
        String str = efVar.I;
        g9Var.setVisibility(0);
        g9Var.r();
        String str2 = efVar.f19508c;
        if (str2 != null) {
            g9Var.h(str2, null, null);
        } else if (str != null) {
            if (efVar.f19507b) {
                g9Var.h("vthumb://" + i10 + ":" + str, null, null);
                return;
            }
            g9Var.s(efVar.J, efVar.K, true);
            g9Var.h("thumb://" + i10 + ":" + str, null, null);
        } else {
            g9Var.setImageDrawable(null);
        }
    }

    public final String c(qp0 qp0Var) {
        int measuredWidth;
        String s10;
        ArrayList arrayList = this.f30323f;
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
                sb2.append(org.telegram.messenger.cd.L0(2131745918, null));
            } else {
                if (arrayList.size() == 1) {
                    s10 = org.telegram.messenger.o5.l(this.f30322c, longValue);
                } else {
                    s10 = org.telegram.messenger.o5.s(this.f30322c, longValue);
                }
                sb2.append(s10);
            }
        }
        String a02 = org.telegram.messenger.cd.a0(null, null, 2131745457, sb2.toString());
        org.telegram.ui.ActionBar.u5 u5Var = (org.telegram.ui.ActionBar.u5) qp0Var.f29719f;
        if (u5Var.getMeasuredWidth() <= 0) {
            measuredWidth = org.telegram.messenger.i0.f16026q.x - org.telegram.messenger.i0.L(140.0f);
        } else {
            measuredWidth = u5Var.getMeasuredWidth();
        }
        float f7 = measuredWidth;
        if (arrayList.size() <= 2 && u5Var.getPaint().measureText(a02) <= f7) {
            return a02;
        }
        return org.telegram.messenger.cd.G(arrayList.size(), "ShareSendToMany", new Object[0]);
    }

    public final void d() {
        if (this.f30329y != 0) {
            ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.f30322c).f14863a).cancelRequest(this.f30329y, true);
            this.f30329y = 0;
        }
        this.D++;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        if (i10 == org.telegram.messenger.zs.f19711w0 && this.f30328x != null && i11 == this.f30322c) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i12 = 0; i12 < hVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i12);
                if (webPage != null && webPage.f19948id == this.f30328x.f19948id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.f30328x = null;
                        d();
                        if (this.f30321b != 0) {
                            this.f30321b = 0;
                            rp0 rp0Var = this.H;
                            if (rp0Var != null) {
                                ((org.telegram.ui.iv) rp0Var).i(0);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (webPage instanceof TLRPC.TL_webPage) {
                        this.f30328x = webPage;
                        ArrayList arrayList = this.f30326s;
                        if (arrayList.isEmpty()) {
                            str = "";
                        } else {
                            str = TextUtils.join(" ", arrayList).toString();
                        }
                        HashMap hashMap = this.f30327w;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, webPage);
                        }
                        a(this.f30320a[0], webPage, str);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void e(java.lang.CharSequence r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sp0.e(java.lang.CharSequence, boolean):void");
    }

    public final g9 f(int i10) {
        g9[] g9VarArr;
        if (this.f30321b == 1 && (g9VarArr = (g9[]) this.f30320a[0].f29721r) != null && i10 >= 0 && i10 < g9VarArr.length && g9VarArr[i10].getVisibility() == 0) {
            return g9VarArr[i10];
        }
        return null;
    }

    public final void g(int i10) {
        h(i10);
        this.d = org.telegram.messenger.d20.i(org.telegram.messenger.c.a(i10).f14863a).e();
        this.e = null;
        this.h = true;
        this.f30324n = true;
        this.f30325r = null;
        this.f30328x = null;
        d();
        this.f30326s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.f30328x;
    }

    public int getMode() {
        return this.f30321b;
    }

    public final void h(int i10) {
        int i11 = this.f30322c;
        int i12 = org.telegram.messenger.zs.f19711w0;
        if (i11 == i10) {
            this.f30322c = i10;
            if (isAttachedToWindow()) {
                org.telegram.messenger.zs.f(this.f30322c).c(this, i12);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            org.telegram.messenger.zs.f(this.f30322c).n(this, i12);
        }
        this.f30322c = i10;
        if (isAttachedToWindow()) {
            org.telegram.messenger.zs.f(this.f30322c).c(this, i12);
        }
    }

    public final void i(int i10, ArrayList arrayList) {
        boolean z10;
        rp0 rp0Var;
        org.telegram.messenger.ef efVar;
        org.telegram.messenger.ef efVar2;
        int i11;
        h(i10);
        this.d = org.telegram.messenger.d20.i(org.telegram.messenger.c.a(i10).f14863a).e();
        this.e = arrayList;
        this.h = false;
        org.telegram.messenger.ef efVar3 = null;
        this.f30328x = null;
        d();
        this.f30326s.clear();
        int i12 = this.f30321b;
        if (i12 != 1 && i12 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30321b = 1;
        if (z10) {
            k();
        }
        qp0[] qp0VarArr = this.f30320a;
        qp0 qp0Var = qp0VarArr[0];
        org.telegram.ui.ActionBar.u5 u5Var = (org.telegram.ui.ActionBar.u5) qp0Var.f29719f;
        g9[] g9VarArr = (g9[]) qp0Var.f29721r;
        org.telegram.ui.ActionBar.u5 u5Var2 = (org.telegram.ui.ActionBar.u5) qp0Var.e;
        ((ImageView) qp0Var.f29718c).setImageResource(2131231112);
        ((ImageView) qp0Var.f29718c).setVisibility(0);
        ((g9) qp0Var.f29722s).setVisibility(8);
        ((FrameLayout) qp0Var.f29720n).setVisibility(0);
        ((ImageView) qp0Var.d).setVisibility(8);
        ((LinearLayout) qp0Var.f29717b).setClickable(true);
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i15 < size) {
                Object obj = arrayList2.get(i15);
                i15++;
                if (((org.telegram.messenger.ef) obj).f19507b) {
                    i13++;
                } else {
                    i14++;
                }
            }
            int size2 = arrayList2.size();
            if (size2 == 1) {
                if (((org.telegram.messenger.ef) arrayList2.get(0)).f19507b) {
                    i11 = 2131745451;
                } else {
                    i11 = 2131745462;
                }
                u5Var2.l(org.telegram.messenger.cd.L0(i11, null), false);
            } else if (i13 == 0) {
                u5Var2.l(org.telegram.messenger.cd.G(size2, "ShareSendPhotos", new Object[0]), false);
            } else if (i14 == 0) {
                u5Var2.l(org.telegram.messenger.cd.G(size2, "ShareSendVideos", new Object[0]), false);
            } else {
                u5Var2.l(org.telegram.messenger.cd.G(size2, "ShareSendItems", new Object[0]), false);
            }
            u5Var.l(c(qp0Var), false);
            g9 g9Var = g9VarArr[0];
            if (arrayList2.size() > 0) {
                efVar = (org.telegram.messenger.ef) arrayList2.get(0);
            } else {
                efVar = null;
            }
            b(g9Var, efVar);
            g9 g9Var2 = g9VarArr[1];
            if (arrayList2.size() > 1) {
                efVar2 = (org.telegram.messenger.ef) arrayList2.get(1);
            } else {
                efVar2 = null;
            }
            b(g9Var2, efVar2);
            g9 g9Var3 = g9VarArr[2];
            if (arrayList2.size() > 2) {
                efVar3 = (org.telegram.messenger.ef) arrayList2.get(2);
            }
            b(g9Var3, efVar3);
        } else {
            u5Var2.l("", false);
            u5Var.l("", false);
            for (g9 g9Var4 : g9VarArr) {
                g9Var4.setVisibility(8);
            }
        }
        qp0 qp0Var2 = qp0VarArr[0];
        String str = this.F;
        if (str != null) {
            ((org.telegram.ui.ActionBar.u5) qp0Var2.h).l(str, false);
        }
        int i16 = this.f30321b;
        if (i12 != i16 && (rp0Var = this.H) != null) {
            ((org.telegram.ui.iv) rp0Var).i(i16);
        }
    }

    public final void j() {
        qp0[] qp0VarArr;
        uo0 uo0Var = this.G;
        if (uo0Var != null) {
            org.telegram.messenger.i0.r(uo0Var);
            this.G = null;
        }
        this.E = false;
        for (qp0 qp0Var : this.f30320a) {
            org.telegram.ui.ActionBar.u5 u5Var = (org.telegram.ui.ActionBar.u5) qp0Var.f29719f;
            u5Var.setAlpha(1.0f);
            u5Var.setScaleX(1.0f);
            u5Var.setScaleY(1.0f);
            ((org.telegram.ui.ActionBar.u5) qp0Var.h).setAlpha(0.0f);
        }
    }

    public final void k() {
        qp0[] qp0VarArr = this.f30320a;
        qp0 qp0Var = qp0VarArr[0];
        qp0 qp0Var2 = qp0VarArr[1];
        qp0VarArr[0] = qp0Var2;
        qp0VarArr[1] = qp0Var;
        qp0Var2.getClass();
        qp0VarArr[0].setVisibility(0);
        qp0VarArr[0].setScaleX(0.8f);
        qp0VarArr[0].setScaleY(0.8f);
        qp0VarArr[0].setAlpha(0.0f);
        qp0VarArr[0].setTranslationY(org.telegram.messenger.i0.L(20.0f));
        ViewPropertyAnimator translationY = qp0VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        gr grVar = gr.h;
        org.telegram.messenger.z20.m(translationY, grVar, 320L);
        qp0 qp0Var3 = qp0VarArr[1];
        qp0Var3.getClass();
        qp0Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-org.telegram.messenger.i0.L(20.0f)).setInterpolator(grVar).setDuration(320L).withEndAction(new uo0(qp0Var3, 2)).start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.zs.f(this.f30322c).c(this, org.telegram.messenger.zs.f19711w0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.zs.f(this.f30322c).n(this, org.telegram.messenger.zs.f19711w0);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (qp0 qp0Var : this.f30320a) {
            ((LinearLayout) qp0Var.f29717b).setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(rp0 rp0Var) {
        this.H = rp0Var;
    }
}
