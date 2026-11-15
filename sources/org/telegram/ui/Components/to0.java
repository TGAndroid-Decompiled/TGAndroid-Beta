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
public final class to0 extends FrameLayout implements org.telegram.messenger.is {
    public static final int J = 0;
    public int E;
    public boolean F;
    public String G;
    public wa0 H;
    public so0 I;
    public final hi.k1[] f39753a;
    public int f39754b;
    public int f39755c;
    public long d;
    public ArrayList f39756e;
    public final ArrayList f39757f;
    public boolean h;
    public boolean f39758n;
    public String f39759r;
    public final ArrayList f39760s;
    public final HashMap f39761w;
    public TLRPC.WebPage f39762x;
    public int f39763y;

    public to0(Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.f39753a = new hi.k1[2];
        this.f39754b = 0;
        this.f39757f = new ArrayList();
        this.f39758n = true;
        this.f39760s = new ArrayList();
        this.f39761w = new HashMap();
        int i7 = 0;
        while (true) {
            hi.k1[] k1VarArr = this.f39753a;
            if (i7 < k1VarArr.length) {
                k1VarArr[i7] = new hi.k1(this, activity, e6Var);
                addView(this.f39753a[i7], c8.ja.c(-1.0f, -1));
                i7++;
            } else {
                k1VarArr[0].setVisibility(0);
                this.f39753a[1].setVisibility(8);
                return;
            }
        }
    }

    public static void a(hi.k1 k1Var, TLRPC.WebPage webPage, String str) {
        i9 i9Var = (i9) k1Var.f14494r;
        ((ImageView) k1Var.f14490c).setImageResource(2131232205);
        ((ImageView) k1Var.f14490c).setVisibility(0);
        ((FrameLayout) k1Var.h).setVisibility(8);
        ((ImageView) k1Var.f14495s).setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        ((org.telegram.ui.ActionBar.j5) k1Var.d).l(str2, false);
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
        ((org.telegram.ui.ActionBar.j5) k1Var.f14491e).l(str3, false);
        TLRPC.Photo photo = webPage.photo;
        if (photo != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, 320, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(webPage.photo.sizes, org.telegram.messenger.g0.L(40.0f), false, null, false);
            if (w10 != null) {
                i9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                i9Var.g(1, 0L, webPage, "50_50", "50_50_b", null, org.telegram.messenger.gc.f(w10, webPage.photo), org.telegram.messenger.gc.f(w11, webPage.photo));
                i9Var.setVisibility(0);
            } else {
                i9Var.setVisibility(8);
            }
        } else {
            i9Var.setVisibility(8);
        }
        ((LinearLayout) k1Var.f14489b).setClickable(false);
    }

    public static void b(i9 i9Var, org.telegram.messenger.ff ffVar) {
        if (ffVar == null) {
            i9Var.setVisibility(8);
            return;
        }
        int i7 = ffVar.C;
        String str = ffVar.I;
        i9Var.setVisibility(0);
        i9Var.r();
        String str2 = ffVar.f27711c;
        if (str2 != null) {
            i9Var.h(str2, null, null);
        } else if (str != null) {
            if (ffVar.f27710b) {
                i9Var.h("vthumb://" + i7 + ":" + str, null, null);
                return;
            }
            i9Var.s(ffVar.J, ffVar.K, true);
            i9Var.h("thumb://" + i7 + ":" + str, null, null);
        } else {
            i9Var.setImageDrawable(null);
        }
    }

    public final String c(hi.k1 k1Var) {
        int measuredWidth;
        String s5;
        ArrayList arrayList = this.f39757f;
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
                sb2.append(org.telegram.messenger.hd.M0(2131745901, null));
            } else {
                if (arrayList.size() == 1) {
                    s5 = org.telegram.messenger.m5.l(this.f39755c, longValue);
                } else {
                    s5 = org.telegram.messenger.m5.s(this.f39755c, longValue);
                }
                sb2.append(s5);
            }
        }
        String a02 = org.telegram.messenger.hd.a0(null, null, 2131745439, sb2.toString());
        org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) k1Var.f14491e;
        if (j5Var.getMeasuredWidth() <= 0) {
            measuredWidth = org.telegram.messenger.g0.f23611q.x - org.telegram.messenger.g0.L(140.0f);
        } else {
            measuredWidth = j5Var.getMeasuredWidth();
        }
        float f10 = measuredWidth;
        if (arrayList.size() <= 2 && j5Var.getPaint().measureText(a02) <= f10) {
            return a02;
        }
        return org.telegram.messenger.hd.G(arrayList.size(), "ShareSendToMany", new Object[0]);
    }

    public final void d() {
        if (this.f39763y != 0) {
            ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.f39755c).f22782a).cancelRequest(this.f39763y, true);
            this.f39763y = 0;
        }
        this.E++;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        String str;
        if (i7 == org.telegram.messenger.ns.f25594w0 && this.f39762x != null && i10 == this.f39755c) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i11 = 0; i11 < hVar.m(); i11++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i11);
                if (webPage != null && webPage.f28206id == this.f39762x.f28206id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.f39762x = null;
                        d();
                        if (this.f39754b != 0) {
                            this.f39754b = 0;
                            so0 so0Var = this.I;
                            if (so0Var != null) {
                                ((org.telegram.ui.hu) so0Var).g(0);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (webPage instanceof TLRPC.TL_webPage) {
                        this.f39762x = webPage;
                        ArrayList arrayList = this.f39760s;
                        if (arrayList.isEmpty()) {
                            str = "";
                        } else {
                            str = TextUtils.join(" ", arrayList).toString();
                        }
                        HashMap hashMap = this.f39761w;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, webPage);
                        }
                        a(this.f39753a[0], webPage, str);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void e(java.lang.CharSequence r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.to0.e(java.lang.CharSequence, boolean):void");
    }

    public final i9 f(int i7) {
        i9[] i9VarArr;
        if (this.f39754b == 1 && (i9VarArr = (i9[]) this.f39753a[0].f14493n) != null && i7 >= 0 && i7 < i9VarArr.length && i9VarArr[i7].getVisibility() == 0) {
            return i9VarArr[i7];
        }
        return null;
    }

    public final void g(int i7) {
        h(i7);
        this.d = org.telegram.messenger.m10.i(org.telegram.messenger.c.a(i7).f22782a).e();
        this.f39756e = null;
        this.h = true;
        this.f39758n = true;
        this.f39759r = null;
        this.f39762x = null;
        d();
        this.f39760s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.f39762x;
    }

    public int getMode() {
        return this.f39754b;
    }

    public final void h(int i7) {
        int i10 = this.f39755c;
        int i11 = org.telegram.messenger.ns.f25594w0;
        if (i10 == i7) {
            this.f39755c = i7;
            if (isAttachedToWindow()) {
                org.telegram.messenger.ns.f(this.f39755c).c(this, i11);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            org.telegram.messenger.ns.f(this.f39755c).n(this, i11);
        }
        this.f39755c = i7;
        if (isAttachedToWindow()) {
            org.telegram.messenger.ns.f(this.f39755c).c(this, i11);
        }
    }

    public final void i(int i7, ArrayList arrayList) {
        boolean z10;
        so0 so0Var;
        org.telegram.messenger.ff ffVar;
        org.telegram.messenger.ff ffVar2;
        int i10;
        h(i7);
        this.d = org.telegram.messenger.m10.i(org.telegram.messenger.c.a(i7).f22782a).e();
        this.f39756e = arrayList;
        this.h = false;
        org.telegram.messenger.ff ffVar3 = null;
        this.f39762x = null;
        d();
        this.f39760s.clear();
        int i11 = this.f39754b;
        if (i11 != 1 && i11 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f39754b = 1;
        if (z10) {
            k();
        }
        hi.k1[] k1VarArr = this.f39753a;
        hi.k1 k1Var = k1VarArr[0];
        org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) k1Var.f14491e;
        i9[] i9VarArr = (i9[]) k1Var.f14493n;
        org.telegram.ui.ActionBar.j5 j5Var2 = (org.telegram.ui.ActionBar.j5) k1Var.d;
        ((ImageView) k1Var.f14490c).setImageResource(2131231112);
        ((ImageView) k1Var.f14490c).setVisibility(0);
        ((i9) k1Var.f14494r).setVisibility(8);
        ((FrameLayout) k1Var.h).setVisibility(0);
        ((ImageView) k1Var.f14495s).setVisibility(8);
        ((LinearLayout) k1Var.f14489b).setClickable(true);
        ArrayList arrayList2 = this.f39756e;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList2.get(i14);
                i14++;
                if (((org.telegram.messenger.ff) obj).f27710b) {
                    i12++;
                } else {
                    i13++;
                }
            }
            int size2 = arrayList2.size();
            if (size2 == 1) {
                if (((org.telegram.messenger.ff) arrayList2.get(0)).f27710b) {
                    i10 = 2131745433;
                } else {
                    i10 = 2131745444;
                }
                j5Var2.l(org.telegram.messenger.hd.M0(i10, null), false);
            } else if (i12 == 0) {
                j5Var2.l(org.telegram.messenger.hd.G(size2, "ShareSendPhotos", new Object[0]), false);
            } else if (i13 == 0) {
                j5Var2.l(org.telegram.messenger.hd.G(size2, "ShareSendVideos", new Object[0]), false);
            } else {
                j5Var2.l(org.telegram.messenger.hd.G(size2, "ShareSendItems", new Object[0]), false);
            }
            j5Var.l(c(k1Var), false);
            i9 i9Var = i9VarArr[0];
            if (arrayList2.size() > 0) {
                ffVar = (org.telegram.messenger.ff) arrayList2.get(0);
            } else {
                ffVar = null;
            }
            b(i9Var, ffVar);
            i9 i9Var2 = i9VarArr[1];
            if (arrayList2.size() > 1) {
                ffVar2 = (org.telegram.messenger.ff) arrayList2.get(1);
            } else {
                ffVar2 = null;
            }
            b(i9Var2, ffVar2);
            i9 i9Var3 = i9VarArr[2];
            if (arrayList2.size() > 2) {
                ffVar3 = (org.telegram.messenger.ff) arrayList2.get(2);
            }
            b(i9Var3, ffVar3);
        } else {
            j5Var2.l("", false);
            j5Var.l("", false);
            for (i9 i9Var4 : i9VarArr) {
                i9Var4.setVisibility(8);
            }
        }
        hi.k1 k1Var2 = k1VarArr[0];
        String str = this.G;
        if (str != null) {
            ((org.telegram.ui.ActionBar.j5) k1Var2.f14492f).l(str, false);
        }
        int i15 = this.f39754b;
        if (i11 != i15 && (so0Var = this.I) != null) {
            ((org.telegram.ui.hu) so0Var).g(i15);
        }
    }

    public final void j() {
        hi.k1[] k1VarArr;
        wa0 wa0Var = this.H;
        if (wa0Var != null) {
            org.telegram.messenger.g0.r(wa0Var);
            this.H = null;
        }
        this.F = false;
        for (hi.k1 k1Var : this.f39753a) {
            org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) k1Var.f14491e;
            j5Var.setAlpha(1.0f);
            j5Var.setScaleX(1.0f);
            j5Var.setScaleY(1.0f);
            ((org.telegram.ui.ActionBar.j5) k1Var.f14492f).setAlpha(0.0f);
        }
    }

    public final void k() {
        hi.k1[] k1VarArr = this.f39753a;
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
        er erVar = er.h;
        org.telegram.messenger.i20.n(translationY, erVar, 320L);
        hi.k1 k1Var3 = k1VarArr[1];
        k1Var3.getClass();
        k1Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-org.telegram.messenger.g0.L(20.0f)).setInterpolator(erVar).setDuration(320L).withEndAction(new ro0(k1Var3, 0)).start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ns.f(this.f39755c).c(this, org.telegram.messenger.ns.f25594w0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ns.f(this.f39755c).n(this, org.telegram.messenger.ns.f25594w0);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (hi.k1 k1Var : this.f39753a) {
            ((LinearLayout) k1Var.f14489b).setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(so0 so0Var) {
        this.I = so0Var;
    }
}
