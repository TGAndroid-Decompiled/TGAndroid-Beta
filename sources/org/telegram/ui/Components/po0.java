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
    public final fi.i1[] f37030a;
    public int f37031b;
    public int f37032c;
    public long d;
    public ArrayList f37033e;
    public final ArrayList f37034f;
    public boolean h;
    public boolean f37035n;
    public String f37036r;
    public final ArrayList f37037s;
    public final HashMap f37038w;
    public TLRPC.WebPage f37039x;
    public int f37040y;

    public po0(Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.f37030a = new fi.i1[2];
        this.f37031b = 0;
        this.f37034f = new ArrayList();
        this.f37035n = true;
        this.f37037s = new ArrayList();
        this.f37038w = new HashMap();
        int i7 = 0;
        while (true) {
            fi.i1[] i1VarArr = this.f37030a;
            if (i7 < i1VarArr.length) {
                i1VarArr[i7] = new fi.i1(this, activity, f6Var);
                addView(this.f37030a[i7], c8.ha.c(-1.0f, -1));
                i7++;
            } else {
                i1VarArr[0].setVisibility(0);
                this.f37030a[1].setVisibility(8);
                return;
            }
        }
    }

    public static void a(fi.i1 i1Var, TLRPC.WebPage webPage, String str) {
        l9 l9Var = (l9) i1Var.f12167r;
        ((ImageView) i1Var.f12163c).setImageResource(2131232204);
        ((ImageView) i1Var.f12163c).setVisibility(0);
        ((FrameLayout) i1Var.h).setVisibility(8);
        ((ImageView) i1Var.f12168s).setVisibility(0);
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
        ((org.telegram.ui.ActionBar.k5) i1Var.f12164e).l(str3, false);
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
        ((LinearLayout) i1Var.f12162b).setClickable(false);
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
        String str2 = gfVar.f26825c;
        if (str2 != null) {
            l9Var.h(str2, null, null);
        } else if (str != null) {
            if (gfVar.f26824b) {
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
        ArrayList arrayList = this.f37034f;
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
                sb2.append(org.telegram.messenger.hd.M0(2131745902, null));
            } else {
                if (arrayList.size() == 1) {
                    s5 = org.telegram.messenger.m5.l(this.f37032c, longValue);
                } else {
                    s5 = org.telegram.messenger.m5.s(this.f37032c, longValue);
                }
                sb2.append(s5);
            }
        }
        String a02 = org.telegram.messenger.hd.a0(null, null, 2131745440, sb2.toString());
        org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) i1Var.f12164e;
        if (k5Var.getMeasuredWidth() <= 0) {
            measuredWidth = org.telegram.messenger.g0.f22544q.x - org.telegram.messenger.g0.L(140.0f);
        } else {
            measuredWidth = k5Var.getMeasuredWidth();
        }
        float f10 = measuredWidth;
        if (arrayList.size() <= 2 && k5Var.getPaint().measureText(a02) <= f10) {
            return a02;
        }
        return org.telegram.messenger.hd.G(arrayList.size(), "ShareSendToMany", new Object[0]);
    }

    public final void d() {
        if (this.f37040y != 0) {
            ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.f37032c).f21729a).cancelRequest(this.f37040y, true);
            this.f37040y = 0;
        }
        this.D++;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        String str;
        if (i7 == org.telegram.messenger.qs.f25088w0 && this.f37039x != null && i10 == this.f37032c) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i11 = 0; i11 < hVar.m(); i11++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i11);
                if (webPage != null && webPage.f27108id == this.f37039x.f27108id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.f37039x = null;
                        d();
                        if (this.f37031b != 0) {
                            this.f37031b = 0;
                            oo0 oo0Var = this.H;
                            if (oo0Var != null) {
                                ((org.telegram.ui.fu) oo0Var).i(0);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (webPage instanceof TLRPC.TL_webPage) {
                        this.f37039x = webPage;
                        ArrayList arrayList = this.f37037s;
                        if (arrayList.isEmpty()) {
                            str = "";
                        } else {
                            str = TextUtils.join(" ", arrayList).toString();
                        }
                        HashMap hashMap = this.f37038w;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, webPage);
                        }
                        a(this.f37030a[0], webPage, str);
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

    public final l9 f(int i7) {
        l9[] l9VarArr;
        if (this.f37031b == 1 && (l9VarArr = (l9[]) this.f37030a[0].f12166n) != null && i7 >= 0 && i7 < l9VarArr.length && l9VarArr[i7].getVisibility() == 0) {
            return l9VarArr[i7];
        }
        return null;
    }

    public final void g(int i7) {
        h(i7);
        this.d = org.telegram.messenger.p10.i(org.telegram.messenger.c.a(i7).f21729a).e();
        this.f37033e = null;
        this.h = true;
        this.f37035n = true;
        this.f37036r = null;
        this.f37039x = null;
        d();
        this.f37037s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.f37039x;
    }

    public int getMode() {
        return this.f37031b;
    }

    public final void h(int i7) {
        int i10 = this.f37032c;
        int i11 = org.telegram.messenger.qs.f25088w0;
        if (i10 == i7) {
            this.f37032c = i7;
            if (isAttachedToWindow()) {
                org.telegram.messenger.qs.f(this.f37032c).c(this, i11);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            org.telegram.messenger.qs.f(this.f37032c).n(this, i11);
        }
        this.f37032c = i7;
        if (isAttachedToWindow()) {
            org.telegram.messenger.qs.f(this.f37032c).c(this, i11);
        }
    }

    public final void i(int i7, ArrayList arrayList) {
        boolean z9;
        oo0 oo0Var;
        org.telegram.messenger.gf gfVar;
        org.telegram.messenger.gf gfVar2;
        int i10;
        h(i7);
        this.d = org.telegram.messenger.p10.i(org.telegram.messenger.c.a(i7).f21729a).e();
        this.f37033e = arrayList;
        this.h = false;
        org.telegram.messenger.gf gfVar3 = null;
        this.f37039x = null;
        d();
        this.f37037s.clear();
        int i11 = this.f37031b;
        if (i11 != 1 && i11 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f37031b = 1;
        if (z9) {
            k();
        }
        fi.i1[] i1VarArr = this.f37030a;
        fi.i1 i1Var = i1VarArr[0];
        org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) i1Var.f12164e;
        l9[] l9VarArr = (l9[]) i1Var.f12166n;
        org.telegram.ui.ActionBar.k5 k5Var2 = (org.telegram.ui.ActionBar.k5) i1Var.d;
        ((ImageView) i1Var.f12163c).setImageResource(2131231112);
        ((ImageView) i1Var.f12163c).setVisibility(0);
        ((l9) i1Var.f12167r).setVisibility(8);
        ((FrameLayout) i1Var.h).setVisibility(0);
        ((ImageView) i1Var.f12168s).setVisibility(8);
        ((LinearLayout) i1Var.f12162b).setClickable(true);
        ArrayList arrayList2 = this.f37033e;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList2.get(i14);
                i14++;
                if (((org.telegram.messenger.gf) obj).f26824b) {
                    i12++;
                } else {
                    i13++;
                }
            }
            int size2 = arrayList2.size();
            if (size2 == 1) {
                if (((org.telegram.messenger.gf) arrayList2.get(0)).f26824b) {
                    i10 = 2131745434;
                } else {
                    i10 = 2131745445;
                }
                k5Var2.l(org.telegram.messenger.hd.M0(i10, null), false);
            } else if (i12 == 0) {
                k5Var2.l(org.telegram.messenger.hd.G(size2, "ShareSendPhotos", new Object[0]), false);
            } else if (i13 == 0) {
                k5Var2.l(org.telegram.messenger.hd.G(size2, "ShareSendVideos", new Object[0]), false);
            } else {
                k5Var2.l(org.telegram.messenger.hd.G(size2, "ShareSendItems", new Object[0]), false);
            }
            k5Var.l(c(i1Var), false);
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
            k5Var2.l("", false);
            k5Var.l("", false);
            for (l9 l9Var4 : l9VarArr) {
                l9Var4.setVisibility(8);
            }
        }
        fi.i1 i1Var2 = i1VarArr[0];
        String str = this.F;
        if (str != null) {
            ((org.telegram.ui.ActionBar.k5) i1Var2.f12165f).l(str, false);
        }
        int i15 = this.f37031b;
        if (i11 != i15 && (oo0Var = this.H) != null) {
            ((org.telegram.ui.fu) oo0Var).i(i15);
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
        for (fi.i1 i1Var : this.f37030a) {
            org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) i1Var.f12164e;
            k5Var.setAlpha(1.0f);
            k5Var.setScaleX(1.0f);
            k5Var.setScaleY(1.0f);
            ((org.telegram.ui.ActionBar.k5) i1Var.f12165f).setAlpha(0.0f);
        }
    }

    public final void k() {
        fi.i1[] i1VarArr = this.f37030a;
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
        i1Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-org.telegram.messenger.g0.L(20.0f)).setInterpolator(xqVar).setDuration(320L).withEndAction(new ob0(i1Var3, 27)).start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.qs.f(this.f37032c).c(this, org.telegram.messenger.qs.f25088w0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.f(this.f37032c).n(this, org.telegram.messenger.qs.f25088w0);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (fi.i1 i1Var : this.f37030a) {
            ((LinearLayout) i1Var.f12162b).setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(oo0 oo0Var) {
        this.H = oo0Var;
    }
}
