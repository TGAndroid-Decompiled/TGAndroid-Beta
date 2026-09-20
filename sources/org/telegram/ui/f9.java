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
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f9 extends org.telegram.ui.Components.v51 {
    public static final int f33546a = 0;

    static {
        org.telegram.ui.Components.v51.setup(new org.telegram.ui.Components.v51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.w51 w51Var, boolean z10, org.telegram.ui.Components.k61 k61Var, org.telegram.ui.Components.s61 s61Var) {
        int i10;
        String str;
        SpannableString spannableString;
        boolean z11;
        Object obj;
        ?? r12;
        Object obj2;
        h9 h9Var = (h9) w51Var.G;
        g9 g9Var = (g9) view;
        View.OnClickListener onClickListener = w51Var.D;
        int i11 = g9Var.f33835a;
        org.telegram.ui.Components.j9 j9Var = g9Var.f33836b;
        org.telegram.ui.Cells.j6 j6Var = g9Var.d;
        ImageView imageView = g9Var.f33837c;
        boolean z12 = h9Var.e;
        ArrayList arrayList = h9Var.f34147c;
        ArrayList arrayList2 = h9Var.f34146b;
        if (z12) {
            i10 = R.drawable.menu_videocall;
        } else {
            i10 = R.drawable.menu_call_create_2_24;
        }
        imageView.setImageResource(i10);
        TLRPC.Message message = (TLRPC.Message) arrayList.get(0);
        if (LocaleController.isRTL) {
            str = "\u202b";
        } else {
            str = "";
        }
        if (arrayList.size() == 1) {
            StringBuilder h = v7.j0.h(str, "  ");
            h.append(LocaleController.formatDateCallLog(message.date));
            spannableString = new SpannableString(h.toString());
        } else {
            spannableString = new SpannableString(String.format(str.concat("  (%d) %s"), Integer.valueOf(arrayList.size()), LocaleController.formatDateCallLog(message.date)));
        }
        int i12 = h9Var.d;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        Drawable mutate = g9Var.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
                        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19352r7, false), PorterDuff.Mode.MULTIPLY));
                        spannableString.setSpan(new ImageSpan(mutate, 0), str.length(), str.length() + 1, 33);
                    }
                } else {
                    Drawable mutate2 = g9Var.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
                    mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19352r7, false), PorterDuff.Mode.MULTIPLY));
                    spannableString.setSpan(new ImageSpan(mutate2, 0), str.length(), str.length() + 1, 33);
                }
            } else {
                Drawable mutate3 = g9Var.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
                mutate3.setBounds(0, 0, mutate3.getIntrinsicWidth(), mutate3.getIntrinsicHeight());
                mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A6, false), PorterDuff.Mode.MULTIPLY));
                spannableString.setSpan(new ImageSpan(mutate3, 0), str.length(), str.length() + 1, 33);
            }
        } else {
            Drawable mutate4 = g9Var.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
            mutate4.setBounds(0, 0, mutate4.getIntrinsicWidth(), mutate4.getIntrinsicHeight());
            mutate4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A6, false), PorterDuff.Mode.MULTIPLY));
            spannableString.setSpan(new ImageSpan(mutate4, 0), str.length(), str.length() + 1, 33);
        }
        if (h9Var.f34145a != 0) {
            StringBuilder sb2 = new StringBuilder();
            for (int i13 = 0; i13 < Math.min(3, arrayList2.size()); i13++) {
                if (i13 > 0) {
                    sb2.append(", ");
                }
                sb2.append(DialogObject.getShortName((TLObject) arrayList2.get(i13)));
            }
            if (arrayList2.size() > 3) {
                sb2.append(" ");
                r12 = 0;
                sb2.append(LocaleController.formatPluralString("AndOther", arrayList2.size() - 3, new Object[0]));
            } else {
                r12 = 0;
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            arrayList3.add(UserConfig.getInstance(i11).getCurrentUser());
            j6Var.setAllowEmojiStatus(r12);
            org.telegram.ui.Cells.j6 j6Var2 = g9Var.d;
            if (!arrayList2.isEmpty()) {
                obj2 = arrayList2.get(r12);
            } else {
                obj2 = null;
            }
            j6Var2.t(obj2, null, sb2.toString(), spannableString, false, false);
            j9Var.setVisibility(r12);
            j6Var.f20490r.clearImage();
            j6Var.f20477f = true;
            int min = Math.min(3, arrayList3.size());
            for (int i14 = 0; i14 < min; i14++) {
                j9Var.b(i14, (TLObject) arrayList3.get(i14), i11);
            }
            z11 = false;
            j9Var.a(false);
        } else {
            SpannableString spannableString2 = spannableString;
            z11 = false;
            j6Var.setAllowEmojiStatus(true);
            org.telegram.ui.Cells.j6 j6Var3 = g9Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(0);
            } else {
                obj = null;
            }
            j6Var3.t(obj, null, null, spannableString2, false, false);
            j9Var.setVisibility(8);
            j6Var.f20477f = false;
        }
        imageView.setTag(h9Var);
        imageView.setOnClickListener(onClickListener);
        boolean z13 = w51Var.e;
        org.telegram.ui.Components.np npVar = g9Var.e;
        if (npVar == null) {
            return;
        }
        npVar.a(z13, z11);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new g9(context, i10);
    }
}
