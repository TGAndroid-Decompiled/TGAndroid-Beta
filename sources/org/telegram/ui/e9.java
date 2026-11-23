package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e9 extends org.telegram.ui.Components.m41 {
    public static final int f47477b = 0;

    static {
        org.telegram.ui.Components.m41.h(new org.telegram.ui.Components.m41());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.n41 n41Var, boolean z10, org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.g51 g51Var) {
        int i7;
        String str;
        int i10;
        boolean z11;
        SpannableString spannableString;
        int i11;
        boolean z12;
        ?? r12;
        int i12;
        g9 g9Var = (g9) n41Var.H;
        f9 f9Var = (f9) view;
        View.OnClickListener onClickListener = n41Var.E;
        int i13 = f9Var.f47725a;
        org.telegram.ui.Components.d9 d9Var = f9Var.f47726b;
        org.telegram.ui.Cells.g6 g6Var = f9Var.d;
        ImageView imageView = f9Var.f47727c;
        boolean z13 = g9Var.f48190e;
        ArrayList arrayList = g9Var.f48189c;
        ArrayList arrayList2 = g9Var.f48188b;
        if (z13) {
            i7 = 2131231919;
        } else {
            i7 = 2131231775;
        }
        imageView.setImageResource(i7);
        TLRPC.Message message = (TLRPC.Message) arrayList.get(0);
        if (org.telegram.messenger.gd.f24314a0) {
            str = "\u202b";
        } else {
            str = "";
        }
        if (arrayList.size() == 1) {
            StringBuilder n10 = p5.c.n(str, "  ");
            i10 = 1;
            n10.append(org.telegram.messenger.gd.t(message.date));
            spannableString = new SpannableString(n10.toString());
            z11 = false;
        } else {
            i10 = 1;
            z11 = false;
            spannableString = new SpannableString(String.format(str.concat("  (%d) %s"), Integer.valueOf(arrayList.size()), org.telegram.messenger.gd.t(message.date)));
        }
        int i14 = g9Var.d;
        Object obj = null;
        if (i14 != 0) {
            if (i14 != i10) {
                if (i14 != 2) {
                    if (i14 == 3) {
                        Drawable mutate = f9Var.getContext().getResources().getDrawable(2131231939).mutate();
                        boolean z14 = z11;
                        mutate.setBounds(z14 ? 1 : 0, z14 ? 1 : 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29711r7, z14), PorterDuff.Mode.MULTIPLY));
                        spannableString.setSpan(new ImageSpan(mutate, z14 ? 1 : 0), str.length(), str.length() + 1, 33);
                    }
                } else {
                    Drawable mutate2 = f9Var.getContext().getResources().getDrawable(2131231937).mutate();
                    mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29711r7, false), PorterDuff.Mode.MULTIPLY));
                    spannableString.setSpan(new ImageSpan(mutate2, 0), str.length(), str.length() + 1, 33);
                }
            } else {
                if (f9Var.h == null) {
                    Drawable mutate3 = f9Var.getContext().getResources().getDrawable(2131231937).mutate();
                    i12 = 0;
                    mutate3.setBounds(0, 0, mutate3.getIntrinsicWidth(), mutate3.getIntrinsicHeight());
                    org.telegram.ui.ActionBar.u6.x(g6Var, mutate3, org.telegram.ui.ActionBar.n6.A6, null, PorterDuff.Mode.MULTIPLY);
                    f9Var.h = mutate3;
                } else {
                    i12 = 0;
                }
                spannableString.setSpan(new ImageSpan(f9Var.h, i12), str.length(), str.length() + 1, 33);
            }
            obj = null;
        } else {
            if (f9Var.f47729f == null) {
                Drawable mutate4 = f9Var.getContext().getResources().getDrawable(2131231939).mutate();
                i11 = 0;
                mutate4.setBounds(0, 0, mutate4.getIntrinsicWidth(), mutate4.getIntrinsicHeight());
                obj = null;
                org.telegram.ui.ActionBar.u6.x(g6Var, mutate4, org.telegram.ui.ActionBar.n6.A6, null, PorterDuff.Mode.MULTIPLY);
                f9Var.f47729f = mutate4;
            } else {
                i11 = 0;
                obj = null;
            }
            spannableString.setSpan(new ImageSpan(f9Var.f47729f, i11), str.length(), str.length() + 1, 33);
        }
        if (g9Var.f48187a != 0) {
            StringBuilder sb2 = new StringBuilder();
            for (int i15 = 0; i15 < Math.min(3, arrayList2.size()); i15++) {
                if (i15 > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.n5.u((TLObject) arrayList2.get(i15)));
            }
            if (arrayList2.size() > 3) {
                sb2.append(" ");
                r12 = 0;
                sb2.append(org.telegram.messenger.gd.G(arrayList2.size() - 3, "AndOther", new Object[0]));
            } else {
                r12 = 0;
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            arrayList3.add(org.telegram.messenger.i10.i(i13).f());
            g6Var.setAllowEmojiStatus(r12);
            org.telegram.ui.Cells.g6 g6Var2 = f9Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(r12);
            }
            g6Var2.z(obj, null, sb2.toString(), spannableString, false, false);
            d9Var.setVisibility(r12);
            g6Var.f30778r.f();
            g6Var.f30765f = true;
            int min = Math.min(3, arrayList3.size());
            for (int i16 = 0; i16 < min; i16++) {
                d9Var.b(i16, i13, (TLObject) arrayList3.get(i16));
            }
            z12 = false;
            d9Var.a(false);
        } else {
            SpannableString spannableString2 = spannableString;
            z12 = false;
            g6Var.setAllowEmojiStatus(true);
            org.telegram.ui.Cells.g6 g6Var3 = f9Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(0);
            }
            g6Var3.z(obj, null, null, spannableString2, false, false);
            d9Var.setVisibility(8);
            g6Var.f30765f = false;
        }
        imageView.setTag(g9Var);
        imageView.setOnClickListener(onClickListener);
        boolean z15 = n41Var.f37648e;
        org.telegram.ui.Components.lp lpVar = f9Var.f47728e;
        if (lpVar == null) {
            return;
        }
        lpVar.a(z15, z12);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new f9(context, i7);
    }
}
