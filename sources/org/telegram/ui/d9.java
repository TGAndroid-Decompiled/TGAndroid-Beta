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
public final class d9 extends org.telegram.ui.Components.k41 {
    public static final int f46844b = 0;

    static {
        org.telegram.ui.Components.k41.h(new org.telegram.ui.Components.k41());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.l41 l41Var, boolean z10, org.telegram.ui.Components.z41 z41Var, org.telegram.ui.Components.e51 e51Var) {
        int i7;
        String str;
        int i10;
        boolean z11;
        SpannableString spannableString;
        int i11;
        boolean z12;
        ?? r12;
        int i12;
        f9 f9Var = (f9) l41Var.H;
        e9 e9Var = (e9) view;
        View.OnClickListener onClickListener = l41Var.E;
        int i13 = e9Var.f47134a;
        org.telegram.ui.Components.e9 e9Var2 = e9Var.f47135b;
        org.telegram.ui.Cells.h6 h6Var = e9Var.d;
        ImageView imageView = e9Var.f47136c;
        boolean z13 = f9Var.f47575e;
        ArrayList arrayList = f9Var.f47574c;
        ArrayList arrayList2 = f9Var.f47573b;
        if (z13) {
            i7 = 2131231916;
        } else {
            i7 = 2131231772;
        }
        imageView.setImageResource(i7);
        TLRPC.Message message = (TLRPC.Message) arrayList.get(0);
        if (org.telegram.messenger.gd.f24213a0) {
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
        int i14 = f9Var.d;
        Object obj = null;
        if (i14 != 0) {
            if (i14 != i10) {
                if (i14 != 2) {
                    if (i14 == 3) {
                        Drawable mutate = e9Var.getContext().getResources().getDrawable(2131231936).mutate();
                        boolean z14 = z11;
                        mutate.setBounds(z14 ? 1 : 0, z14 ? 1 : 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29654r7, z14), PorterDuff.Mode.MULTIPLY));
                        spannableString.setSpan(new ImageSpan(mutate, z14 ? 1 : 0), str.length(), str.length() + 1, 33);
                    }
                } else {
                    Drawable mutate2 = e9Var.getContext().getResources().getDrawable(2131231934).mutate();
                    mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29654r7, false), PorterDuff.Mode.MULTIPLY));
                    spannableString.setSpan(new ImageSpan(mutate2, 0), str.length(), str.length() + 1, 33);
                }
            } else {
                if (e9Var.h == null) {
                    Drawable mutate3 = e9Var.getContext().getResources().getDrawable(2131231934).mutate();
                    i12 = 0;
                    mutate3.setBounds(0, 0, mutate3.getIntrinsicWidth(), mutate3.getIntrinsicHeight());
                    org.telegram.ui.ActionBar.u6.x(h6Var, mutate3, org.telegram.ui.ActionBar.n6.A6, null, PorterDuff.Mode.MULTIPLY);
                    e9Var.h = mutate3;
                } else {
                    i12 = 0;
                }
                spannableString.setSpan(new ImageSpan(e9Var.h, i12), str.length(), str.length() + 1, 33);
            }
            obj = null;
        } else {
            if (e9Var.f47138f == null) {
                Drawable mutate4 = e9Var.getContext().getResources().getDrawable(2131231936).mutate();
                i11 = 0;
                mutate4.setBounds(0, 0, mutate4.getIntrinsicWidth(), mutate4.getIntrinsicHeight());
                obj = null;
                org.telegram.ui.ActionBar.u6.x(h6Var, mutate4, org.telegram.ui.ActionBar.n6.A6, null, PorterDuff.Mode.MULTIPLY);
                e9Var.f47138f = mutate4;
            } else {
                i11 = 0;
                obj = null;
            }
            spannableString.setSpan(new ImageSpan(e9Var.f47138f, i11), str.length(), str.length() + 1, 33);
        }
        if (f9Var.f47572a != 0) {
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
            arrayList3.add(org.telegram.messenger.j10.i(i13).f());
            h6Var.setAllowEmojiStatus(r12);
            org.telegram.ui.Cells.h6 h6Var2 = e9Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(r12);
            }
            h6Var2.x(obj, null, sb2.toString(), spannableString, false, false);
            e9Var2.setVisibility(r12);
            h6Var.f30721r.f();
            h6Var.f30708f = true;
            int min = Math.min(3, arrayList3.size());
            for (int i16 = 0; i16 < min; i16++) {
                e9Var2.b(i16, i13, (TLObject) arrayList3.get(i16));
            }
            z12 = false;
            e9Var2.a(false);
        } else {
            SpannableString spannableString2 = spannableString;
            z12 = false;
            h6Var.setAllowEmojiStatus(true);
            org.telegram.ui.Cells.h6 h6Var3 = e9Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(0);
            }
            h6Var3.x(obj, null, null, spannableString2, false, false);
            e9Var2.setVisibility(8);
            h6Var.f30708f = false;
        }
        imageView.setTag(f9Var);
        imageView.setOnClickListener(onClickListener);
        boolean z15 = l41Var.f37011e;
        org.telegram.ui.Components.mp mpVar = e9Var.f47137e;
        if (mpVar == null) {
            return;
        }
        mpVar.a(z15, z12);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new e9(context, i7);
    }
}
