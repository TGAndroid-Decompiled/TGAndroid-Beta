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
public final class gx extends oj0 {
    public boolean D;
    public boolean E;
    public final gy F;
    public final bx f34003c;
    public long d;
    public TLRPC.StickerSet f34004e;
    public ArrayList f34005f;
    public final ArrayList h = new ArrayList();
    public final ArrayList f34006n = new ArrayList();
    public final ArrayList f34007r = new ArrayList();
    public final ArrayList f34008s = new ArrayList();
    public String f34009w;
    public String f34010x;
    public fx f34011y;

    public gx(gy gyVar, Context context) {
        this.F = gyVar;
        bx bxVar = new bx(context, gyVar.f34024c1, new d(this, 11), new ax(this, 0), gyVar.Z1);
        this.f34003c = bxVar;
        bxVar.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f));
        bxVar.setClipToPadding(false);
        bxVar.f36781f3.f35132r = false;
        bxVar.setNestedScrollingEnabled(false);
        bxVar.setDrawSelection(false);
        bxVar.setOnTouchListener(new m.d2(this, 1));
    }

    public static void E(gx gxVar, Runnable runnable, ArrayList arrayList, boolean z9) {
        String str;
        gy gyVar = gxVar.F;
        String[] strArr = gyVar.W0;
        if (strArr != null && strArr.length != 0) {
            str = strArr[0];
        } else {
            str = "";
        }
        String str2 = str;
        String str3 = gxVar.f34009w;
        if (str3 == null) {
            return;
        }
        org.telegram.messenger.ui.b0(gyVar.f34024c1).Z1(true, str2, str3, new di.s2((Object) gxVar, str3, arrayList, (Object) runnable, 9), z9);
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f56956f;
        if (i7 != 0 && i7 != 4) {
            return false;
        }
        return true;
    }

    public final void F(String str, boolean z9) {
        gy gyVar = this.F;
        sw swVar = gyVar.P;
        long j3 = 0;
        if (TextUtils.isEmpty(str)) {
            this.f34009w = null;
            v4.g0 adapter = swVar.getAdapter();
            pw pwVar = gyVar.R;
            if (adapter != pwVar) {
                swVar.setAdapter(pwVar);
                this.D = false;
            }
            this.d = 0L;
            gyVar.f34018b.a(false, true);
            f();
        } else {
            this.f34009w = str.toLowerCase();
        }
        fx fxVar = this.f34011y;
        if (fxVar != null) {
            org.telegram.messenger.g0.r(fxVar);
        }
        if (!TextUtils.isEmpty(this.f34009w)) {
            this.f34006n.clear();
            this.E = false;
            gyVar.V.e(true);
            fx fxVar2 = new fx(this);
            this.f34011y = fxVar2;
            if (z9) {
                j3 = 300;
            }
            org.telegram.messenger.g0.i3(fxVar2, j3);
        }
    }

    @Override
    public final int b() {
        if (this.d != 0) {
            return this.f34005f.size() + 4;
        }
        ArrayList arrayList = this.h;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f34008s;
        ArrayList arrayList3 = this.f34007r;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gx.d(int):int");
    }

    @Override
    public final void f() {
        this.f34003c.f36781f3.O(false);
        super.f();
    }

    @Override
    public final void t(v4.d1 r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gx.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        bi.e5 e5Var;
        gy gyVar = this.F;
        org.telegram.ui.ActionBar.f6 f6Var = gyVar.Z1;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            bi.e5 e5Var2 = new bi.e5(18, gyVar.getContext(), this);
                            TextView textView = new TextView(gyVar.getContext());
                            textView.setText(org.telegram.messenger.hd.M0(2131748212, null));
                            textView.setTextSize(1, 16.0f);
                            int i10 = org.telegram.ui.ActionBar.k6.Af;
                            org.telegram.ui.ActionBar.r6.V(textView, i10, f6Var);
                            e5Var2.addView(textView, c8.ha.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                            ImageView imageView = new ImageView(gyVar.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(2131232124);
                            org.telegram.ui.ActionBar.r6.t(imageView, i10, f6Var, PorterDuff.Mode.MULTIPLY);
                            e5Var2.addView(imageView, c8.ha.e(48, 48, 85));
                            imageView.setOnClickListener(new androidx.mediarouter.app.w(this, 10));
                            e5Var2.setLayoutParams(new v4.o0(-1, -2));
                            e5Var = e5Var2;
                        } else {
                            View view = new View(gyVar.getContext());
                            view.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(68.0f)));
                            e5Var = view;
                        }
                    } else {
                        ViewGroup.LayoutParams o0Var = new v4.o0(-1, org.telegram.messenger.g0.L(79.0f));
                        View view2 = this.f34003c;
                        view2.setLayoutParams(o0Var);
                        e5Var = view2;
                    }
                } else {
                    e5Var = new org.telegram.ui.Cells.j8(gyVar.getContext(), true, false, gyVar.Z1, gyVar.f34044i2);
                }
            } else {
                View view3 = new View(gyVar.getContext());
                view3.setLayoutParams(new v4.o0(-1, gyVar.f34020b1));
                e5Var = view3;
            }
        } else {
            e5Var = new px(gyVar.getContext());
        }
        return new v4.d1(e5Var);
    }
}
