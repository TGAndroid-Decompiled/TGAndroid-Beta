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
public final class e9 extends org.telegram.ui.Components.a51 {
    public static final int f36781b = 0;

    static {
        org.telegram.ui.Components.a51.h(new org.telegram.ui.Components.a51());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.b51 b51Var, boolean z10, org.telegram.ui.Components.q51 q51Var, org.telegram.ui.Components.v51 v51Var) {
        int i10;
        String str;
        int i11;
        boolean z11;
        SpannableString spannableString;
        int i12;
        boolean z12;
        ?? r12;
        int i13;
        g9 g9Var = (g9) b51Var.G;
        f9 f9Var = (f9) view;
        View.OnClickListener onClickListener = b51Var.D;
        int i14 = f9Var.f37083a;
        org.telegram.ui.Components.u8 u8Var = f9Var.f37084b;
        org.telegram.ui.Cells.k6 k6Var = f9Var.d;
        ImageView imageView = f9Var.f37085c;
        boolean z13 = g9Var.e;
        ArrayList arrayList = g9Var.f37407c;
        ArrayList arrayList2 = g9Var.f37406b;
        if (z13) {
            i10 = 2131231914;
        } else {
            i10 = 2131231770;
        }
        imageView.setImageResource(i10);
        TLRPC.Message message = (TLRPC.Message) arrayList.get(0);
        if (org.telegram.messenger.dd.X) {
            str = "\u202b";
        } else {
            str = "";
        }
        if (arrayList.size() == 1) {
            StringBuilder i15 = sc.e.i(str, "  ");
            i11 = 1;
            i15.append(org.telegram.messenger.dd.t(message.date));
            spannableString = new SpannableString(i15.toString());
            z11 = false;
        } else {
            i11 = 1;
            z11 = false;
            spannableString = new SpannableString(String.format(str.concat("  (%d) %s"), Integer.valueOf(arrayList.size()), org.telegram.messenger.dd.t(message.date)));
        }
        int i16 = g9Var.d;
        Object obj = null;
        if (i16 != 0) {
            if (i16 != i11) {
                if (i16 != 2) {
                    if (i16 == 3) {
                        Drawable mutate = f9Var.getContext().getResources().getDrawable(2131231934).mutate();
                        boolean z14 = z11;
                        mutate.setBounds(z14 ? 1 : 0, z14 ? 1 : 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21188r7, z14), PorterDuff.Mode.MULTIPLY));
                        spannableString.setSpan(new ImageSpan(mutate, z14 ? 1 : 0), str.length(), str.length() + 1, 33);
                    }
                } else {
                    Drawable mutate2 = f9Var.getContext().getResources().getDrawable(2131231932).mutate();
                    mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21188r7, false), PorterDuff.Mode.MULTIPLY));
                    spannableString.setSpan(new ImageSpan(mutate2, 0), str.length(), str.length() + 1, 33);
                }
            } else {
                if (f9Var.h == null) {
                    Drawable mutate3 = f9Var.getContext().getResources().getDrawable(2131231932).mutate();
                    i13 = 0;
                    mutate3.setBounds(0, 0, mutate3.getIntrinsicWidth(), mutate3.getIntrinsicHeight());
                    org.telegram.ui.ActionBar.a7.y(k6Var, mutate3, org.telegram.ui.ActionBar.t6.A6, null, PorterDuff.Mode.MULTIPLY);
                    f9Var.h = mutate3;
                } else {
                    i13 = 0;
                }
                spannableString.setSpan(new ImageSpan(f9Var.h, i13), str.length(), str.length() + 1, 33);
            }
            obj = null;
        } else {
            if (f9Var.f37086f == null) {
                Drawable mutate4 = f9Var.getContext().getResources().getDrawable(2131231934).mutate();
                i12 = 0;
                mutate4.setBounds(0, 0, mutate4.getIntrinsicWidth(), mutate4.getIntrinsicHeight());
                obj = null;
                org.telegram.ui.ActionBar.a7.y(k6Var, mutate4, org.telegram.ui.ActionBar.t6.A6, null, PorterDuff.Mode.MULTIPLY);
                f9Var.f37086f = mutate4;
            } else {
                i12 = 0;
                obj = null;
            }
            spannableString.setSpan(new ImageSpan(f9Var.f37086f, i12), str.length(), str.length() + 1, 33);
        }
        if (g9Var.f37405a != 0) {
            StringBuilder sb2 = new StringBuilder();
            for (int i17 = 0; i17 < Math.min(3, arrayList2.size()); i17++) {
                if (i17 > 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.o5.u((TLObject) arrayList2.get(i17)));
            }
            if (arrayList2.size() > 3) {
                sb2.append(" ");
                r12 = 0;
                sb2.append(org.telegram.messenger.dd.G(arrayList2.size() - 3, "AndOther", new Object[0]));
            } else {
                r12 = 0;
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            arrayList3.add(org.telegram.messenger.e20.i(i14).f());
            k6Var.setAllowEmojiStatus(r12);
            org.telegram.ui.Cells.k6 k6Var2 = f9Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(r12);
            }
            k6Var2.z(obj, null, sb2.toString(), spannableString, false, false);
            u8Var.setVisibility(r12);
            k6Var.f22142r.f();
            k6Var.f22129f = true;
            int min = Math.min(3, arrayList3.size());
            for (int i18 = 0; i18 < min; i18++) {
                u8Var.b(i18, i14, (TLObject) arrayList3.get(i18));
            }
            z12 = false;
            u8Var.a(false);
        } else {
            SpannableString spannableString2 = spannableString;
            z12 = false;
            k6Var.setAllowEmojiStatus(true);
            org.telegram.ui.Cells.k6 k6Var3 = f9Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(0);
            }
            k6Var3.z(obj, null, null, spannableString2, false, false);
            u8Var.setVisibility(8);
            k6Var.f22129f = false;
        }
        imageView.setTag(g9Var);
        imageView.setOnClickListener(onClickListener);
        boolean z15 = b51Var.e;
        org.telegram.ui.Components.ep epVar = f9Var.e;
        if (epVar == null) {
            return;
        }
        epVar.a(z15, z12);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new f9(context, i10);
    }
}
