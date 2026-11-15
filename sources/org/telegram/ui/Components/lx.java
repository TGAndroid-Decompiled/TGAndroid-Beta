package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lx extends tj0 {
    public boolean E;
    public boolean F;
    public final ly G;
    public final hx f36918c;
    public long d;
    public TLRPC.StickerSet f36919e;
    public ArrayList f36920f;
    public final ArrayList h = new ArrayList();
    public final ArrayList f36921n = new ArrayList();
    public final ArrayList f36922r = new ArrayList();
    public final ArrayList f36923s = new ArrayList();
    public String f36924w;
    public String f36925x;
    public kx f36926y;

    public lx(ly lyVar, Context context) {
        this.G = lyVar;
        hx hxVar = new hx(context, lyVar.f36941d1, new d(this, 11), new gx(this, 0), lyVar.f36931a2);
        this.f36918c = hxVar;
        hxVar.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f));
        hxVar.setClipToPadding(false);
        hxVar.f39892g3.f38199r = false;
        hxVar.setNestedScrollingEnabled(false);
        hxVar.setDrawSelection(false);
        hxVar.setOnTouchListener(new m.c2(this, 1));
    }

    public static void E(lx lxVar, Runnable runnable, ArrayList arrayList, boolean z10) {
        String str;
        ly lyVar = lxVar.G;
        String[] strArr = lyVar.X0;
        if (strArr != null && strArr.length != 0) {
            str = strArr[0];
        } else {
            str = "";
        }
        String str2 = str;
        String str3 = lxVar.f36924w;
        if (str3 == null) {
            return;
        }
        org.telegram.messenger.si.b0(lyVar.f36941d1).Z1(true, str2, str3, new bi.o1(lxVar, str3, arrayList, runnable, 10), z10);
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f58539f;
        if (i7 != 0 && i7 != 4) {
            return false;
        }
        return true;
    }

    public final void F(String str, boolean z10) {
        ly lyVar = this.G;
        yw ywVar = lyVar.Q;
        long j3 = 0;
        if (TextUtils.isEmpty(str)) {
            this.f36924w = null;
            v4.h0 adapter = ywVar.getAdapter();
            vw vwVar = lyVar.S;
            if (adapter != vwVar) {
                ywVar.setAdapter(vwVar);
                this.E = false;
            }
            this.d = 0L;
            lyVar.f36932b.a(false, true);
            f();
        } else {
            this.f36924w = str.toLowerCase();
        }
        kx kxVar = this.f36926y;
        if (kxVar != null) {
            org.telegram.messenger.g0.r(kxVar);
        }
        if (!TextUtils.isEmpty(this.f36924w)) {
            this.f36921n.clear();
            this.F = false;
            lyVar.W.e(true);
            kx kxVar2 = new kx(this);
            this.f36926y = kxVar2;
            if (z10) {
                j3 = 300;
            }
            org.telegram.messenger.g0.i3(kxVar2, j3);
        }
    }

    @Override
    public final int b() {
        if (this.d != 0) {
            return this.f36920f.size() + 4;
        }
        ArrayList arrayList = this.h;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f36923s;
        ArrayList arrayList3 = this.f36922r;
        if (isEmpty && arrayList3.isEmpty() && arrayList2.isEmpty() && !this.E) {
            return this.G.getRecentEmoji().size() + 1;
        }
        int i7 = 2;
        if (arrayList.isEmpty() && arrayList3.isEmpty() && arrayList2.isEmpty()) {
            return 2;
        }
        if (!arrayList2.isEmpty()) {
            i7 = 3;
        } else if (arrayList.isEmpty()) {
            i7 = 1;
        }
        int size = arrayList.size() + i7;
        if (!arrayList3.isEmpty()) {
            return arrayList3.size() + size + 1;
        }
        return size;
    }

    @Override
    public final int d(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lx.d(int):int");
    }

    @Override
    public final void f() {
        this.f36918c.f39892g3.O(false);
        super.f();
    }

    @Override
    public final void t(v4.e1 r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lx.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        bi.g2 g2Var;
        ly lyVar = this.G;
        org.telegram.ui.ActionBar.e6 e6Var = lyVar.f36931a2;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            bi.g2 g2Var2 = new bi.g2(19, lyVar.getContext(), this);
                            TextView textView = new TextView(lyVar.getContext());
                            textView.setText(org.telegram.messenger.hd.M0(2131748213, null));
                            textView.setTextSize(1, 16.0f);
                            int i10 = org.telegram.ui.ActionBar.j6.Df;
                            org.telegram.ui.ActionBar.q6.U(textView, i10, e6Var);
                            g2Var2.addView(textView, c8.ja.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                            ImageView imageView = new ImageView(lyVar.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(2131232125);
                            org.telegram.ui.ActionBar.q6.s(imageView, i10, e6Var, PorterDuff.Mode.MULTIPLY);
                            g2Var2.addView(imageView, c8.ja.e(48, 48, 85));
                            imageView.setOnClickListener(new androidx.mediarouter.app.w(this, 10));
                            g2Var2.setLayoutParams(new v4.p0(-1, -2));
                            g2Var = g2Var2;
                        } else {
                            View view = new View(lyVar.getContext());
                            view.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(68.0f)));
                            g2Var = view;
                        }
                    } else {
                        ViewGroup.LayoutParams p0Var = new v4.p0(-1, org.telegram.messenger.g0.L(79.0f));
                        View view2 = this.f36918c;
                        view2.setLayoutParams(p0Var);
                        g2Var = view2;
                    }
                } else {
                    g2Var = new org.telegram.ui.Cells.i8(lyVar.getContext(), true, false, lyVar.f36931a2, lyVar.f36961j2);
                }
            } else {
                View view3 = new View(lyVar.getContext());
                view3.setLayoutParams(new v4.p0(-1, lyVar.f36938c1));
                g2Var = view3;
            }
        } else {
            g2Var = new ux(lyVar.getContext());
        }
        return new v4.e1(g2Var);
    }
}
