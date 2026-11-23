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
public final class sx extends dk0 {
    public boolean E;
    public boolean F;
    public final ty G;
    public final ox f39709c;
    public long d;
    public TLRPC.StickerSet f39710e;
    public ArrayList f39711f;
    public final ArrayList h = new ArrayList();
    public final ArrayList f39712n = new ArrayList();
    public final ArrayList f39713r = new ArrayList();
    public final ArrayList f39714s = new ArrayList();
    public String f39715w;
    public String f39716x;
    public rx f39717y;

    public sx(ty tyVar, Context context) {
        this.G = tyVar;
        ox oxVar = new ox(context, tyVar.f40091d1, new d(this, 12), new c0(this, 29), tyVar.f40081a2);
        this.f39709c = oxVar;
        oxVar.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f));
        oxVar.setClipToPadding(false);
        oxVar.f35789g3.f34062r = false;
        oxVar.setNestedScrollingEnabled(false);
        oxVar.setDrawSelection(false);
        oxVar.setOnTouchListener(new m.c2(this, 1));
    }

    public static void E(sx sxVar, Runnable runnable, ArrayList arrayList, boolean z10) {
        String str;
        ty tyVar = sxVar.G;
        String[] strArr = tyVar.X0;
        if (strArr != null && strArr.length != 0) {
            str = strArr[0];
        } else {
            str = "";
        }
        String str2 = str;
        String str3 = sxVar.f39715w;
        if (str3 == null) {
            return;
        }
        org.telegram.messenger.si.d0(tyVar.f40091d1).e2(true, str2, str3, new bi.m2(sxVar, str3, arrayList, runnable, 10), z10);
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59169f;
        if (i7 != 0 && i7 != 4) {
            return false;
        }
        return true;
    }

    public final void F(String str, boolean z10) {
        ty tyVar = this.G;
        gx gxVar = tyVar.Q;
        long j3 = 0;
        if (TextUtils.isEmpty(str)) {
            this.f39715w = null;
            v4.i0 adapter = gxVar.getAdapter();
            dx dxVar = tyVar.S;
            if (adapter != dxVar) {
                gxVar.setAdapter(dxVar);
                this.E = false;
            }
            this.d = 0L;
            tyVar.f40082b.a(false, true);
            f();
        } else {
            this.f39715w = str.toLowerCase();
        }
        rx rxVar = this.f39717y;
        if (rxVar != null) {
            org.telegram.messenger.g0.r(rxVar);
        }
        if (!TextUtils.isEmpty(this.f39715w)) {
            this.f39712n.clear();
            this.F = false;
            tyVar.W.e(true);
            rx rxVar2 = new rx(this);
            this.f39717y = rxVar2;
            if (z10) {
                j3 = 300;
            }
            org.telegram.messenger.g0.h3(rxVar2, j3);
        }
    }

    @Override
    public final int b() {
        if (this.d != 0) {
            return this.f39711f.size() + 4;
        }
        ArrayList arrayList = this.h;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f39714s;
        ArrayList arrayList3 = this.f39713r;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sx.d(int):int");
    }

    @Override
    public final void f() {
        this.f39709c.f35789g3.O(false);
        super.f();
    }

    @Override
    public final void t(v4.f1 r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sx.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        bi.e3 e3Var;
        ty tyVar = this.G;
        org.telegram.ui.ActionBar.h6 h6Var = tyVar.f40081a2;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            bi.e3 e3Var2 = new bi.e3(19, tyVar.getContext(), this);
                            TextView textView = new TextView(tyVar.getContext());
                            org.telegram.messenger.o10.l(16.0f, 2131748020, 1, textView, null);
                            int i10 = org.telegram.ui.ActionBar.m6.Df;
                            org.telegram.ui.ActionBar.t6.U(textView, i10, h6Var);
                            e3Var2.addView(textView, c8.ma.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                            ImageView imageView = new ImageView(tyVar.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(2131232126);
                            org.telegram.ui.ActionBar.t6.s(imageView, i10, h6Var, PorterDuff.Mode.MULTIPLY);
                            e3Var2.addView(imageView, c8.ma.e(48, 48, 85));
                            imageView.setOnClickListener(new androidx.mediarouter.app.w(this, 10));
                            e3Var2.setLayoutParams(new v4.q0(-1, -2));
                            e3Var = e3Var2;
                        } else {
                            View view = new View(tyVar.getContext());
                            view.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(68.0f)));
                            e3Var = view;
                        }
                    } else {
                        ViewGroup.LayoutParams q0Var = new v4.q0(-1, org.telegram.messenger.g0.L(79.0f));
                        View view2 = this.f39709c;
                        view2.setLayoutParams(q0Var);
                        e3Var = view2;
                    }
                } else {
                    e3Var = new org.telegram.ui.Cells.k8(tyVar.getContext(), true, false, tyVar.f40081a2, tyVar.f40111j2);
                }
            } else {
                View view3 = new View(tyVar.getContext());
                view3.setLayoutParams(new v4.q0(-1, tyVar.f40088c1));
                e3Var = view3;
            }
        } else {
            e3Var = new cy(tyVar.getContext());
        }
        return new v4.f1(e3Var);
    }
}
