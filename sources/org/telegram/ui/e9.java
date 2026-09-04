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
public final class e9 extends org.telegram.ui.Components.g51 {
    public static final int f35977a = 0;

    static {
        org.telegram.ui.Components.g51.setup(new org.telegram.ui.Components.g51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.h51 h51Var, boolean z10, org.telegram.ui.Components.v51 v51Var, org.telegram.ui.Components.d61 d61Var) {
        int i10;
        String str;
        SpannableString spannableString;
        boolean z11;
        Object obj;
        ?? r12;
        Object obj2;
        g9 g9Var = (g9) h51Var.G;
        f9 f9Var = (f9) view;
        View.OnClickListener onClickListener = h51Var.D;
        int i11 = f9Var.f36339a;
        org.telegram.ui.Components.l9 l9Var = f9Var.f36340b;
        org.telegram.ui.Cells.h6 h6Var = f9Var.d;
        ImageView imageView = f9Var.f36341c;
        boolean z12 = g9Var.f36603e;
        ArrayList arrayList = g9Var.f36602c;
        ArrayList arrayList2 = g9Var.f36601b;
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
            StringBuilder g10 = w.f.g(str, "  ");
            g10.append(LocaleController.formatDateCallLog(message.date));
            spannableString = new SpannableString(g10.toString());
        } else {
            spannableString = new SpannableString(String.format(str.concat("  (%d) %s"), Integer.valueOf(arrayList.size()), LocaleController.formatDateCallLog(message.date)));
        }
        int i12 = g9Var.d;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        Drawable mutate = f9Var.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
                        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20917r7, false), PorterDuff.Mode.MULTIPLY));
                        spannableString.setSpan(new ImageSpan(mutate, 0), str.length(), str.length() + 1, 33);
                    }
                } else {
                    Drawable mutate2 = f9Var.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
                    mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20917r7, false), PorterDuff.Mode.MULTIPLY));
                    spannableString.setSpan(new ImageSpan(mutate2, 0), str.length(), str.length() + 1, 33);
                }
            } else {
                Drawable mutate3 = f9Var.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
                mutate3.setBounds(0, 0, mutate3.getIntrinsicWidth(), mutate3.getIntrinsicHeight());
                mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A6, false), PorterDuff.Mode.MULTIPLY));
                spannableString.setSpan(new ImageSpan(mutate3, 0), str.length(), str.length() + 1, 33);
            }
        } else {
            Drawable mutate4 = f9Var.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
            mutate4.setBounds(0, 0, mutate4.getIntrinsicWidth(), mutate4.getIntrinsicHeight());
            mutate4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A6, false), PorterDuff.Mode.MULTIPLY));
            spannableString.setSpan(new ImageSpan(mutate4, 0), str.length(), str.length() + 1, 33);
        }
        if (g9Var.f36600a != 0) {
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
            h6Var.setAllowEmojiStatus(r12);
            org.telegram.ui.Cells.h6 h6Var2 = f9Var.d;
            if (!arrayList2.isEmpty()) {
                obj2 = arrayList2.get(r12);
            } else {
                obj2 = null;
            }
            h6Var2.t(obj2, null, sb2.toString(), spannableString, false, false);
            l9Var.setVisibility(r12);
            h6Var.f22046r.clearImage();
            h6Var.f22033f = true;
            int min = Math.min(3, arrayList3.size());
            for (int i14 = 0; i14 < min; i14++) {
                l9Var.b(i14, (TLObject) arrayList3.get(i14), i11);
            }
            z11 = false;
            l9Var.a(false);
        } else {
            SpannableString spannableString2 = spannableString;
            z11 = false;
            h6Var.setAllowEmojiStatus(true);
            org.telegram.ui.Cells.h6 h6Var3 = f9Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(0);
            } else {
                obj = null;
            }
            h6Var3.t(obj, null, null, spannableString2, false, false);
            l9Var.setVisibility(8);
            h6Var.f22033f = false;
        }
        imageView.setTag(g9Var);
        imageView.setOnClickListener(onClickListener);
        boolean z13 = h51Var.f26588e;
        org.telegram.ui.Components.mp mpVar = f9Var.f36342e;
        if (mpVar == null) {
            return;
        }
        mpVar.a(z13, z11);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new f9(context, i10);
    }
}
