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

public final class d9 extends org.telegram.ui.Components.m41 {

    public static final int f37305a = 0;

    static {
        org.telegram.ui.Components.m41.setup(new d9());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.n41 n41Var, boolean z10, org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.k51 k51Var) {
        SpannableString spannableString;
        boolean z11;
        ?? r12;
        f9 f9Var = (f9) n41Var.G;
        e9 e9Var = (e9) view;
        View.OnClickListener onClickListener = n41Var.D;
        int i10 = e9Var.f37671a;
        org.telegram.ui.Components.b9 b9Var = e9Var.f37672b;
        org.telegram.ui.Cells.e6 e6Var = e9Var.d;
        ImageView imageView = e9Var.f37673c;
        boolean z12 = f9Var.f38010e;
        ArrayList arrayList = f9Var.f38009c;
        ArrayList arrayList2 = f9Var.f38008b;
        imageView.setImageResource(z12 ? R.drawable.menu_videocall : R.drawable.menu_call_create_2_24);
        TLRPC.Message message = (TLRPC.Message) arrayList.get(0);
        String str = LocaleController.isRTL ? "\u202b" : "";
        if (arrayList.size() == 1) {
            StringBuilder sbF = s3.c.f(str, "  ");
            sbF.append(LocaleController.formatDateCallLog(message.date));
            spannableString = new SpannableString(sbF.toString());
        } else {
            spannableString = new SpannableString(String.format(str.concat("  (%d) %s"), Integer.valueOf(arrayList.size()), LocaleController.formatDateCallLog(message.date)));
        }
        int i11 = f9Var.d;
        if (i11 == 0) {
            Drawable drawableMutate = e9Var.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
            drawableMutate.setBounds(0, 0, drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight());
            drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A6, false), PorterDuff.Mode.MULTIPLY));
            spannableString.setSpan(new ImageSpan(drawableMutate, 0), str.length(), str.length() + 1, 33);
        } else if (i11 == 1) {
            Drawable drawableMutate2 = e9Var.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
            drawableMutate2.setBounds(0, 0, drawableMutate2.getIntrinsicWidth(), drawableMutate2.getIntrinsicHeight());
            drawableMutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A6, false), PorterDuff.Mode.MULTIPLY));
            spannableString.setSpan(new ImageSpan(drawableMutate2, 0), str.length(), str.length() + 1, 33);
        } else if (i11 == 2) {
            Drawable drawableMutate3 = e9Var.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
            drawableMutate3.setBounds(0, 0, drawableMutate3.getIntrinsicWidth(), drawableMutate3.getIntrinsicHeight());
            drawableMutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23302r7, false), PorterDuff.Mode.MULTIPLY));
            spannableString.setSpan(new ImageSpan(drawableMutate3, 0), str.length(), str.length() + 1, 33);
        } else if (i11 == 3) {
            Drawable drawableMutate4 = e9Var.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
            drawableMutate4.setBounds(0, 0, drawableMutate4.getIntrinsicWidth(), drawableMutate4.getIntrinsicHeight());
            drawableMutate4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23302r7, false), PorterDuff.Mode.MULTIPLY));
            spannableString.setSpan(new ImageSpan(drawableMutate4, 0), str.length(), str.length() + 1, 33);
        }
        if (f9Var.f38007a != 0) {
            StringBuilder sb2 = new StringBuilder();
            for (int i12 = 0; i12 < Math.min(3, arrayList2.size()); i12++) {
                if (i12 > 0) {
                    sb2.append(", ");
                }
                sb2.append(DialogObject.getShortName((TLObject) arrayList2.get(i12)));
            }
            if (arrayList2.size() > 3) {
                sb2.append(" ");
                r12 = 0;
                sb2.append(LocaleController.formatPluralString("AndOther", arrayList2.size() - 3, new Object[0]));
            } else {
                r12 = 0;
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            arrayList3.add(UserConfig.getInstance(i10).getCurrentUser());
            e6Var.setAllowEmojiStatus(r12);
            e9Var.d.u(!arrayList2.isEmpty() ? arrayList2.get(r12) : null, null, sb2.toString(), spannableString, false, false);
            b9Var.setVisibility(r12);
            e6Var.f24286r.clearImage();
            e6Var.f24273f = true;
            int iMin = Math.min(3, arrayList3.size());
            for (int i13 = 0; i13 < iMin; i13++) {
                b9Var.b(i13, (TLObject) arrayList3.get(i13), i10);
            }
            z11 = false;
            b9Var.a(false);
        } else {
            SpannableString spannableString2 = spannableString;
            z11 = false;
            e6Var.setAllowEmojiStatus(true);
            e9Var.d.u(!arrayList2.isEmpty() ? arrayList2.get(0) : null, null, null, spannableString2, false, false);
            b9Var.setVisibility(8);
            e6Var.f24273f = false;
        }
        imageView.setTag(f9Var);
        imageView.setOnClickListener(onClickListener);
        boolean z13 = n41Var.f30838e;
        org.telegram.ui.Components.bp bpVar = e9Var.f37674e;
        if (bpVar == null) {
            return;
        }
        bpVar.a(z13, z11);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new e9(context, i10);
    }
}
