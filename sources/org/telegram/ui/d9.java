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
public final class d9 extends org.telegram.ui.Components.w31 {
    public static final int f45030b = 0;

    static {
        org.telegram.ui.Components.w31.h(new org.telegram.ui.Components.w31());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.x31 x31Var, boolean z9, org.telegram.ui.Components.l41 l41Var, org.telegram.ui.Components.q41 q41Var) {
        int i7;
        String str;
        int i10;
        boolean z10;
        SpannableString spannableString;
        int i11;
        boolean z11;
        ?? r12;
        int i12;
        f9 f9Var = (f9) x31Var.G;
        e9 e9Var = (e9) view;
        View.OnClickListener onClickListener = x31Var.D;
        int i13 = e9Var.f45239a;
        org.telegram.ui.Components.z8 z8Var = e9Var.f45240b;
        org.telegram.ui.Cells.g6 g6Var = e9Var.d;
        ImageView imageView = e9Var.f45241c;
        boolean z12 = f9Var.f45518e;
        ArrayList arrayList = f9Var.f45517c;
        ArrayList arrayList2 = f9Var.f45516b;
        if (z12) {
            i7 = 2131231915;
        } else {
            i7 = 2131231771;
        }
        imageView.setImageResource(i7);
        TLRPC.Message message = (TLRPC.Message) arrayList.get(0);
        if (org.telegram.messenger.id.f23157a0) {
            str = "\u202b";
        } else {
            str = "";
        }
        if (arrayList.size() == 1) {
            StringBuilder j3 = rf.b.j(str, "  ");
            i10 = 1;
            j3.append(org.telegram.messenger.id.t(message.date));
            spannableString = new SpannableString(j3.toString());
            z10 = false;
        } else {
            i10 = 1;
            z10 = false;
            spannableString = new SpannableString(String.format(str.concat("  (%d) %s"), Integer.valueOf(arrayList.size()), org.telegram.messenger.id.t(message.date)));
        }
        int i14 = f9Var.d;
        Object obj = null;
        if (i14 != 0) {
            if (i14 != i10) {
                if (i14 != 2) {
                    if (i14 == 3) {
                        Drawable mutate = e9Var.getContext().getResources().getDrawable(2131231935).mutate();
                        boolean z13 = z10;
                        mutate.setBounds(z13 ? 1 : 0, z13 ? 1 : 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28112r7, z13), PorterDuff.Mode.MULTIPLY));
                        spannableString.setSpan(new ImageSpan(mutate, z13 ? 1 : 0), str.length(), str.length() + 1, 33);
                    }
                } else {
                    Drawable mutate2 = e9Var.getContext().getResources().getDrawable(2131231933).mutate();
                    mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28112r7, false), PorterDuff.Mode.MULTIPLY));
                    spannableString.setSpan(new ImageSpan(mutate2, 0), str.length(), str.length() + 1, 33);
                }
            } else {
                if (e9Var.h == null) {
                    Drawable mutate3 = e9Var.getContext().getResources().getDrawable(2131231933).mutate();
                    i12 = 0;
                    mutate3.setBounds(0, 0, mutate3.getIntrinsicWidth(), mutate3.getIntrinsicHeight());
                    org.telegram.ui.ActionBar.r6.y(g6Var, mutate3, org.telegram.ui.ActionBar.k6.A6, null, PorterDuff.Mode.MULTIPLY);
                    e9Var.h = mutate3;
                } else {
                    i12 = 0;
                }
                spannableString.setSpan(new ImageSpan(e9Var.h, i12), str.length(), str.length() + 1, 33);
            }
            obj = null;
        } else {
            if (e9Var.f45243f == null) {
                Drawable mutate4 = e9Var.getContext().getResources().getDrawable(2131231935).mutate();
                i11 = 0;
                mutate4.setBounds(0, 0, mutate4.getIntrinsicWidth(), mutate4.getIntrinsicHeight());
                obj = null;
                org.telegram.ui.ActionBar.r6.y(g6Var, mutate4, org.telegram.ui.ActionBar.k6.A6, null, PorterDuff.Mode.MULTIPLY);
                e9Var.f45243f = mutate4;
            } else {
                i11 = 0;
                obj = null;
            }
            spannableString.setSpan(new ImageSpan(e9Var.f45243f, i11), str.length(), str.length() + 1, 33);
        }
        if (f9Var.f45515a != 0) {
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
                sb2.append(org.telegram.messenger.id.G(arrayList2.size() - 3, "AndOther", new Object[0]));
            } else {
                r12 = 0;
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            arrayList3.add(org.telegram.messenger.p10.i(i13).f());
            g6Var.setAllowEmojiStatus(r12);
            org.telegram.ui.Cells.g6 g6Var2 = e9Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(r12);
            }
            g6Var2.x(obj, null, sb2.toString(), spannableString, false, false);
            z8Var.setVisibility(r12);
            g6Var.f29165r.f();
            g6Var.f29152f = true;
            int min = Math.min(3, arrayList3.size());
            for (int i16 = 0; i16 < min; i16++) {
                z8Var.b(i16, i13, (TLObject) arrayList3.get(i16));
            }
            z11 = false;
            z8Var.a(false);
        } else {
            SpannableString spannableString2 = spannableString;
            z11 = false;
            g6Var.setAllowEmojiStatus(true);
            org.telegram.ui.Cells.g6 g6Var3 = e9Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(0);
            }
            g6Var3.x(obj, null, null, spannableString2, false, false);
            z8Var.setVisibility(8);
            g6Var.f29152f = false;
        }
        imageView.setTag(f9Var);
        imageView.setOnClickListener(onClickListener);
        boolean z14 = x31Var.f40174e;
        org.telegram.ui.Components.wo woVar = e9Var.f45242e;
        if (woVar == null) {
            return;
        }
        woVar.a(z14, z11);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new e9(context, i7);
    }
}
