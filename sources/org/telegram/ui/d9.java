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
public final class d9 extends org.telegram.ui.Components.o61 {
    public static final int f36905a = 0;

    static {
        org.telegram.ui.Components.o61.setup(new org.telegram.ui.Components.o61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.p61 p61Var, boolean z10, org.telegram.ui.Components.c71 c71Var, org.telegram.ui.Components.k71 k71Var) {
        int i10;
        String str;
        int i11;
        boolean z11;
        SpannableString spannableString;
        boolean z12;
        Object obj;
        ?? r12;
        Object obj2;
        f9 f9Var = (f9) p61Var.G;
        e9 e9Var = (e9) view;
        View.OnClickListener onClickListener = p61Var.D;
        int i12 = e9Var.f37198a;
        org.telegram.ui.Components.m9 m9Var = e9Var.f37199b;
        org.telegram.ui.Cells.i6 i6Var = e9Var.d;
        ImageView imageView = e9Var.f37200c;
        boolean z13 = f9Var.f37489e;
        ArrayList arrayList = f9Var.f37488c;
        ArrayList arrayList2 = f9Var.f37487b;
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
            StringBuilder j3 = sc.v.j(str, "  ");
            i11 = 1;
            j3.append(LocaleController.formatDateCallLog(message.date));
            spannableString = new SpannableString(j3.toString());
            z11 = false;
        } else {
            i11 = 1;
            z11 = false;
            spannableString = new SpannableString(String.format(str.concat("  (%d) %s"), Integer.valueOf(arrayList.size()), LocaleController.formatDateCallLog(message.date)));
        }
        int i13 = f9Var.d;
        if (i13 != 0) {
            if (i13 != i11) {
                if (i13 != 2) {
                    if (i13 == 3) {
                        Drawable mutate = e9Var.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
                        boolean z14 = z11;
                        mutate.setBounds(z14 ? 1 : 0, z14 ? 1 : 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21056r7, z14), PorterDuff.Mode.MULTIPLY));
                        spannableString.setSpan(new ImageSpan(mutate, z14 ? 1 : 0), str.length(), str.length() + 1, 33);
                    }
                } else {
                    Drawable mutate2 = e9Var.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
                    mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21056r7, false), PorterDuff.Mode.MULTIPLY));
                    spannableString.setSpan(new ImageSpan(mutate2, 0), str.length(), str.length() + 1, 33);
                }
            } else {
                Drawable mutate3 = e9Var.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
                mutate3.setBounds(0, 0, mutate3.getIntrinsicWidth(), mutate3.getIntrinsicHeight());
                mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.A6, false), PorterDuff.Mode.MULTIPLY));
                spannableString.setSpan(new ImageSpan(mutate3, 0), str.length(), str.length() + 1, 33);
            }
        } else {
            Drawable mutate4 = e9Var.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
            mutate4.setBounds(0, 0, mutate4.getIntrinsicWidth(), mutate4.getIntrinsicHeight());
            mutate4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.A6, false), PorterDuff.Mode.MULTIPLY));
            spannableString.setSpan(new ImageSpan(mutate4, 0), str.length(), str.length() + 1, 33);
        }
        if (f9Var.f37486a != 0) {
            StringBuilder sb2 = new StringBuilder();
            for (int i14 = 0; i14 < Math.min(3, arrayList2.size()); i14++) {
                if (i14 > 0) {
                    sb2.append(", ");
                }
                sb2.append(DialogObject.getShortName((TLObject) arrayList2.get(i14)));
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
            org.telegram.ui.Cells.i6 i6Var2 = e9Var.d;
            if (!arrayList2.isEmpty()) {
                obj2 = arrayList2.get(r12);
            } else {
                obj2 = null;
            }
            i6Var2.u(obj2, null, sb2.toString(), spannableString, false, false);
            m9Var.setVisibility(r12);
            i6Var.f22261r.clearImage();
            i6Var.f22248f = true;
            int min = Math.min(3, arrayList3.size());
            for (int i15 = 0; i15 < min; i15++) {
                m9Var.b(i15, (TLObject) arrayList3.get(i15), i12);
            }
            z12 = false;
            m9Var.a(false);
        } else {
            SpannableString spannableString2 = spannableString;
            z12 = false;
            i6Var.setAllowEmojiStatus(true);
            org.telegram.ui.Cells.i6 i6Var3 = e9Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(0);
            } else {
                obj = null;
            }
            i6Var3.u(obj, null, null, spannableString2, false, false);
            m9Var.setVisibility(8);
            i6Var.f22248f = false;
        }
        imageView.setTag(f9Var);
        imageView.setOnClickListener(onClickListener);
        boolean z15 = p61Var.f29728e;
        org.telegram.ui.Components.dq dqVar = e9Var.f37201e;
        if (dqVar == null) {
            return;
        }
        dqVar.a(z15, z12);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new e9(context, i10);
    }
}
