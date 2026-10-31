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
public final class ux extends sk0 {
    public boolean D;
    public boolean E;
    public final vy F;
    public final qx f31070c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f31071f;
    public final ArrayList h = new ArrayList();
    public final ArrayList f31072n = new ArrayList();
    public final ArrayList f31073r = new ArrayList();
    public final ArrayList f31074s = new ArrayList();
    public String f31075w;
    public String f31076x;
    public tx f31077y;

    public ux(vy vyVar, Context context) {
        this.F = vyVar;
        qx qxVar = new qx(context, vyVar.f31865c1, new d(this, 11), new px(this, 0), vyVar.Z1);
        this.f31070c = qxVar;
        qxVar.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(5.0f));
        qxVar.setClipToPadding(false);
        qxVar.f30819f3.f29295r = false;
        qxVar.setNestedScrollingEnabled(false);
        qxVar.setDrawSelection(false);
        qxVar.setOnTouchListener(new m.c2(this, 1));
    }

    public static void E(ux uxVar, Runnable runnable, ArrayList arrayList, boolean z10) {
        String str;
        vy vyVar = uxVar.F;
        String[] strArr = vyVar.W0;
        if (strArr != null && strArr.length != 0) {
            str = strArr[0];
        } else {
            str = "";
        }
        String str2 = str;
        String str3 = uxVar.f31075w;
        if (str3 == null) {
            return;
        }
        org.telegram.messenger.ui.b0(vyVar.f31865c1).Z1(true, str2, str3, new ag.m2(uxVar, str3, arrayList, runnable, 9), z10);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47901f;
        if (i10 != 0 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void F(String str, boolean z10) {
        vy vyVar = this.F;
        hx hxVar = vyVar.P;
        long j10 = 0;
        if (TextUtils.isEmpty(str)) {
            this.f31075w = null;
            s4.g0 adapter = hxVar.getAdapter();
            ex exVar = vyVar.R;
            if (adapter != exVar) {
                hxVar.setAdapter(exVar);
                this.D = false;
            }
            this.d = 0L;
            vyVar.f31859b.a(false, true);
            f();
        } else {
            this.f31075w = str.toLowerCase();
        }
        tx txVar = this.f31077y;
        if (txVar != null) {
            org.telegram.messenger.i0.r(txVar);
        }
        if (!TextUtils.isEmpty(this.f31075w)) {
            this.f31072n.clear();
            this.E = false;
            vyVar.V.e(true);
            tx txVar2 = new tx(this);
            this.f31077y = txVar2;
            if (z10) {
                j10 = 300;
            }
            org.telegram.messenger.i0.h3(txVar2, j10);
        }
    }

    @Override
    public final int b() {
        if (this.d != 0) {
            return this.f31071f.size() + 4;
        }
        ArrayList arrayList = this.h;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f31074s;
        ArrayList arrayList3 = this.f31073r;
        if (isEmpty && arrayList3.isEmpty() && arrayList2.isEmpty() && !this.D) {
            return this.F.getRecentEmoji().size() + 1;
        }
        int i10 = 2;
        if (arrayList.isEmpty() && arrayList3.isEmpty() && arrayList2.isEmpty()) {
            return 2;
        }
        if (!arrayList2.isEmpty()) {
            i10 = 3;
        } else if (arrayList.isEmpty()) {
            i10 = 1;
        }
        int size = arrayList.size() + i10;
        if (!arrayList3.isEmpty()) {
            return arrayList3.size() + size + 1;
        }
        return size;
    }

    @Override
    public final int d(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ux.d(int):int");
    }

    @Override
    public final void f() {
        this.f31070c.f30819f3.O(false);
        super.f();
    }

    @Override
    public final void t(s4.c1 r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ux.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        jg.l0 l0Var;
        vy vyVar = this.F;
        org.telegram.ui.ActionBar.p6 p6Var = vyVar.Z1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            jg.l0 l0Var2 = new jg.l0(this, vyVar.getContext(), 17);
                            TextView textView = new TextView(vyVar.getContext());
                            textView.setText(org.telegram.messenger.cd.L0(2131748230, null));
                            textView.setTextSize(1, 16.0f);
                            int i11 = org.telegram.ui.ActionBar.t6.Af;
                            org.telegram.ui.ActionBar.a7.V(textView, i11, p6Var);
                            l0Var2.addView(textView, w7.b6.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                            ImageView imageView = new ImageView(vyVar.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(2131232123);
                            org.telegram.ui.ActionBar.a7.t(imageView, i11, p6Var, PorterDuff.Mode.MULTIPLY);
                            l0Var2.addView(imageView, w7.b6.e(48, 48, 85));
                            imageView.setOnClickListener(new androidx.mediarouter.app.w(this, 10));
                            l0Var2.setLayoutParams(new s4.o0(-1, -2));
                            l0Var = l0Var2;
                        } else {
                            View view = new View(vyVar.getContext());
                            view.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(68.0f)));
                            l0Var = view;
                        }
                    } else {
                        ViewGroup.LayoutParams o0Var = new s4.o0(-1, org.telegram.messenger.i0.L(79.0f));
                        View view2 = this.f31070c;
                        view2.setLayoutParams(o0Var);
                        l0Var = view2;
                    }
                } else {
                    l0Var = new org.telegram.ui.Cells.n8(vyVar.getContext(), true, false, vyVar.Z1, vyVar.f31885i2);
                }
            } else {
                View view3 = new View(vyVar.getContext());
                view3.setLayoutParams(new s4.o0(-1, vyVar.f31861b1));
                l0Var = view3;
            }
        } else {
            l0Var = new ey(vyVar.getContext());
        }
        return new s4.c1(l0Var);
    }
}
