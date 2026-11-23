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
public final class dp0 extends FrameLayout implements org.telegram.messenger.fs {
    public static final int J = 0;
    public int E;
    public boolean F;
    public String G;
    public eb0 H;
    public cp0 I;
    public final hi.s1[] f34421a;
    public int f34422b;
    public int f34423c;
    public long d;
    public ArrayList f34424e;
    public final ArrayList f34425f;
    public boolean h;
    public boolean f34426n;
    public String f34427r;
    public final ArrayList f34428s;
    public final HashMap f34429w;
    public TLRPC.WebPage f34430x;
    public int f34431y;

    public dp0(Activity activity, org.telegram.ui.ActionBar.i6 i6Var) {
        super(activity);
        this.f34421a = new hi.s1[2];
        this.f34422b = 0;
        this.f34425f = new ArrayList();
        this.f34426n = true;
        this.f34428s = new ArrayList();
        this.f34429w = new HashMap();
        int i7 = 0;
        while (true) {
            hi.s1[] s1VarArr = this.f34421a;
            if (i7 < s1VarArr.length) {
                s1VarArr[i7] = new hi.s1(this, activity, i6Var);
                addView(this.f34421a[i7], c8.na.c(-1.0f, -1));
                i7++;
            } else {
                s1VarArr[0].setVisibility(0);
                this.f34421a[1].setVisibility(8);
                return;
            }
        }
    }

    public static void a(hi.s1 s1Var, TLRPC.WebPage webPage, String str) {
        p9 p9Var = (p9) s1Var.f15369r;
        ((ImageView) s1Var.f15365c).setImageResource(2131232209);
        ((ImageView) s1Var.f15365c).setVisibility(0);
        ((FrameLayout) s1Var.h).setVisibility(8);
        ((ImageView) s1Var.f15370s).setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        ((org.telegram.ui.ActionBar.n5) s1Var.d).l(str2, false);
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
        ((org.telegram.ui.ActionBar.n5) s1Var.f15366e).l(str3, false);
        TLRPC.Photo photo = webPage.photo;
        if (photo != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, 320, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(webPage.photo.sizes, org.telegram.messenger.g0.L(40.0f), false, null, false);
            if (w10 != null) {
                p9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                p9Var.g(1, 0L, webPage, "50_50", "50_50_b", null, org.telegram.messenger.fc.f(w10, webPage.photo), org.telegram.messenger.fc.f(w11, webPage.photo));
                p9Var.setVisibility(0);
            } else {
                p9Var.setVisibility(8);
            }
        } else {
            p9Var.setVisibility(8);
        }
        ((LinearLayout) s1Var.f15364b).setClickable(false);
    }

    public static void b(p9 p9Var, org.telegram.messenger.ef efVar) {
        if (efVar == null) {
            p9Var.setVisibility(8);
            return;
        }
        int i7 = efVar.C;
        String str = efVar.I;
        p9Var.setVisibility(0);
        p9Var.r();
        String str2 = efVar.f27964c;
        if (str2 != null) {
            p9Var.h(str2, null, null);
        } else if (str != null) {
            if (efVar.f27963b) {
                p9Var.h("vthumb://" + i7 + ":" + str, null, null);
                return;
            }
            p9Var.s(efVar.J, efVar.K, true);
            p9Var.h("thumb://" + i7 + ":" + str, null, null);
        } else {
            p9Var.setImageDrawable(null);
        }
    }

    public final String c(hi.s1 s1Var) {
        int measuredWidth;
        String s5;
        ArrayList arrayList = this.f34425f;
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
                sb2.append(org.telegram.messenger.gd.N0(2131745705, null));
            } else {
                if (arrayList.size() == 1) {
                    s5 = org.telegram.messenger.n5.l(this.f34423c, longValue);
                } else {
                    s5 = org.telegram.messenger.n5.s(this.f34423c, longValue);
                }
                sb2.append(s5);
            }
        }
        String a02 = org.telegram.messenger.gd.a0(null, null, 2131745243, sb2.toString());
        org.telegram.ui.ActionBar.n5 n5Var = (org.telegram.ui.ActionBar.n5) s1Var.f15366e;
        if (n5Var.getMeasuredWidth() <= 0) {
            measuredWidth = org.telegram.messenger.g0.f24226q.x - org.telegram.messenger.g0.L(140.0f);
        } else {
            measuredWidth = n5Var.getMeasuredWidth();
        }
        float f10 = measuredWidth;
        if (arrayList.size() <= 2 && n5Var.getPaint().measureText(a02) <= f10) {
            return a02;
        }
        return org.telegram.messenger.gd.G(arrayList.size(), "ShareSendToMany", new Object[0]);
    }

    public final void d() {
        if (this.f34431y != 0) {
            ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.f34423c).f23343a).cancelRequest(this.f34431y, true);
            this.f34431y = 0;
        }
        this.E++;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        String str;
        if (i7 == org.telegram.messenger.ks.f25310w0 && this.f34430x != null && i10 == this.f34423c) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i11 = 0; i11 < hVar.m(); i11++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i11);
                if (webPage != null && webPage.f28647id == this.f34430x.f28647id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.f34430x = null;
                        d();
                        if (this.f34422b != 0) {
                            this.f34422b = 0;
                            cp0 cp0Var = this.I;
                            if (cp0Var != null) {
                                ((org.telegram.ui.iu) cp0Var).e(0);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (webPage instanceof TLRPC.TL_webPage) {
                        this.f34430x = webPage;
                        ArrayList arrayList = this.f34428s;
                        if (arrayList.isEmpty()) {
                            str = "";
                        } else {
                            str = TextUtils.join(" ", arrayList).toString();
                        }
                        HashMap hashMap = this.f34429w;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, webPage);
                        }
                        a(this.f34421a[0], webPage, str);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void e(java.lang.CharSequence r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dp0.e(java.lang.CharSequence, boolean):void");
    }

    public final p9 f(int i7) {
        p9[] p9VarArr;
        if (this.f34422b == 1 && (p9VarArr = (p9[]) this.f34421a[0].f15368n) != null && i7 >= 0 && i7 < p9VarArr.length && p9VarArr[i7].getVisibility() == 0) {
            return p9VarArr[i7];
        }
        return null;
    }

    public final void g(int i7) {
        h(i7);
        this.d = org.telegram.messenger.i10.i(org.telegram.messenger.c.a(i7).f23343a).e();
        this.f34424e = null;
        this.h = true;
        this.f34426n = true;
        this.f34427r = null;
        this.f34430x = null;
        d();
        this.f34428s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.f34430x;
    }

    public int getMode() {
        return this.f34422b;
    }

    public final void h(int i7) {
        int i10 = this.f34423c;
        int i11 = org.telegram.messenger.ks.f25310w0;
        if (i10 == i7) {
            this.f34423c = i7;
            if (isAttachedToWindow()) {
                org.telegram.messenger.ks.f(this.f34423c).c(this, i11);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            org.telegram.messenger.ks.f(this.f34423c).n(this, i11);
        }
        this.f34423c = i7;
        if (isAttachedToWindow()) {
            org.telegram.messenger.ks.f(this.f34423c).c(this, i11);
        }
    }

    public final void i(int i7, ArrayList arrayList) {
        boolean z10;
        cp0 cp0Var;
        org.telegram.messenger.ef efVar;
        org.telegram.messenger.ef efVar2;
        int i10;
        h(i7);
        this.d = org.telegram.messenger.i10.i(org.telegram.messenger.c.a(i7).f23343a).e();
        this.f34424e = arrayList;
        this.h = false;
        org.telegram.messenger.ef efVar3 = null;
        this.f34430x = null;
        d();
        this.f34428s.clear();
        int i11 = this.f34422b;
        if (i11 != 1 && i11 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34422b = 1;
        if (z10) {
            k();
        }
        hi.s1[] s1VarArr = this.f34421a;
        hi.s1 s1Var = s1VarArr[0];
        org.telegram.ui.ActionBar.n5 n5Var = (org.telegram.ui.ActionBar.n5) s1Var.f15366e;
        p9[] p9VarArr = (p9[]) s1Var.f15368n;
        org.telegram.ui.ActionBar.n5 n5Var2 = (org.telegram.ui.ActionBar.n5) s1Var.d;
        ((ImageView) s1Var.f15365c).setImageResource(2131231114);
        ((ImageView) s1Var.f15365c).setVisibility(0);
        ((p9) s1Var.f15369r).setVisibility(8);
        ((FrameLayout) s1Var.h).setVisibility(0);
        ((ImageView) s1Var.f15370s).setVisibility(8);
        ((LinearLayout) s1Var.f15364b).setClickable(true);
        ArrayList arrayList2 = this.f34424e;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList2.get(i14);
                i14++;
                if (((org.telegram.messenger.ef) obj).f27963b) {
                    i12++;
                } else {
                    i13++;
                }
            }
            int size2 = arrayList2.size();
            if (size2 == 1) {
                if (((org.telegram.messenger.ef) arrayList2.get(0)).f27963b) {
                    i10 = 2131745237;
                } else {
                    i10 = 2131745248;
                }
                n5Var2.l(org.telegram.messenger.gd.N0(i10, null), false);
            } else if (i12 == 0) {
                n5Var2.l(org.telegram.messenger.gd.G(size2, "ShareSendPhotos", new Object[0]), false);
            } else if (i13 == 0) {
                n5Var2.l(org.telegram.messenger.gd.G(size2, "ShareSendVideos", new Object[0]), false);
            } else {
                n5Var2.l(org.telegram.messenger.gd.G(size2, "ShareSendItems", new Object[0]), false);
            }
            n5Var.l(c(s1Var), false);
            p9 p9Var = p9VarArr[0];
            if (arrayList2.size() > 0) {
                efVar = (org.telegram.messenger.ef) arrayList2.get(0);
            } else {
                efVar = null;
            }
            b(p9Var, efVar);
            p9 p9Var2 = p9VarArr[1];
            if (arrayList2.size() > 1) {
                efVar2 = (org.telegram.messenger.ef) arrayList2.get(1);
            } else {
                efVar2 = null;
            }
            b(p9Var2, efVar2);
            p9 p9Var3 = p9VarArr[2];
            if (arrayList2.size() > 2) {
                efVar3 = (org.telegram.messenger.ef) arrayList2.get(2);
            }
            b(p9Var3, efVar3);
        } else {
            n5Var2.l("", false);
            n5Var.l("", false);
            for (p9 p9Var4 : p9VarArr) {
                p9Var4.setVisibility(8);
            }
        }
        hi.s1 s1Var2 = s1VarArr[0];
        String str = this.G;
        if (str != null) {
            ((org.telegram.ui.ActionBar.n5) s1Var2.f15367f).l(str, false);
        }
        int i15 = this.f34422b;
        if (i11 != i15 && (cp0Var = this.I) != null) {
            ((org.telegram.ui.iu) cp0Var).e(i15);
        }
    }

    public final void j() {
        hi.s1[] s1VarArr;
        eb0 eb0Var = this.H;
        if (eb0Var != null) {
            org.telegram.messenger.g0.r(eb0Var);
            this.H = null;
        }
        this.F = false;
        for (hi.s1 s1Var : this.f34421a) {
            org.telegram.ui.ActionBar.n5 n5Var = (org.telegram.ui.ActionBar.n5) s1Var.f15366e;
            n5Var.setAlpha(1.0f);
            n5Var.setScaleX(1.0f);
            n5Var.setScaleY(1.0f);
            ((org.telegram.ui.ActionBar.n5) s1Var.f15367f).setAlpha(0.0f);
        }
    }

    public final void k() {
        hi.s1[] s1VarArr = this.f34421a;
        hi.s1 s1Var = s1VarArr[0];
        hi.s1 s1Var2 = s1VarArr[1];
        s1VarArr[0] = s1Var2;
        s1VarArr[1] = s1Var;
        s1Var2.getClass();
        s1VarArr[0].setVisibility(0);
        s1VarArr[0].setScaleX(0.8f);
        s1VarArr[0].setScaleY(0.8f);
        s1VarArr[0].setAlpha(0.0f);
        s1VarArr[0].setTranslationY(org.telegram.messenger.g0.L(20.0f));
        ViewPropertyAnimator translationY = s1VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        kr krVar = kr.h;
        org.telegram.messenger.m10.o(translationY, krVar, 320L);
        hi.s1 s1Var3 = s1VarArr[1];
        s1Var3.getClass();
        s1Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-org.telegram.messenger.g0.L(20.0f)).setInterpolator(krVar).setDuration(320L).withEndAction(new bp0(s1Var3, 0)).start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ks.f(this.f34423c).c(this, org.telegram.messenger.ks.f25310w0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.f(this.f34423c).n(this, org.telegram.messenger.ks.f25310w0);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (hi.s1 s1Var : this.f34421a) {
            ((LinearLayout) s1Var.f15364b).setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(cp0 cp0Var) {
        this.I = cp0Var;
    }
}
