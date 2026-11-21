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
public final class ep0 extends FrameLayout implements org.telegram.messenger.fs {
    public static final int J = 0;
    public int E;
    public boolean F;
    public String G;
    public hb0 H;
    public dp0 I;
    public final hi.k1[] f34951a;
    public int f34952b;
    public int f34953c;
    public long d;
    public ArrayList f34954e;
    public final ArrayList f34955f;
    public boolean h;
    public boolean f34956n;
    public String f34957r;
    public final ArrayList f34958s;
    public final HashMap f34959w;
    public TLRPC.WebPage f34960x;
    public int f34961y;

    public ep0(Activity activity, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity);
        this.f34951a = new hi.k1[2];
        this.f34952b = 0;
        this.f34955f = new ArrayList();
        this.f34956n = true;
        this.f34958s = new ArrayList();
        this.f34959w = new HashMap();
        int i7 = 0;
        while (true) {
            hi.k1[] k1VarArr = this.f34951a;
            if (i7 < k1VarArr.length) {
                k1VarArr[i7] = new hi.k1(this, activity, h6Var);
                addView(this.f34951a[i7], c8.ma.c(-1.0f, -1));
                i7++;
            } else {
                k1VarArr[0].setVisibility(0);
                this.f34951a[1].setVisibility(8);
                return;
            }
        }
    }

    public static void a(hi.k1 k1Var, TLRPC.WebPage webPage, String str) {
        q9 q9Var = (q9) k1Var.f14859r;
        ((ImageView) k1Var.f14855c).setImageResource(2131232206);
        ((ImageView) k1Var.f14855c).setVisibility(0);
        ((FrameLayout) k1Var.h).setVisibility(8);
        ((ImageView) k1Var.f14860s).setVisibility(0);
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
        ((org.telegram.ui.ActionBar.m5) k1Var.f14856e).l(str3, false);
        TLRPC.Photo photo = webPage.photo;
        if (photo != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, 320, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(webPage.photo.sizes, org.telegram.messenger.g0.L(40.0f), false, null, false);
            if (w10 != null) {
                q9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                q9Var.g(1, 0L, webPage, "50_50", "50_50_b", null, org.telegram.messenger.fc.f(w10, webPage.photo), org.telegram.messenger.fc.f(w11, webPage.photo));
                q9Var.setVisibility(0);
            } else {
                q9Var.setVisibility(8);
            }
        } else {
            q9Var.setVisibility(8);
        }
        ((LinearLayout) k1Var.f14854b).setClickable(false);
    }

    public static void b(q9 q9Var, org.telegram.messenger.ef efVar) {
        if (efVar == null) {
            q9Var.setVisibility(8);
            return;
        }
        int i7 = efVar.C;
        String str = efVar.I;
        q9Var.setVisibility(0);
        q9Var.r();
        String str2 = efVar.f27876c;
        if (str2 != null) {
            q9Var.h(str2, null, null);
        } else if (str != null) {
            if (efVar.f27875b) {
                q9Var.h("vthumb://" + i7 + ":" + str, null, null);
                return;
            }
            q9Var.s(efVar.J, efVar.K, true);
            q9Var.h("thumb://" + i7 + ":" + str, null, null);
        } else {
            q9Var.setImageDrawable(null);
        }
    }

    public final String c(hi.k1 k1Var) {
        int measuredWidth;
        String s5;
        ArrayList arrayList = this.f34955f;
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
                    s5 = org.telegram.messenger.n5.l(this.f34953c, longValue);
                } else {
                    s5 = org.telegram.messenger.n5.s(this.f34953c, longValue);
                }
                sb2.append(s5);
            }
        }
        String a02 = org.telegram.messenger.gd.a0(null, null, 2131745243, sb2.toString());
        org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) k1Var.f14856e;
        if (m5Var.getMeasuredWidth() <= 0) {
            measuredWidth = org.telegram.messenger.g0.f24146q.x - org.telegram.messenger.g0.L(140.0f);
        } else {
            measuredWidth = m5Var.getMeasuredWidth();
        }
        float f10 = measuredWidth;
        if (arrayList.size() <= 2 && m5Var.getPaint().measureText(a02) <= f10) {
            return a02;
        }
        return org.telegram.messenger.gd.G(arrayList.size(), "ShareSendToMany", new Object[0]);
    }

    public final void d() {
        if (this.f34961y != 0) {
            ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.f34953c).f23246a).cancelRequest(this.f34961y, true);
            this.f34961y = 0;
        }
        this.E++;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        String str;
        if (i7 == org.telegram.messenger.ks.f25239w0 && this.f34960x != null && i10 == this.f34953c) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i11 = 0; i11 < hVar.m(); i11++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i11);
                if (webPage != null && webPage.f28586id == this.f34960x.f28586id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.f34960x = null;
                        d();
                        if (this.f34952b != 0) {
                            this.f34952b = 0;
                            dp0 dp0Var = this.I;
                            if (dp0Var != null) {
                                ((org.telegram.ui.ju) dp0Var).g(0);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (webPage instanceof TLRPC.TL_webPage) {
                        this.f34960x = webPage;
                        ArrayList arrayList = this.f34958s;
                        if (arrayList.isEmpty()) {
                            str = "";
                        } else {
                            str = TextUtils.join(" ", arrayList).toString();
                        }
                        HashMap hashMap = this.f34959w;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, webPage);
                        }
                        a(this.f34951a[0], webPage, str);
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
        if (this.f34952b == 1 && (q9VarArr = (q9[]) this.f34951a[0].f14858n) != null && i7 >= 0 && i7 < q9VarArr.length && q9VarArr[i7].getVisibility() == 0) {
            return q9VarArr[i7];
        }
        return null;
    }

    public final void g(int i7) {
        h(i7);
        this.d = org.telegram.messenger.j10.i(org.telegram.messenger.c.a(i7).f23246a).e();
        this.f34954e = null;
        this.h = true;
        this.f34956n = true;
        this.f34957r = null;
        this.f34960x = null;
        d();
        this.f34958s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.f34960x;
    }

    public int getMode() {
        return this.f34952b;
    }

    public final void h(int i7) {
        int i10 = this.f34953c;
        int i11 = org.telegram.messenger.ks.f25239w0;
        if (i10 == i7) {
            this.f34953c = i7;
            if (isAttachedToWindow()) {
                org.telegram.messenger.ks.f(this.f34953c).c(this, i11);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            org.telegram.messenger.ks.f(this.f34953c).n(this, i11);
        }
        this.f34953c = i7;
        if (isAttachedToWindow()) {
            org.telegram.messenger.ks.f(this.f34953c).c(this, i11);
        }
    }

    public final void i(int i7, ArrayList arrayList) {
        boolean z10;
        dp0 dp0Var;
        org.telegram.messenger.ef efVar;
        org.telegram.messenger.ef efVar2;
        int i10;
        h(i7);
        this.d = org.telegram.messenger.j10.i(org.telegram.messenger.c.a(i7).f23246a).e();
        this.f34954e = arrayList;
        this.h = false;
        org.telegram.messenger.ef efVar3 = null;
        this.f34960x = null;
        d();
        this.f34958s.clear();
        int i11 = this.f34952b;
        if (i11 != 1 && i11 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34952b = 1;
        if (z10) {
            k();
        }
        hi.k1[] k1VarArr = this.f34951a;
        hi.k1 k1Var = k1VarArr[0];
        org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) k1Var.f14856e;
        q9[] q9VarArr = (q9[]) k1Var.f14858n;
        org.telegram.ui.ActionBar.m5 m5Var2 = (org.telegram.ui.ActionBar.m5) k1Var.d;
        ((ImageView) k1Var.f14855c).setImageResource(2131231112);
        ((ImageView) k1Var.f14855c).setVisibility(0);
        ((q9) k1Var.f14859r).setVisibility(8);
        ((FrameLayout) k1Var.h).setVisibility(0);
        ((ImageView) k1Var.f14860s).setVisibility(8);
        ((LinearLayout) k1Var.f14854b).setClickable(true);
        ArrayList arrayList2 = this.f34954e;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList2.get(i14);
                i14++;
                if (((org.telegram.messenger.ef) obj).f27875b) {
                    i12++;
                } else {
                    i13++;
                }
            }
            int size2 = arrayList2.size();
            if (size2 == 1) {
                if (((org.telegram.messenger.ef) arrayList2.get(0)).f27875b) {
                    i10 = 2131745237;
                } else {
                    i10 = 2131745248;
                }
                m5Var2.l(org.telegram.messenger.gd.N0(i10, null), false);
            } else if (i12 == 0) {
                m5Var2.l(org.telegram.messenger.gd.G(size2, "ShareSendPhotos", new Object[0]), false);
            } else if (i13 == 0) {
                m5Var2.l(org.telegram.messenger.gd.G(size2, "ShareSendVideos", new Object[0]), false);
            } else {
                m5Var2.l(org.telegram.messenger.gd.G(size2, "ShareSendItems", new Object[0]), false);
            }
            m5Var.l(c(k1Var), false);
            q9 q9Var = q9VarArr[0];
            if (arrayList2.size() > 0) {
                efVar = (org.telegram.messenger.ef) arrayList2.get(0);
            } else {
                efVar = null;
            }
            b(q9Var, efVar);
            q9 q9Var2 = q9VarArr[1];
            if (arrayList2.size() > 1) {
                efVar2 = (org.telegram.messenger.ef) arrayList2.get(1);
            } else {
                efVar2 = null;
            }
            b(q9Var2, efVar2);
            q9 q9Var3 = q9VarArr[2];
            if (arrayList2.size() > 2) {
                efVar3 = (org.telegram.messenger.ef) arrayList2.get(2);
            }
            b(q9Var3, efVar3);
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
            ((org.telegram.ui.ActionBar.m5) k1Var2.f14857f).l(str, false);
        }
        int i15 = this.f34952b;
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
        for (hi.k1 k1Var : this.f34951a) {
            org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) k1Var.f14856e;
            m5Var.setAlpha(1.0f);
            m5Var.setScaleX(1.0f);
            m5Var.setScaleY(1.0f);
            ((org.telegram.ui.ActionBar.m5) k1Var.f14857f).setAlpha(0.0f);
        }
    }

    public final void k() {
        hi.k1[] k1VarArr = this.f34951a;
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
        org.telegram.messenger.n10.o(translationY, nrVar, 320L);
        hi.k1 k1Var3 = k1VarArr[1];
        k1Var3.getClass();
        k1Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-org.telegram.messenger.g0.L(20.0f)).setInterpolator(nrVar).setDuration(320L).withEndAction(new cp0(k1Var3, 0)).start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ks.f(this.f34953c).c(this, org.telegram.messenger.ks.f25239w0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.f(this.f34953c).n(this, org.telegram.messenger.ks.f25239w0);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (hi.k1 k1Var : this.f34951a) {
            ((LinearLayout) k1Var.f14854b).setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(dp0 dp0Var) {
        this.I = dp0Var;
    }
}
