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
public final class qx extends bk0 {
    public boolean E;
    public boolean F;
    public final ry G;
    public final mx f38925c;
    public long d;
    public TLRPC.StickerSet f38926e;
    public ArrayList f38927f;
    public final ArrayList h = new ArrayList();
    public final ArrayList f38928n = new ArrayList();
    public final ArrayList f38929r = new ArrayList();
    public final ArrayList f38930s = new ArrayList();
    public String f38931w;
    public String f38932x;
    public px f38933y;

    public qx(ry ryVar, Context context) {
        this.G = ryVar;
        mx mxVar = new mx(context, ryVar.f39345d1, new d(this, 12), new b0(this, 29), ryVar.f39335a2);
        this.f38925c = mxVar;
        mxVar.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f));
        mxVar.setClipToPadding(false);
        mxVar.f34607g3.f42809r = false;
        mxVar.setNestedScrollingEnabled(false);
        mxVar.setDrawSelection(false);
        mxVar.setOnTouchListener(new m.c2(this, 1));
    }

    public static void E(qx qxVar, Runnable runnable, ArrayList arrayList, boolean z10) {
        String str;
        ry ryVar = qxVar.G;
        String[] strArr = ryVar.X0;
        if (strArr != null && strArr.length != 0) {
            str = strArr[0];
        } else {
            str = "";
        }
        String str2 = str;
        String str3 = qxVar.f38931w;
        if (str3 == null) {
            return;
        }
        org.telegram.messenger.ri.d0(ryVar.f39345d1).e2(true, str2, str3, new bi.i2(qxVar, str3, arrayList, runnable, 10), z10);
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59127f;
        if (i7 != 0 && i7 != 4) {
            return false;
        }
        return true;
    }

    public final void F(String str, boolean z10) {
        ry ryVar = this.G;
        ex exVar = ryVar.Q;
        long j3 = 0;
        if (TextUtils.isEmpty(str)) {
            this.f38931w = null;
            v4.i0 adapter = exVar.getAdapter();
            bx bxVar = ryVar.S;
            if (adapter != bxVar) {
                exVar.setAdapter(bxVar);
                this.E = false;
            }
            this.d = 0L;
            ryVar.f39336b.a(false, true);
            f();
        } else {
            this.f38931w = str.toLowerCase();
        }
        px pxVar = this.f38933y;
        if (pxVar != null) {
            org.telegram.messenger.g0.r(pxVar);
        }
        if (!TextUtils.isEmpty(this.f38931w)) {
            this.f38928n.clear();
            this.F = false;
            ryVar.W.e(true);
            px pxVar2 = new px(this);
            this.f38933y = pxVar2;
            if (z10) {
                j3 = 300;
            }
            org.telegram.messenger.g0.h3(pxVar2, j3);
        }
    }

    @Override
    public final int b() {
        if (this.d != 0) {
            return this.f38927f.size() + 4;
        }
        ArrayList arrayList = this.h;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f38930s;
        ArrayList arrayList3 = this.f38929r;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qx.d(int):int");
    }

    @Override
    public final void f() {
        this.f38925c.f34607g3.O(false);
        super.f();
    }

    @Override
    public final void t(v4.f1 r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qx.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        bi.a3 a3Var;
        ry ryVar = this.G;
        org.telegram.ui.ActionBar.i6 i6Var = ryVar.f39335a2;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            bi.a3 a3Var2 = new bi.a3(19, ryVar.getContext(), this);
                            TextView textView = new TextView(ryVar.getContext());
                            org.telegram.messenger.n10.l(16.0f, 2131748021, 1, textView, null);
                            int i10 = org.telegram.ui.ActionBar.n6.Df;
                            org.telegram.ui.ActionBar.u6.U(textView, i10, i6Var);
                            a3Var2.addView(textView, c8.ma.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                            ImageView imageView = new ImageView(ryVar.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(2131232126);
                            org.telegram.ui.ActionBar.u6.s(imageView, i10, i6Var, PorterDuff.Mode.MULTIPLY);
                            a3Var2.addView(imageView, c8.ma.e(48, 48, 85));
                            imageView.setOnClickListener(new androidx.mediarouter.app.w(this, 10));
                            a3Var2.setLayoutParams(new v4.q0(-1, -2));
                            a3Var = a3Var2;
                        } else {
                            View view = new View(ryVar.getContext());
                            view.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(68.0f)));
                            a3Var = view;
                        }
                    } else {
                        ViewGroup.LayoutParams q0Var = new v4.q0(-1, org.telegram.messenger.g0.L(79.0f));
                        View view2 = this.f38925c;
                        view2.setLayoutParams(q0Var);
                        a3Var = view2;
                    }
                } else {
                    a3Var = new org.telegram.ui.Cells.k8(ryVar.getContext(), true, false, ryVar.f39335a2, ryVar.f39365j2);
                }
            } else {
                View view3 = new View(ryVar.getContext());
                view3.setLayoutParams(new v4.q0(-1, ryVar.f39342c1));
                a3Var = view3;
            }
        } else {
            a3Var = new zx(ryVar.getContext());
        }
        return new v4.f1(a3Var);
    }
}
