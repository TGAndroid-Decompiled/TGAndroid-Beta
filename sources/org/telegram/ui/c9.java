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
public final class c9 extends org.telegram.ui.Components.q31 {
    public static final int f44278b = 0;

    static {
        org.telegram.ui.Components.q31.h(new org.telegram.ui.Components.q31());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.r31 r31Var, boolean z10, org.telegram.ui.Components.f41 f41Var, org.telegram.ui.Components.l41 l41Var) {
        int i3;
        String str;
        int i10;
        boolean z11;
        SpannableString spannableString;
        int i11;
        boolean z12;
        ?? r12;
        int i12;
        e9 e9Var = (e9) r31Var.G;
        d9 d9Var = (d9) view;
        View.OnClickListener onClickListener = r31Var.D;
        int i13 = d9Var.f44604a;
        org.telegram.ui.Components.x8 x8Var = d9Var.f44605b;
        org.telegram.ui.Cells.f6 f6Var = d9Var.d;
        ImageView imageView = d9Var.f44606c;
        boolean z13 = e9Var.f44929e;
        ArrayList arrayList = e9Var.f44928c;
        ArrayList arrayList2 = e9Var.f44927b;
        if (z13) {
            i3 = 2131231915;
        } else {
            i3 = 2131231771;
        }
        imageView.setImageResource(i3);
        TLRPC.Message message = (TLRPC.Message) arrayList.get(0);
        if (org.telegram.messenger.bd.f21784a0) {
            str = "\u202b";
        } else {
            str = "";
        }
        if (arrayList.size() == 1) {
            StringBuilder h = t4.c.h(str, "  ");
            i10 = 1;
            h.append(org.telegram.messenger.bd.t(message.date));
            spannableString = new SpannableString(h.toString());
            z11 = false;
        } else {
            i10 = 1;
            z11 = false;
            spannableString = new SpannableString(String.format(str.concat("  (%d) %s"), Integer.valueOf(arrayList.size()), org.telegram.messenger.bd.t(message.date)));
        }
        int i14 = e9Var.d;
        Object obj = null;
        if (i14 != 0) {
            if (i14 != i10) {
                if (i14 != 2) {
                    if (i14 == 3) {
                        Drawable mutate = d9Var.getContext().getResources().getDrawable(2131231935).mutate();
                        boolean z14 = z11;
                        mutate.setBounds(z14 ? 1 : 0, z14 ? 1 : 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28141r7, z14), PorterDuff.Mode.MULTIPLY));
                        spannableString.setSpan(new ImageSpan(mutate, z14 ? 1 : 0), str.length(), str.length() + 1, 33);
                    }
                } else {
                    Drawable mutate2 = d9Var.getContext().getResources().getDrawable(2131231933).mutate();
                    mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28141r7, false), PorterDuff.Mode.MULTIPLY));
                    spannableString.setSpan(new ImageSpan(mutate2, 0), str.length(), str.length() + 1, 33);
                }
            } else {
                if (d9Var.h == null) {
                    Drawable mutate3 = d9Var.getContext().getResources().getDrawable(2131231933).mutate();
                    i12 = 0;
                    mutate3.setBounds(0, 0, mutate3.getIntrinsicWidth(), mutate3.getIntrinsicHeight());
                    org.telegram.ui.ActionBar.r6.y(f6Var, mutate3, org.telegram.ui.ActionBar.k6.A6, null, PorterDuff.Mode.MULTIPLY);
                    d9Var.h = mutate3;
                } else {
                    i12 = 0;
                }
                spannableString.setSpan(new ImageSpan(d9Var.h, i12), str.length(), str.length() + 1, 33);
            }
            obj = null;
        } else {
            if (d9Var.f44608f == null) {
                Drawable mutate4 = d9Var.getContext().getResources().getDrawable(2131231935).mutate();
                i11 = 0;
                mutate4.setBounds(0, 0, mutate4.getIntrinsicWidth(), mutate4.getIntrinsicHeight());
                obj = null;
                org.telegram.ui.ActionBar.r6.y(f6Var, mutate4, org.telegram.ui.ActionBar.k6.A6, null, PorterDuff.Mode.MULTIPLY);
                d9Var.f44608f = mutate4;
            } else {
                i11 = 0;
                obj = null;
            }
            spannableString.setSpan(new ImageSpan(d9Var.f44608f, i11), str.length(), str.length() + 1, 33);
        }
        if (e9Var.f44926a != 0) {
            StringBuilder sb2 = new StringBuilder();
            for (int i15 = 0; i15 < Math.min(3, arrayList2.size()); i15++) {
                if (i15 > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.m5.u((TLObject) arrayList2.get(i15)));
            }
            if (arrayList2.size() > 3) {
                sb2.append(" ");
                r12 = 0;
                sb2.append(org.telegram.messenger.bd.G(arrayList2.size() - 3, "AndOther", new Object[0]));
            } else {
                r12 = 0;
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            arrayList3.add(org.telegram.messenger.h10.i(i13).f());
            f6Var.setAllowEmojiStatus(r12);
            org.telegram.ui.Cells.f6 f6Var2 = d9Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(r12);
            }
            f6Var2.x(obj, null, sb2.toString(), spannableString, false, false);
            x8Var.setVisibility(r12);
            f6Var.f29198r.f();
            f6Var.f29185f = true;
            int min = Math.min(3, arrayList3.size());
            for (int i16 = 0; i16 < min; i16++) {
                x8Var.b(i16, i13, (TLObject) arrayList3.get(i16));
            }
            z12 = false;
            x8Var.a(false);
        } else {
            SpannableString spannableString2 = spannableString;
            z12 = false;
            f6Var.setAllowEmojiStatus(true);
            org.telegram.ui.Cells.f6 f6Var3 = d9Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(0);
            }
            f6Var3.x(obj, null, null, spannableString2, false, false);
            x8Var.setVisibility(8);
            f6Var.f29185f = false;
        }
        imageView.setTag(e9Var);
        imageView.setOnClickListener(onClickListener);
        boolean z15 = r31Var.f37621e;
        org.telegram.ui.Components.wo woVar = d9Var.f44607e;
        if (woVar == null) {
            return;
        }
        woVar.a(z15, z12);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new d9(context, i3);
    }
}
