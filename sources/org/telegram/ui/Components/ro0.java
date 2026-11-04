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
public final class ro0 extends FrameLayout implements org.telegram.messenger.cs {
    public static final int J = 0;
    public int E;
    public boolean F;
    public String G;
    public jb0 H;
    public qo0 I;
    public final gi.i1[] f37763a;
    public int f37764b;
    public int f37765c;
    public long d;
    public ArrayList f37766e;
    public final ArrayList f37767f;
    public boolean h;
    public boolean f37768n;
    public String f37769r;
    public final ArrayList f37770s;
    public final HashMap f37771w;
    public TLRPC.WebPage f37772x;
    public int f37773y;

    public ro0(Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.f37763a = new gi.i1[2];
        this.f37764b = 0;
        this.f37767f = new ArrayList();
        this.f37768n = true;
        this.f37770s = new ArrayList();
        this.f37771w = new HashMap();
        int i3 = 0;
        while (true) {
            gi.i1[] i1VarArr = this.f37763a;
            if (i3 < i1VarArr.length) {
                i1VarArr[i3] = new gi.i1(this, activity, e6Var);
                addView(this.f37763a[i3], b8.mf.c(-1.0f, -1));
                i3++;
            } else {
                i1VarArr[0].setVisibility(0);
                this.f37763a[1].setVisibility(8);
                return;
            }
        }
    }

    public static void a(gi.i1 i1Var, TLRPC.WebPage webPage, String str) {
        k9 k9Var = (k9) i1Var.f12947r;
        ((ImageView) i1Var.f12943c).setImageResource(2131232204);
        ((ImageView) i1Var.f12943c).setVisibility(0);
        ((FrameLayout) i1Var.h).setVisibility(8);
        ((ImageView) i1Var.f12948s).setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        ((org.telegram.ui.ActionBar.k5) i1Var.d).l(str2, false);
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
        ((org.telegram.ui.ActionBar.k5) i1Var.f12944e).l(str3, false);
        TLRPC.Photo photo = webPage.photo;
        if (photo != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, 320, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(webPage.photo.sizes, org.telegram.messenger.g0.L(40.0f), false, null, false);
            if (w10 != null) {
                k9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                k9Var.g(1, 0L, webPage, "50_50", "50_50_b", null, org.telegram.messenger.ac.f(w10, webPage.photo), org.telegram.messenger.ac.f(w11, webPage.photo));
                k9Var.setVisibility(0);
            } else {
                k9Var.setVisibility(8);
            }
        } else {
            k9Var.setVisibility(8);
        }
        ((LinearLayout) i1Var.f12942b).setClickable(false);
    }

    public static void b(k9 k9Var, org.telegram.messenger.ye yeVar) {
        if (yeVar == null) {
            k9Var.setVisibility(8);
            return;
        }
        int i3 = yeVar.C;
        String str = yeVar.I;
        k9Var.setVisibility(0);
        k9Var.r();
        String str2 = yeVar.f25311c;
        if (str2 != null) {
            k9Var.h(str2, null, null);
        } else if (str != null) {
            if (yeVar.f25310b) {
                k9Var.h("vthumb://" + i3 + ":" + str, null, null);
                return;
            }
            k9Var.s(yeVar.J, yeVar.K, true);
            k9Var.h("thumb://" + i3 + ":" + str, null, null);
        } else {
            k9Var.setImageDrawable(null);
        }
    }

    public final String c(gi.i1 i1Var) {
        int measuredWidth;
        String s6;
        ArrayList arrayList = this.f37767f;
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            long longValue = ((Long) obj).longValue();
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            if (longValue == this.d) {
                sb2.append(org.telegram.messenger.bd.M0(2131745911, null));
            } else {
                if (arrayList.size() == 1) {
                    s6 = org.telegram.messenger.m5.l(this.f37765c, longValue);
                } else {
                    s6 = org.telegram.messenger.m5.s(this.f37765c, longValue);
                }
                sb2.append(s6);
            }
        }
        String a02 = org.telegram.messenger.bd.a0(null, null, 2131745449, sb2.toString());
        org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) i1Var.f12944e;
        if (k5Var.getMeasuredWidth() <= 0) {
            measuredWidth = org.telegram.messenger.g0.f22608q.x - org.telegram.messenger.g0.L(140.0f);
        } else {
            measuredWidth = k5Var.getMeasuredWidth();
        }
        float f10 = measuredWidth;
        if (arrayList.size() <= 2 && k5Var.getPaint().measureText(a02) <= f10) {
            return a02;
        }
        return org.telegram.messenger.bd.G(arrayList.size(), "ShareSendToMany", new Object[0]);
    }

    public final void d() {
        if (this.f37773y != 0) {
            ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.f37765c).f21919a).cancelRequest(this.f37773y, true);
            this.f37773y = 0;
        }
        this.E++;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        String str;
        if (i3 == org.telegram.messenger.hs.f23326w0 && this.f37772x != null && i10 == this.f37765c) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i11 = 0; i11 < hVar.m(); i11++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i11);
                if (webPage != null && webPage.f27156id == this.f37772x.f27156id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.f37772x = null;
                        d();
                        if (this.f37764b != 0) {
                            this.f37764b = 0;
                            qo0 qo0Var = this.I;
                            if (qo0Var != null) {
                                ((org.telegram.ui.du) qo0Var).i(0);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (webPage instanceof TLRPC.TL_webPage) {
                        this.f37772x = webPage;
                        ArrayList arrayList = this.f37770s;
                        if (arrayList.isEmpty()) {
                            str = "";
                        } else {
                            str = TextUtils.join(" ", arrayList).toString();
                        }
                        HashMap hashMap = this.f37771w;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, webPage);
                        }
                        a(this.f37763a[0], webPage, str);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void e(java.lang.CharSequence r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ro0.e(java.lang.CharSequence, boolean):void");
    }

    public final k9 f(int i3) {
        k9[] k9VarArr;
        if (this.f37764b == 1 && (k9VarArr = (k9[]) this.f37763a[0].f12946n) != null && i3 >= 0 && i3 < k9VarArr.length && k9VarArr[i3].getVisibility() == 0) {
            return k9VarArr[i3];
        }
        return null;
    }

    public final void g(int i3) {
        h(i3);
        this.d = org.telegram.messenger.h10.i(org.telegram.messenger.c.a(i3).f21919a).e();
        this.f37766e = null;
        this.h = true;
        this.f37768n = true;
        this.f37769r = null;
        this.f37772x = null;
        d();
        this.f37770s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.f37772x;
    }

    public int getMode() {
        return this.f37764b;
    }

    public final void h(int i3) {
        int i10 = this.f37765c;
        int i11 = org.telegram.messenger.hs.f23326w0;
        if (i10 == i3) {
            this.f37765c = i3;
            if (isAttachedToWindow()) {
                org.telegram.messenger.hs.f(this.f37765c).c(this, i11);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            org.telegram.messenger.hs.f(this.f37765c).n(this, i11);
        }
        this.f37765c = i3;
        if (isAttachedToWindow()) {
            org.telegram.messenger.hs.f(this.f37765c).c(this, i11);
        }
    }

    public final void i(int i3, ArrayList arrayList) {
        boolean z10;
        qo0 qo0Var;
        org.telegram.messenger.ye yeVar;
        org.telegram.messenger.ye yeVar2;
        int i10;
        h(i3);
        this.d = org.telegram.messenger.h10.i(org.telegram.messenger.c.a(i3).f21919a).e();
        this.f37766e = arrayList;
        this.h = false;
        org.telegram.messenger.ye yeVar3 = null;
        this.f37772x = null;
        d();
        this.f37770s.clear();
        int i11 = this.f37764b;
        if (i11 != 1 && i11 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f37764b = 1;
        if (z10) {
            k();
        }
        gi.i1[] i1VarArr = this.f37763a;
        gi.i1 i1Var = i1VarArr[0];
        org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) i1Var.f12944e;
        k9[] k9VarArr = (k9[]) i1Var.f12946n;
        org.telegram.ui.ActionBar.k5 k5Var2 = (org.telegram.ui.ActionBar.k5) i1Var.d;
        ((ImageView) i1Var.f12943c).setImageResource(2131231112);
        ((ImageView) i1Var.f12943c).setVisibility(0);
        ((k9) i1Var.f12947r).setVisibility(8);
        ((FrameLayout) i1Var.h).setVisibility(0);
        ((ImageView) i1Var.f12948s).setVisibility(8);
        ((LinearLayout) i1Var.f12942b).setClickable(true);
        ArrayList arrayList2 = this.f37766e;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList2.get(i14);
                i14++;
                if (((org.telegram.messenger.ye) obj).f25310b) {
                    i12++;
                } else {
                    i13++;
                }
            }
            int size2 = arrayList2.size();
            if (size2 == 1) {
                if (((org.telegram.messenger.ye) arrayList2.get(0)).f25310b) {
                    i10 = 2131745443;
                } else {
                    i10 = 2131745454;
                }
                k5Var2.l(org.telegram.messenger.bd.M0(i10, null), false);
            } else if (i12 == 0) {
                k5Var2.l(org.telegram.messenger.bd.G(size2, "ShareSendPhotos", new Object[0]), false);
            } else if (i13 == 0) {
                k5Var2.l(org.telegram.messenger.bd.G(size2, "ShareSendVideos", new Object[0]), false);
            } else {
                k5Var2.l(org.telegram.messenger.bd.G(size2, "ShareSendItems", new Object[0]), false);
            }
            k5Var.l(c(i1Var), false);
            k9 k9Var = k9VarArr[0];
            if (arrayList2.size() > 0) {
                yeVar = (org.telegram.messenger.ye) arrayList2.get(0);
            } else {
                yeVar = null;
            }
            b(k9Var, yeVar);
            k9 k9Var2 = k9VarArr[1];
            if (arrayList2.size() > 1) {
                yeVar2 = (org.telegram.messenger.ye) arrayList2.get(1);
            } else {
                yeVar2 = null;
            }
            b(k9Var2, yeVar2);
            k9 k9Var3 = k9VarArr[2];
            if (arrayList2.size() > 2) {
                yeVar3 = (org.telegram.messenger.ye) arrayList2.get(2);
            }
            b(k9Var3, yeVar3);
        } else {
            k5Var2.l("", false);
            k5Var.l("", false);
            for (k9 k9Var4 : k9VarArr) {
                k9Var4.setVisibility(8);
            }
        }
        gi.i1 i1Var2 = i1VarArr[0];
        String str = this.G;
        if (str != null) {
            ((org.telegram.ui.ActionBar.k5) i1Var2.f12945f).l(str, false);
        }
        int i15 = this.f37764b;
        if (i11 != i15 && (qo0Var = this.I) != null) {
            ((org.telegram.ui.du) qo0Var).i(i15);
        }
    }

    public final void j() {
        gi.i1[] i1VarArr;
        jb0 jb0Var = this.H;
        if (jb0Var != null) {
            org.telegram.messenger.g0.r(jb0Var);
            this.H = null;
        }
        this.F = false;
        for (gi.i1 i1Var : this.f37763a) {
            org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) i1Var.f12944e;
            k5Var.setAlpha(1.0f);
            k5Var.setScaleX(1.0f);
            k5Var.setScaleY(1.0f);
            ((org.telegram.ui.ActionBar.k5) i1Var.f12945f).setAlpha(0.0f);
        }
    }

    public final void k() {
        gi.i1[] i1VarArr = this.f37763a;
        gi.i1 i1Var = i1VarArr[0];
        gi.i1 i1Var2 = i1VarArr[1];
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
        gi.i1 i1Var3 = i1VarArr[1];
        i1Var3.getClass();
        i1Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-org.telegram.messenger.g0.L(20.0f)).setInterpolator(xqVar).setDuration(320L).withEndAction(new jb0(i1Var3, 29)).start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.hs.f(this.f37765c).c(this, org.telegram.messenger.hs.f23326w0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.f(this.f37765c).n(this, org.telegram.messenger.hs.f23326w0);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (gi.i1 i1Var : this.f37763a) {
            ((LinearLayout) i1Var.f12942b).setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(qo0 qo0Var) {
        this.I = qo0Var;
    }
}
