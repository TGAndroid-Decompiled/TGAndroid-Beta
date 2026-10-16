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
public final class h9 extends org.telegram.ui.Components.l61 {
    public static final int f36449a = 0;

    static {
        org.telegram.ui.Components.l61.setup(new org.telegram.ui.Components.l61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.m61 m61Var, boolean z10, org.telegram.ui.Components.a71 a71Var, org.telegram.ui.Components.i71 i71Var) {
        int i10;
        String str;
        int i11;
        boolean z11;
        SpannableString spannableString;
        boolean z12;
        Object obj;
        ?? r12;
        Object obj2;
        j9 j9Var = (j9) m61Var.G;
        i9 i9Var = (i9) view;
        View.OnClickListener onClickListener = m61Var.D;
        int i12 = i9Var.f36757a;
        org.telegram.ui.Components.n9 n9Var = i9Var.f36758b;
        org.telegram.ui.Cells.i6 i6Var = i9Var.d;
        ImageView imageView = i9Var.f36759c;
        boolean z13 = j9Var.e;
        ArrayList arrayList = j9Var.f36990c;
        ArrayList arrayList2 = j9Var.f36989b;
        if (z13) {
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
            StringBuilder i13 = t8.b.i(str, "  ");
            i11 = 1;
            i13.append(LocaleController.formatDateCallLog(message.date));
            spannableString = new SpannableString(i13.toString());
            z11 = false;
        } else {
            i11 = 1;
            z11 = false;
            spannableString = new SpannableString(String.format(str.concat("  (%d) %s"), Integer.valueOf(arrayList.size()), LocaleController.formatDateCallLog(message.date)));
        }
        int i14 = j9Var.d;
        if (i14 != 0) {
            if (i14 != i11) {
                if (i14 != 2) {
                    if (i14 == 3) {
                        Drawable mutate = i9Var.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
                        boolean z14 = z11;
                        mutate.setBounds(z14 ? 1 : 0, z14 ? 1 : 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19859r7, z14), PorterDuff.Mode.MULTIPLY));
                        spannableString.setSpan(new ImageSpan(mutate, z14 ? 1 : 0), str.length(), str.length() + 1, 33);
                    }
                } else {
                    Drawable mutate2 = i9Var.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
                    mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19859r7, false), PorterDuff.Mode.MULTIPLY));
                    spannableString.setSpan(new ImageSpan(mutate2, 0), str.length(), str.length() + 1, 33);
                }
            } else {
                Drawable mutate3 = i9Var.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
                mutate3.setBounds(0, 0, mutate3.getIntrinsicWidth(), mutate3.getIntrinsicHeight());
                mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.A6, false), PorterDuff.Mode.MULTIPLY));
                spannableString.setSpan(new ImageSpan(mutate3, 0), str.length(), str.length() + 1, 33);
            }
        } else {
            Drawable mutate4 = i9Var.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
            mutate4.setBounds(0, 0, mutate4.getIntrinsicWidth(), mutate4.getIntrinsicHeight());
            mutate4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.A6, false), PorterDuff.Mode.MULTIPLY));
            spannableString.setSpan(new ImageSpan(mutate4, 0), str.length(), str.length() + 1, 33);
        }
        if (j9Var.f36988a != 0) {
            StringBuilder sb2 = new StringBuilder();
            for (int i15 = 0; i15 < Math.min(3, arrayList2.size()); i15++) {
                if (i15 > 0) {
                    sb2.append(", ");
                }
                sb2.append(DialogObject.getShortName((TLObject) arrayList2.get(i15)));
            }
            if (arrayList2.size() > 3) {
                sb2.append(" ");
                r12 = 0;
                sb2.append(LocaleController.formatPluralString("AndOther", arrayList2.size() - 3, new Object[0]));
            } else {
                r12 = 0;
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            arrayList3.add(UserConfig.getInstance(i12).getCurrentUser());
            i6Var.setAllowEmojiStatus(r12);
            org.telegram.ui.Cells.i6 i6Var2 = i9Var.d;
            if (!arrayList2.isEmpty()) {
                obj2 = arrayList2.get(r12);
            } else {
                obj2 = null;
            }
            i6Var2.u(obj2, null, sb2.toString(), spannableString, false, false);
            n9Var.setVisibility(r12);
            i6Var.f21028r.clearImage();
            i6Var.f21015f = true;
            int min = Math.min(3, arrayList3.size());
            for (int i16 = 0; i16 < min; i16++) {
                n9Var.b(i16, (TLObject) arrayList3.get(i16), i12);
            }
            z12 = false;
            n9Var.a(false);
        } else {
            SpannableString spannableString2 = spannableString;
            z12 = false;
            i6Var.setAllowEmojiStatus(true);
            org.telegram.ui.Cells.i6 i6Var3 = i9Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(0);
            } else {
                obj = null;
            }
            i6Var3.u(obj, null, null, spannableString2, false, false);
            n9Var.setVisibility(8);
            i6Var.f21015f = false;
        }
        imageView.setTag(j9Var);
        imageView.setOnClickListener(onClickListener);
        boolean z15 = m61Var.e;
        org.telegram.ui.Components.aq aqVar = i9Var.e;
        if (aqVar == null) {
            return;
        }
        aqVar.a(z15, z12);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new i9(context, i10);
    }
}
