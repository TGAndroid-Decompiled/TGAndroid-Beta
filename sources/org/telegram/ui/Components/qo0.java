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
public final class qo0 extends FrameLayout implements org.telegram.messenger.ls {
    public static final int I = 0;
    public int D;
    public boolean E;
    public String F;
    public pb0 G;
    public po0 H;
    public final fi.i1[] f37447a;
    public int f37448b;
    public int f37449c;
    public long d;
    public ArrayList f37450e;
    public final ArrayList f37451f;
    public boolean h;
    public boolean f37452n;
    public String f37453r;
    public final ArrayList f37454s;
    public final HashMap f37455w;
    public TLRPC.WebPage f37456x;
    public int f37457y;

    public qo0(Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        this.f37447a = new fi.i1[2];
        this.f37448b = 0;
        this.f37451f = new ArrayList();
        this.f37452n = true;
        this.f37454s = new ArrayList();
        this.f37455w = new HashMap();
        int i7 = 0;
        while (true) {
            fi.i1[] i1VarArr = this.f37447a;
            if (i7 < i1VarArr.length) {
                i1VarArr[i7] = new fi.i1(this, activity, g6Var);
                addView(this.f37447a[i7], c8.ha.c(-1.0f, -1));
                i7++;
            } else {
                i1VarArr[0].setVisibility(0);
                this.f37447a[1].setVisibility(8);
                return;
            }
        }
    }

    public static void a(fi.i1 i1Var, TLRPC.WebPage webPage, String str) {
        l9 l9Var = (l9) i1Var.f12170r;
        ((ImageView) i1Var.f12166c).setImageResource(2131232204);
        ((ImageView) i1Var.f12166c).setVisibility(0);
        ((FrameLayout) i1Var.h).setVisibility(8);
        ((ImageView) i1Var.f12171s).setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        ((org.telegram.ui.ActionBar.l5) i1Var.d).l(str2, false);
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
        ((org.telegram.ui.ActionBar.l5) i1Var.f12167e).l(str3, false);
        TLRPC.Photo photo = webPage.photo;
        if (photo != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, 320, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(webPage.photo.sizes, org.telegram.messenger.g0.L(40.0f), false, null, false);
            if (w10 != null) {
                l9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                l9Var.g(1, 0L, webPage, "50_50", "50_50_b", null, org.telegram.messenger.hc.f(w10, webPage.photo), org.telegram.messenger.hc.f(w11, webPage.photo));
                l9Var.setVisibility(0);
            } else {
                l9Var.setVisibility(8);
            }
        } else {
            l9Var.setVisibility(8);
        }
        ((LinearLayout) i1Var.f12165b).setClickable(false);
    }

    public static void b(l9 l9Var, org.telegram.messenger.gf gfVar) {
        if (gfVar == null) {
            l9Var.setVisibility(8);
            return;
        }
        int i7 = gfVar.C;
        String str = gfVar.I;
        l9Var.setVisibility(0);
        l9Var.r();
        String str2 = gfVar.f26846c;
        if (str2 != null) {
            l9Var.h(str2, null, null);
        } else if (str != null) {
            if (gfVar.f26845b) {
                l9Var.h("vthumb://" + i7 + ":" + str, null, null);
                return;
            }
            l9Var.s(gfVar.J, gfVar.K, true);
            l9Var.h("thumb://" + i7 + ":" + str, null, null);
        } else {
            l9Var.setImageDrawable(null);
        }
    }

    public final String c(fi.i1 i1Var) {
        int measuredWidth;
        String s5;
        ArrayList arrayList = this.f37451f;
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
                sb2.append(org.telegram.messenger.id.M0(2131745901, null));
            } else {
                if (arrayList.size() == 1) {
                    s5 = org.telegram.messenger.m5.l(this.f37449c, longValue);
                } else {
                    s5 = org.telegram.messenger.m5.s(this.f37449c, longValue);
                }
                sb2.append(s5);
            }
        }
        String a02 = org.telegram.messenger.id.a0(null, null, 2131745439, sb2.toString());
        org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) i1Var.f12167e;
        if (l5Var.getMeasuredWidth() <= 0) {
            measuredWidth = org.telegram.messenger.g0.f22563q.x - org.telegram.messenger.g0.L(140.0f);
        } else {
            measuredWidth = l5Var.getMeasuredWidth();
        }
        float f10 = measuredWidth;
        if (arrayList.size() <= 2 && l5Var.getPaint().measureText(a02) <= f10) {
            return a02;
        }
        return org.telegram.messenger.id.G(arrayList.size(), "ShareSendToMany", new Object[0]);
    }

    public final void d() {
        if (this.f37457y != 0) {
            ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.f37449c).f21765a).cancelRequest(this.f37457y, true);
            this.f37457y = 0;
        }
        this.D++;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        String str;
        if (i7 == org.telegram.messenger.qs.f25097w0 && this.f37456x != null && i10 == this.f37449c) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i11 = 0; i11 < hVar.m(); i11++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i11);
                if (webPage != null && webPage.f27111id == this.f37456x.f27111id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.f37456x = null;
                        d();
                        if (this.f37448b != 0) {
                            this.f37448b = 0;
                            po0 po0Var = this.H;
                            if (po0Var != null) {
                                ((org.telegram.ui.hu) po0Var).i(0);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (webPage instanceof TLRPC.TL_webPage) {
                        this.f37456x = webPage;
                        ArrayList arrayList = this.f37454s;
                        if (arrayList.isEmpty()) {
                            str = "";
                        } else {
                            str = TextUtils.join(" ", arrayList).toString();
                        }
                        HashMap hashMap = this.f37455w;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, webPage);
                        }
                        a(this.f37447a[0], webPage, str);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void e(java.lang.CharSequence r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qo0.e(java.lang.CharSequence, boolean):void");
    }

    public final l9 f(int i7) {
        l9[] l9VarArr;
        if (this.f37448b == 1 && (l9VarArr = (l9[]) this.f37447a[0].f12169n) != null && i7 >= 0 && i7 < l9VarArr.length && l9VarArr[i7].getVisibility() == 0) {
            return l9VarArr[i7];
        }
        return null;
    }

    public final void g(int i7) {
        h(i7);
        this.d = org.telegram.messenger.p10.i(org.telegram.messenger.c.a(i7).f21765a).e();
        this.f37450e = null;
        this.h = true;
        this.f37452n = true;
        this.f37453r = null;
        this.f37456x = null;
        d();
        this.f37454s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.f37456x;
    }

    public int getMode() {
        return this.f37448b;
    }

    public final void h(int i7) {
        int i10 = this.f37449c;
        int i11 = org.telegram.messenger.qs.f25097w0;
        if (i10 == i7) {
            this.f37449c = i7;
            if (isAttachedToWindow()) {
                org.telegram.messenger.qs.f(this.f37449c).c(this, i11);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            org.telegram.messenger.qs.f(this.f37449c).n(this, i11);
        }
        this.f37449c = i7;
        if (isAttachedToWindow()) {
            org.telegram.messenger.qs.f(this.f37449c).c(this, i11);
        }
    }

    public final void i(int i7, ArrayList arrayList) {
        boolean z9;
        po0 po0Var;
        org.telegram.messenger.gf gfVar;
        org.telegram.messenger.gf gfVar2;
        int i10;
        h(i7);
        this.d = org.telegram.messenger.p10.i(org.telegram.messenger.c.a(i7).f21765a).e();
        this.f37450e = arrayList;
        this.h = false;
        org.telegram.messenger.gf gfVar3 = null;
        this.f37456x = null;
        d();
        this.f37454s.clear();
        int i11 = this.f37448b;
        if (i11 != 1 && i11 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f37448b = 1;
        if (z9) {
            k();
        }
        fi.i1[] i1VarArr = this.f37447a;
        fi.i1 i1Var = i1VarArr[0];
        org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) i1Var.f12167e;
        l9[] l9VarArr = (l9[]) i1Var.f12169n;
        org.telegram.ui.ActionBar.l5 l5Var2 = (org.telegram.ui.ActionBar.l5) i1Var.d;
        ((ImageView) i1Var.f12166c).setImageResource(2131231112);
        ((ImageView) i1Var.f12166c).setVisibility(0);
        ((l9) i1Var.f12170r).setVisibility(8);
        ((FrameLayout) i1Var.h).setVisibility(0);
        ((ImageView) i1Var.f12171s).setVisibility(8);
        ((LinearLayout) i1Var.f12165b).setClickable(true);
        ArrayList arrayList2 = this.f37450e;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList2.get(i14);
                i14++;
                if (((org.telegram.messenger.gf) obj).f26845b) {
                    i12++;
                } else {
                    i13++;
                }
            }
            int size2 = arrayList2.size();
            if (size2 == 1) {
                if (((org.telegram.messenger.gf) arrayList2.get(0)).f26845b) {
                    i10 = 2131745433;
                } else {
                    i10 = 2131745444;
                }
                l5Var2.l(org.telegram.messenger.id.M0(i10, null), false);
            } else if (i12 == 0) {
                l5Var2.l(org.telegram.messenger.id.G(size2, "ShareSendPhotos", new Object[0]), false);
            } else if (i13 == 0) {
                l5Var2.l(org.telegram.messenger.id.G(size2, "ShareSendVideos", new Object[0]), false);
            } else {
                l5Var2.l(org.telegram.messenger.id.G(size2, "ShareSendItems", new Object[0]), false);
            }
            l5Var.l(c(i1Var), false);
            l9 l9Var = l9VarArr[0];
            if (arrayList2.size() > 0) {
                gfVar = (org.telegram.messenger.gf) arrayList2.get(0);
            } else {
                gfVar = null;
            }
            b(l9Var, gfVar);
            l9 l9Var2 = l9VarArr[1];
            if (arrayList2.size() > 1) {
                gfVar2 = (org.telegram.messenger.gf) arrayList2.get(1);
            } else {
                gfVar2 = null;
            }
            b(l9Var2, gfVar2);
            l9 l9Var3 = l9VarArr[2];
            if (arrayList2.size() > 2) {
                gfVar3 = (org.telegram.messenger.gf) arrayList2.get(2);
            }
            b(l9Var3, gfVar3);
        } else {
            l5Var2.l("", false);
            l5Var.l("", false);
            for (l9 l9Var4 : l9VarArr) {
                l9Var4.setVisibility(8);
            }
        }
        fi.i1 i1Var2 = i1VarArr[0];
        String str = this.F;
        if (str != null) {
            ((org.telegram.ui.ActionBar.l5) i1Var2.f12168f).l(str, false);
        }
        int i15 = this.f37448b;
        if (i11 != i15 && (po0Var = this.H) != null) {
            ((org.telegram.ui.hu) po0Var).i(i15);
        }
    }

    public final void j() {
        fi.i1[] i1VarArr;
        pb0 pb0Var = this.G;
        if (pb0Var != null) {
            org.telegram.messenger.g0.r(pb0Var);
            this.G = null;
        }
        this.E = false;
        for (fi.i1 i1Var : this.f37447a) {
            org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) i1Var.f12167e;
            l5Var.setAlpha(1.0f);
            l5Var.setScaleX(1.0f);
            l5Var.setScaleY(1.0f);
            ((org.telegram.ui.ActionBar.l5) i1Var.f12168f).setAlpha(0.0f);
        }
    }

    public final void k() {
        fi.i1[] i1VarArr = this.f37447a;
        fi.i1 i1Var = i1VarArr[0];
        fi.i1 i1Var2 = i1VarArr[1];
        i1VarArr[0] = i1Var2;
        i1VarArr[1] = i1Var;
        i1Var2.getClass();
        i1VarArr[0].setVisibility(0);
        i1VarArr[0].setScaleX(0.8f);
        i1VarArr[0].setScaleY(0.8f);
        i1VarArr[0].setAlpha(0.0f);
        i1VarArr[0].setTranslationY(org.telegram.messenger.g0.L(20.0f));
        ViewPropertyAnimator translationY = i1VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        xq xqVar = xq.h;
        org.telegram.messenger.camera.q.l(translationY, xqVar, 320L);
        fi.i1 i1Var3 = i1VarArr[1];
        i1Var3.getClass();
        i1Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-org.telegram.messenger.g0.L(20.0f)).setInterpolator(xqVar).setDuration(320L).withEndAction(new pb0(i1Var3, 27)).start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.qs.f(this.f37449c).c(this, org.telegram.messenger.qs.f25097w0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.f(this.f37449c).n(this, org.telegram.messenger.qs.f25097w0);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (fi.i1 i1Var : this.f37447a) {
            ((LinearLayout) i1Var.f12165b).setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(po0 po0Var) {
        this.H = po0Var;
    }
}
