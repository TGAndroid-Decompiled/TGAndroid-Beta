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
public final class po0 extends FrameLayout implements org.telegram.messenger.ls {
    public static final int I = 0;
    public int D;
    public boolean E;
    public String F;
    public ob0 G;
    public oo0 H;
    public final fi.i1[] f37046a;
    public int f37047b;
    public int f37048c;
    public long d;
    public ArrayList f37049e;
    public final ArrayList f37050f;
    public boolean h;
    public boolean f37051n;
    public String f37052r;
    public final ArrayList f37053s;
    public final HashMap f37054w;
    public TLRPC.WebPage f37055x;
    public int f37056y;

    public po0(Activity activity, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity);
        this.f37046a = new fi.i1[2];
        this.f37047b = 0;
        this.f37050f = new ArrayList();
        this.f37051n = true;
        this.f37053s = new ArrayList();
        this.f37054w = new HashMap();
        int i7 = 0;
        while (true) {
            fi.i1[] i1VarArr = this.f37046a;
            if (i7 < i1VarArr.length) {
                i1VarArr[i7] = new fi.i1(this, activity, h6Var);
                addView(this.f37046a[i7], c8.ha.c(-1.0f, -1));
                i7++;
            } else {
                i1VarArr[0].setVisibility(0);
                this.f37046a[1].setVisibility(8);
                return;
            }
        }
    }

    public static void a(fi.i1 i1Var, TLRPC.WebPage webPage, String str) {
        k9 k9Var = (k9) i1Var.f12174r;
        ((ImageView) i1Var.f12170c).setImageResource(2131232204);
        ((ImageView) i1Var.f12170c).setVisibility(0);
        ((FrameLayout) i1Var.h).setVisibility(8);
        ((ImageView) i1Var.f12175s).setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        ((org.telegram.ui.ActionBar.m5) i1Var.d).l(str2, false);
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
        ((org.telegram.ui.ActionBar.m5) i1Var.f12171e).l(str3, false);
        TLRPC.Photo photo = webPage.photo;
        if (photo != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, 320, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(webPage.photo.sizes, org.telegram.messenger.g0.L(40.0f), false, null, false);
            if (w10 != null) {
                k9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                k9Var.g(1, 0L, webPage, "50_50", "50_50_b", null, org.telegram.messenger.hc.f(w10, webPage.photo), org.telegram.messenger.hc.f(w11, webPage.photo));
                k9Var.setVisibility(0);
            } else {
                k9Var.setVisibility(8);
            }
        } else {
            k9Var.setVisibility(8);
        }
        ((LinearLayout) i1Var.f12169b).setClickable(false);
    }

    public static void b(k9 k9Var, org.telegram.messenger.gf gfVar) {
        if (gfVar == null) {
            k9Var.setVisibility(8);
            return;
        }
        int i7 = gfVar.C;
        String str = gfVar.I;
        k9Var.setVisibility(0);
        k9Var.r();
        String str2 = gfVar.f26850c;
        if (str2 != null) {
            k9Var.h(str2, null, null);
        } else if (str != null) {
            if (gfVar.f26849b) {
                k9Var.h("vthumb://" + i7 + ":" + str, null, null);
                return;
            }
            k9Var.s(gfVar.J, gfVar.K, true);
            k9Var.h("thumb://" + i7 + ":" + str, null, null);
        } else {
            k9Var.setImageDrawable(null);
        }
    }

    public final String c(fi.i1 i1Var) {
        int measuredWidth;
        String s5;
        ArrayList arrayList = this.f37050f;
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
                    s5 = org.telegram.messenger.m5.l(this.f37048c, longValue);
                } else {
                    s5 = org.telegram.messenger.m5.s(this.f37048c, longValue);
                }
                sb2.append(s5);
            }
        }
        String a02 = org.telegram.messenger.id.a0(null, null, 2131745439, sb2.toString());
        org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) i1Var.f12171e;
        if (m5Var.getMeasuredWidth() <= 0) {
            measuredWidth = org.telegram.messenger.g0.f22567q.x - org.telegram.messenger.g0.L(140.0f);
        } else {
            measuredWidth = m5Var.getMeasuredWidth();
        }
        float f10 = measuredWidth;
        if (arrayList.size() <= 2 && m5Var.getPaint().measureText(a02) <= f10) {
            return a02;
        }
        return org.telegram.messenger.id.G(arrayList.size(), "ShareSendToMany", new Object[0]);
    }

    public final void d() {
        if (this.f37056y != 0) {
            ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.f37048c).f21770a).cancelRequest(this.f37056y, true);
            this.f37056y = 0;
        }
        this.D++;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        String str;
        if (i7 == org.telegram.messenger.qs.f25101w0 && this.f37055x != null && i10 == this.f37048c) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i11 = 0; i11 < hVar.m(); i11++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i11);
                if (webPage != null && webPage.f27115id == this.f37055x.f27115id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.f37055x = null;
                        d();
                        if (this.f37047b != 0) {
                            this.f37047b = 0;
                            oo0 oo0Var = this.H;
                            if (oo0Var != null) {
                                ((org.telegram.ui.iu) oo0Var).i(0);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (webPage instanceof TLRPC.TL_webPage) {
                        this.f37055x = webPage;
                        ArrayList arrayList = this.f37053s;
                        if (arrayList.isEmpty()) {
                            str = "";
                        } else {
                            str = TextUtils.join(" ", arrayList).toString();
                        }
                        HashMap hashMap = this.f37054w;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, webPage);
                        }
                        a(this.f37046a[0], webPage, str);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void e(java.lang.CharSequence r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.po0.e(java.lang.CharSequence, boolean):void");
    }

    public final k9 f(int i7) {
        k9[] k9VarArr;
        if (this.f37047b == 1 && (k9VarArr = (k9[]) this.f37046a[0].f12173n) != null && i7 >= 0 && i7 < k9VarArr.length && k9VarArr[i7].getVisibility() == 0) {
            return k9VarArr[i7];
        }
        return null;
    }

    public final void g(int i7) {
        h(i7);
        this.d = org.telegram.messenger.p10.i(org.telegram.messenger.c.a(i7).f21770a).e();
        this.f37049e = null;
        this.h = true;
        this.f37051n = true;
        this.f37052r = null;
        this.f37055x = null;
        d();
        this.f37053s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.f37055x;
    }

    public int getMode() {
        return this.f37047b;
    }

    public final void h(int i7) {
        int i10 = this.f37048c;
        int i11 = org.telegram.messenger.qs.f25101w0;
        if (i10 == i7) {
            this.f37048c = i7;
            if (isAttachedToWindow()) {
                org.telegram.messenger.qs.f(this.f37048c).c(this, i11);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            org.telegram.messenger.qs.f(this.f37048c).n(this, i11);
        }
        this.f37048c = i7;
        if (isAttachedToWindow()) {
            org.telegram.messenger.qs.f(this.f37048c).c(this, i11);
        }
    }

    public final void i(int i7, ArrayList arrayList) {
        boolean z9;
        oo0 oo0Var;
        org.telegram.messenger.gf gfVar;
        org.telegram.messenger.gf gfVar2;
        int i10;
        h(i7);
        this.d = org.telegram.messenger.p10.i(org.telegram.messenger.c.a(i7).f21770a).e();
        this.f37049e = arrayList;
        this.h = false;
        org.telegram.messenger.gf gfVar3 = null;
        this.f37055x = null;
        d();
        this.f37053s.clear();
        int i11 = this.f37047b;
        if (i11 != 1 && i11 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f37047b = 1;
        if (z9) {
            k();
        }
        fi.i1[] i1VarArr = this.f37046a;
        fi.i1 i1Var = i1VarArr[0];
        org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) i1Var.f12171e;
        k9[] k9VarArr = (k9[]) i1Var.f12173n;
        org.telegram.ui.ActionBar.m5 m5Var2 = (org.telegram.ui.ActionBar.m5) i1Var.d;
        ((ImageView) i1Var.f12170c).setImageResource(2131231112);
        ((ImageView) i1Var.f12170c).setVisibility(0);
        ((k9) i1Var.f12174r).setVisibility(8);
        ((FrameLayout) i1Var.h).setVisibility(0);
        ((ImageView) i1Var.f12175s).setVisibility(8);
        ((LinearLayout) i1Var.f12169b).setClickable(true);
        ArrayList arrayList2 = this.f37049e;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList2.get(i14);
                i14++;
                if (((org.telegram.messenger.gf) obj).f26849b) {
                    i12++;
                } else {
                    i13++;
                }
            }
            int size2 = arrayList2.size();
            if (size2 == 1) {
                if (((org.telegram.messenger.gf) arrayList2.get(0)).f26849b) {
                    i10 = 2131745433;
                } else {
                    i10 = 2131745444;
                }
                m5Var2.l(org.telegram.messenger.id.M0(i10, null), false);
            } else if (i12 == 0) {
                m5Var2.l(org.telegram.messenger.id.G(size2, "ShareSendPhotos", new Object[0]), false);
            } else if (i13 == 0) {
                m5Var2.l(org.telegram.messenger.id.G(size2, "ShareSendVideos", new Object[0]), false);
            } else {
                m5Var2.l(org.telegram.messenger.id.G(size2, "ShareSendItems", new Object[0]), false);
            }
            m5Var.l(c(i1Var), false);
            k9 k9Var = k9VarArr[0];
            if (arrayList2.size() > 0) {
                gfVar = (org.telegram.messenger.gf) arrayList2.get(0);
            } else {
                gfVar = null;
            }
            b(k9Var, gfVar);
            k9 k9Var2 = k9VarArr[1];
            if (arrayList2.size() > 1) {
                gfVar2 = (org.telegram.messenger.gf) arrayList2.get(1);
            } else {
                gfVar2 = null;
            }
            b(k9Var2, gfVar2);
            k9 k9Var3 = k9VarArr[2];
            if (arrayList2.size() > 2) {
                gfVar3 = (org.telegram.messenger.gf) arrayList2.get(2);
            }
            b(k9Var3, gfVar3);
        } else {
            m5Var2.l("", false);
            m5Var.l("", false);
            for (k9 k9Var4 : k9VarArr) {
                k9Var4.setVisibility(8);
            }
        }
        fi.i1 i1Var2 = i1VarArr[0];
        String str = this.F;
        if (str != null) {
            ((org.telegram.ui.ActionBar.m5) i1Var2.f12172f).l(str, false);
        }
        int i15 = this.f37047b;
        if (i11 != i15 && (oo0Var = this.H) != null) {
            ((org.telegram.ui.iu) oo0Var).i(i15);
        }
    }

    public final void j() {
        fi.i1[] i1VarArr;
        ob0 ob0Var = this.G;
        if (ob0Var != null) {
            org.telegram.messenger.g0.r(ob0Var);
            this.G = null;
        }
        this.E = false;
        for (fi.i1 i1Var : this.f37046a) {
            org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) i1Var.f12171e;
            m5Var.setAlpha(1.0f);
            m5Var.setScaleX(1.0f);
            m5Var.setScaleY(1.0f);
            ((org.telegram.ui.ActionBar.m5) i1Var.f12172f).setAlpha(0.0f);
        }
    }

    public final void k() {
        fi.i1[] i1VarArr = this.f37046a;
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
        wq wqVar = wq.h;
        org.telegram.messenger.camera.q.l(translationY, wqVar, 320L);
        fi.i1 i1Var3 = i1VarArr[1];
        i1Var3.getClass();
        i1Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-org.telegram.messenger.g0.L(20.0f)).setInterpolator(wqVar).setDuration(320L).withEndAction(new ob0(i1Var3, 27)).start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.qs.f(this.f37048c).c(this, org.telegram.messenger.qs.f25101w0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.f(this.f37048c).n(this, org.telegram.messenger.qs.f25101w0);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (fi.i1 i1Var : this.f37046a) {
            ((LinearLayout) i1Var.f12169b).setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(oo0 oo0Var) {
        this.H = oo0Var;
    }
}
