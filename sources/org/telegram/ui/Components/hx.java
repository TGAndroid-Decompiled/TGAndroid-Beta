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
public final class hx extends pj0 {
    public boolean D;
    public boolean E;
    public final hy F;
    public final cx f34394c;
    public long d;
    public TLRPC.StickerSet f34395e;
    public ArrayList f34396f;
    public final ArrayList h = new ArrayList();
    public final ArrayList f34397n = new ArrayList();
    public final ArrayList f34398r = new ArrayList();
    public final ArrayList f34399s = new ArrayList();
    public String f34400w;
    public String f34401x;
    public gx f34402y;

    public hx(hy hyVar, Context context) {
        this.F = hyVar;
        cx cxVar = new cx(context, hyVar.f34415c1, new d(this, 11), new bx(this, 0), hyVar.Z1);
        this.f34394c = cxVar;
        cxVar.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f));
        cxVar.setClipToPadding(false);
        cxVar.f37556f3.f35945r = false;
        cxVar.setNestedScrollingEnabled(false);
        cxVar.setDrawSelection(false);
        cxVar.setOnTouchListener(new m.d2(this, 1));
    }

    public static void E(hx hxVar, Runnable runnable, ArrayList arrayList, boolean z9) {
        String str;
        hy hyVar = hxVar.F;
        String[] strArr = hyVar.W0;
        if (strArr != null && strArr.length != 0) {
            str = strArr[0];
        } else {
            str = "";
        }
        String str2 = str;
        String str3 = hxVar.f34400w;
        if (str3 == null) {
            return;
        }
        org.telegram.messenger.ui.b0(hyVar.f34415c1).Z1(true, str2, str3, new di.s2((Object) hxVar, str3, arrayList, (Object) runnable, 9), z9);
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57060f;
        if (i7 != 0 && i7 != 4) {
            return false;
        }
        return true;
    }

    public final void F(String str, boolean z9) {
        hy hyVar = this.F;
        tw twVar = hyVar.P;
        long j3 = 0;
        if (TextUtils.isEmpty(str)) {
            this.f34400w = null;
            v4.g0 adapter = twVar.getAdapter();
            qw qwVar = hyVar.R;
            if (adapter != qwVar) {
                twVar.setAdapter(qwVar);
                this.D = false;
            }
            this.d = 0L;
            hyVar.f34409b.a(false, true);
            f();
        } else {
            this.f34400w = str.toLowerCase();
        }
        gx gxVar = this.f34402y;
        if (gxVar != null) {
            org.telegram.messenger.g0.r(gxVar);
        }
        if (!TextUtils.isEmpty(this.f34400w)) {
            this.f34397n.clear();
            this.E = false;
            hyVar.V.e(true);
            gx gxVar2 = new gx(this);
            this.f34402y = gxVar2;
            if (z9) {
                j3 = 300;
            }
            org.telegram.messenger.g0.i3(gxVar2, j3);
        }
    }

    @Override
    public final int b() {
        if (this.d != 0) {
            return this.f34396f.size() + 4;
        }
        ArrayList arrayList = this.h;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f34399s;
        ArrayList arrayList3 = this.f34398r;
        if (isEmpty && arrayList3.isEmpty() && arrayList2.isEmpty() && !this.D) {
            return this.F.getRecentEmoji().size() + 1;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hx.d(int):int");
    }

    @Override
    public final void f() {
        this.f34394c.f37556f3.O(false);
        super.f();
    }

    @Override
    public final void t(v4.d1 r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hx.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        bi.e5 e5Var;
        hy hyVar = this.F;
        org.telegram.ui.ActionBar.g6 g6Var = hyVar.Z1;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            bi.e5 e5Var2 = new bi.e5(18, hyVar.getContext(), this);
                            TextView textView = new TextView(hyVar.getContext());
                            textView.setText(org.telegram.messenger.id.M0(2131748213, null));
                            textView.setTextSize(1, 16.0f);
                            int i10 = org.telegram.ui.ActionBar.l6.Af;
                            org.telegram.ui.ActionBar.s6.U(textView, i10, g6Var);
                            e5Var2.addView(textView, c8.ha.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                            ImageView imageView = new ImageView(hyVar.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(2131232124);
                            org.telegram.ui.ActionBar.s6.s(imageView, i10, g6Var, PorterDuff.Mode.MULTIPLY);
                            e5Var2.addView(imageView, c8.ha.e(48, 48, 85));
                            imageView.setOnClickListener(new androidx.mediarouter.app.w(this, 10));
                            e5Var2.setLayoutParams(new v4.o0(-1, -2));
                            e5Var = e5Var2;
                        } else {
                            View view = new View(hyVar.getContext());
                            view.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(68.0f)));
                            e5Var = view;
                        }
                    } else {
                        ViewGroup.LayoutParams o0Var = new v4.o0(-1, org.telegram.messenger.g0.L(79.0f));
                        View view2 = this.f34394c;
                        view2.setLayoutParams(o0Var);
                        e5Var = view2;
                    }
                } else {
                    e5Var = new org.telegram.ui.Cells.j8(hyVar.getContext(), true, false, hyVar.Z1, hyVar.f34435i2);
                }
            } else {
                View view3 = new View(hyVar.getContext());
                view3.setLayoutParams(new v4.o0(-1, hyVar.f34411b1));
                e5Var = view3;
            }
        } else {
            e5Var = new qx(hyVar.getContext());
        }
        return new v4.d1(e5Var);
    }
}
