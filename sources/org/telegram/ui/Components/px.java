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
public final class px extends dk0 {
    public boolean E;
    public boolean F;
    public final qy G;
    public final lx f38601c;
    public long d;
    public TLRPC.StickerSet f38602e;
    public ArrayList f38603f;
    public final ArrayList h = new ArrayList();
    public final ArrayList f38604n = new ArrayList();
    public final ArrayList f38605r = new ArrayList();
    public final ArrayList f38606s = new ArrayList();
    public String f38607w;
    public String f38608x;
    public ox f38609y;

    public px(qy qyVar, Context context) {
        this.G = qyVar;
        lx lxVar = new lx(context, qyVar.f39047d1, new d(this, 12), new b0(this, 29), qyVar.f39037a2);
        this.f38601c = lxVar;
        lxVar.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f));
        lxVar.setClipToPadding(false);
        lxVar.f35323g3.f33631r = false;
        lxVar.setNestedScrollingEnabled(false);
        lxVar.setDrawSelection(false);
        lxVar.setOnTouchListener(new m.c2(this, 1));
    }

    public static void E(px pxVar, Runnable runnable, ArrayList arrayList, boolean z10) {
        String str;
        qy qyVar = pxVar.G;
        String[] strArr = qyVar.X0;
        if (strArr != null && strArr.length != 0) {
            str = strArr[0];
        } else {
            str = "";
        }
        String str2 = str;
        String str3 = pxVar.f38607w;
        if (str3 == null) {
            return;
        }
        org.telegram.messenger.ri.d0(qyVar.f39047d1).e2(true, str2, str3, new bi.o2(pxVar, str3, arrayList, runnable, 10), z10);
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59249f;
        if (i7 != 0 && i7 != 4) {
            return false;
        }
        return true;
    }

    public final void F(String str, boolean z10) {
        qy qyVar = this.G;
        dx dxVar = qyVar.Q;
        long j3 = 0;
        if (TextUtils.isEmpty(str)) {
            this.f38607w = null;
            v4.i0 adapter = dxVar.getAdapter();
            ax axVar = qyVar.S;
            if (adapter != axVar) {
                dxVar.setAdapter(axVar);
                this.E = false;
            }
            this.d = 0L;
            qyVar.f39038b.a(false, true);
            f();
        } else {
            this.f38607w = str.toLowerCase();
        }
        ox oxVar = this.f38609y;
        if (oxVar != null) {
            org.telegram.messenger.g0.r(oxVar);
        }
        if (!TextUtils.isEmpty(this.f38607w)) {
            this.f38604n.clear();
            this.F = false;
            qyVar.W.e(true);
            ox oxVar2 = new ox(this);
            this.f38609y = oxVar2;
            if (z10) {
                j3 = 300;
            }
            org.telegram.messenger.g0.h3(oxVar2, j3);
        }
    }

    @Override
    public final int b() {
        if (this.d != 0) {
            return this.f38603f.size() + 4;
        }
        ArrayList arrayList = this.h;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f38606s;
        ArrayList arrayList3 = this.f38605r;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.px.d(int):int");
    }

    @Override
    public final void f() {
        this.f38601c.f35323g3.O(false);
        super.f();
    }

    @Override
    public final void t(v4.f1 r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.px.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        bi.g3 g3Var;
        qy qyVar = this.G;
        org.telegram.ui.ActionBar.i6 i6Var = qyVar.f39037a2;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            bi.g3 g3Var2 = new bi.g3(19, qyVar.getContext(), this);
                            TextView textView = new TextView(qyVar.getContext());
                            org.telegram.messenger.m10.l(16.0f, 2131748020, 1, textView, null);
                            int i10 = org.telegram.ui.ActionBar.n6.Df;
                            org.telegram.ui.ActionBar.u6.U(textView, i10, i6Var);
                            g3Var2.addView(textView, c8.na.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                            ImageView imageView = new ImageView(qyVar.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(2131232129);
                            org.telegram.ui.ActionBar.u6.s(imageView, i10, i6Var, PorterDuff.Mode.MULTIPLY);
                            g3Var2.addView(imageView, c8.na.e(48, 48, 85));
                            imageView.setOnClickListener(new androidx.mediarouter.app.w(this, 10));
                            g3Var2.setLayoutParams(new v4.q0(-1, -2));
                            g3Var = g3Var2;
                        } else {
                            View view = new View(qyVar.getContext());
                            view.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(68.0f)));
                            g3Var = view;
                        }
                    } else {
                        ViewGroup.LayoutParams q0Var = new v4.q0(-1, org.telegram.messenger.g0.L(79.0f));
                        View view2 = this.f38601c;
                        view2.setLayoutParams(q0Var);
                        g3Var = view2;
                    }
                } else {
                    g3Var = new org.telegram.ui.Cells.j8(qyVar.getContext(), true, false, qyVar.f39037a2, qyVar.f39067j2);
                }
            } else {
                View view3 = new View(qyVar.getContext());
                view3.setLayoutParams(new v4.q0(-1, qyVar.f39044c1));
                g3Var = view3;
            }
        } else {
            g3Var = new yx(qyVar.getContext());
        }
        return new v4.f1(g3Var);
    }
}
