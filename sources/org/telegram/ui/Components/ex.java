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
public final class ex extends sj0 {
    public boolean E;
    public boolean F;
    public final ey G;
    public final ax f33491c;
    public long d;
    public TLRPC.StickerSet f33492e;
    public ArrayList f33493f;
    public final ArrayList h = new ArrayList();
    public final ArrayList f33494n = new ArrayList();
    public final ArrayList f33495r = new ArrayList();
    public final ArrayList f33496s = new ArrayList();
    public String f33497w;
    public String f33498x;
    public dx f33499y;

    public ex(ey eyVar, Context context) {
        this.G = eyVar;
        ax axVar = new ax(context, eyVar.f33529d1, new e(this, 11), new zw(this, 0), eyVar.f33520a2);
        this.f33491c = axVar;
        axVar.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f));
        axVar.setClipToPadding(false);
        axVar.f35594g3.f33698r = false;
        axVar.setNestedScrollingEnabled(false);
        axVar.setDrawSelection(false);
        axVar.setOnTouchListener(new m.c2(this, 1));
    }

    public static void E(ex exVar, Runnable runnable, ArrayList arrayList, boolean z10) {
        String str;
        ey eyVar = exVar.G;
        String[] strArr = eyVar.X0;
        if (strArr != null && strArr.length != 0) {
            str = strArr[0];
        } else {
            str = "";
        }
        String str2 = str;
        String str3 = exVar.f33497w;
        if (str3 == null) {
            return;
        }
        org.telegram.messenger.li.b0(eyVar.f33529d1).Z1(true, str2, str3, new ai.v1(exVar, str3, arrayList, runnable, 10), z10);
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 != 0 && i3 != 4) {
            return false;
        }
        return true;
    }

    public final void F(String str, boolean z10) {
        ey eyVar = this.G;
        rw rwVar = eyVar.Q;
        long j10 = 0;
        if (TextUtils.isEmpty(str)) {
            this.f33497w = null;
            u4.h0 adapter = rwVar.getAdapter();
            ow owVar = eyVar.S;
            if (adapter != owVar) {
                rwVar.setAdapter(owVar);
                this.E = false;
            }
            this.d = 0L;
            eyVar.f33521b.a(false, true);
            f();
        } else {
            this.f33497w = str.toLowerCase();
        }
        dx dxVar = this.f33499y;
        if (dxVar != null) {
            org.telegram.messenger.g0.r(dxVar);
        }
        if (!TextUtils.isEmpty(this.f33497w)) {
            this.f33494n.clear();
            this.F = false;
            eyVar.W.e(true);
            dx dxVar2 = new dx(this);
            this.f33499y = dxVar2;
            if (z10) {
                j10 = 300;
            }
            org.telegram.messenger.g0.i3(dxVar2, j10);
        }
    }

    @Override
    public final int b() {
        if (this.d != 0) {
            return this.f33493f.size() + 4;
        }
        ArrayList arrayList = this.h;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f33496s;
        ArrayList arrayList3 = this.f33495r;
        if (isEmpty && arrayList3.isEmpty() && arrayList2.isEmpty() && !this.E) {
            return this.G.getRecentEmoji().size() + 1;
        }
        int i3 = 2;
        if (arrayList.isEmpty() && arrayList3.isEmpty() && arrayList2.isEmpty()) {
            return 2;
        }
        if (!arrayList2.isEmpty()) {
            i3 = 3;
        } else if (arrayList.isEmpty()) {
            i3 = 1;
        }
        int size = arrayList.size() + i3;
        if (!arrayList3.isEmpty()) {
            return arrayList3.size() + size + 1;
        }
        return size;
    }

    @Override
    public final int d(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ex.d(int):int");
    }

    @Override
    public final void f() {
        this.f33491c.f35594g3.O(false);
        super.f();
    }

    @Override
    public final void t(u4.d1 r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ex.t(u4.d1, int):void");
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        ai.o2 o2Var;
        ey eyVar = this.G;
        org.telegram.ui.ActionBar.e6 e6Var = eyVar.f33520a2;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            ai.o2 o2Var2 = new ai.o2(20, eyVar.getContext(), this);
                            TextView textView = new TextView(eyVar.getContext());
                            textView.setText(org.telegram.messenger.bd.M0(2131748221, null));
                            textView.setTextSize(1, 16.0f);
                            int i10 = org.telegram.ui.ActionBar.k6.Af;
                            org.telegram.ui.ActionBar.r6.V(textView, i10, e6Var);
                            o2Var2.addView(textView, b8.mf.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                            ImageView imageView = new ImageView(eyVar.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(2131232124);
                            org.telegram.ui.ActionBar.r6.t(imageView, i10, e6Var, PorterDuff.Mode.MULTIPLY);
                            o2Var2.addView(imageView, b8.mf.e(48, 48, 85));
                            imageView.setOnClickListener(new androidx.mediarouter.app.w(this, 10));
                            o2Var2.setLayoutParams(new u4.p0(-1, -2));
                            o2Var = o2Var2;
                        } else {
                            View view = new View(eyVar.getContext());
                            view.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(68.0f)));
                            o2Var = view;
                        }
                    } else {
                        ViewGroup.LayoutParams p0Var = new u4.p0(-1, org.telegram.messenger.g0.L(79.0f));
                        View view2 = this.f33491c;
                        view2.setLayoutParams(p0Var);
                        o2Var = view2;
                    }
                } else {
                    o2Var = new org.telegram.ui.Cells.i8(eyVar.getContext(), true, false, eyVar.f33520a2, eyVar.f33550j2);
                }
            } else {
                View view3 = new View(eyVar.getContext());
                view3.setLayoutParams(new u4.p0(-1, eyVar.f33527c1));
                o2Var = view3;
            }
        } else {
            o2Var = new nx(eyVar.getContext());
        }
        return new u4.d1(o2Var);
    }
}
