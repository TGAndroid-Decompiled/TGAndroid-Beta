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
public final class g9 extends org.telegram.ui.Components.k61 {
    public static final int f37481a = 0;

    static {
        org.telegram.ui.Components.k61.setup(new org.telegram.ui.Components.k61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.l61 l61Var, boolean z10, org.telegram.ui.Components.a71 a71Var, org.telegram.ui.Components.i71 i71Var) {
        int i10;
        String str;
        int i11;
        boolean z11;
        SpannableString spannableString;
        int i12;
        Object obj;
        boolean z12;
        ?? r12;
        int i13;
        i9 i9Var = (i9) l61Var.G;
        h9 h9Var = (h9) view;
        View.OnClickListener onClickListener = l61Var.D;
        int i14 = h9Var.f37788a;
        org.telegram.ui.Components.i9 i9Var2 = h9Var.f37789b;
        org.telegram.ui.Cells.i6 i6Var = h9Var.d;
        ImageView imageView = h9Var.f37790c;
        boolean z13 = i9Var.e;
        ArrayList arrayList = i9Var.f38184c;
        ArrayList arrayList2 = i9Var.f38183b;
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
            StringBuilder i15 = si.o0.i(str, "  ");
            i11 = 1;
            i15.append(LocaleController.formatDateCallLog(message.date));
            spannableString = new SpannableString(i15.toString());
            z11 = false;
        } else {
            i11 = 1;
            z11 = false;
            spannableString = new SpannableString(String.format(str.concat("  (%d) %s"), Integer.valueOf(arrayList.size()), LocaleController.formatDateCallLog(message.date)));
        }
        int i16 = i9Var.d;
        if (i16 != 0) {
            if (i16 != i11) {
                if (i16 != 2) {
                    if (i16 != 3) {
                        obj = null;
                    } else {
                        Drawable mutate = h9Var.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
                        boolean z14 = z11;
                        mutate.setBounds(z14 ? 1 : 0, z14 ? 1 : 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21442r7, z14), PorterDuff.Mode.MULTIPLY));
                        spannableString.setSpan(new ImageSpan(mutate, z14 ? 1 : 0), str.length(), str.length() + 1, 33);
                    }
                } else {
                    Drawable mutate2 = h9Var.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
                    mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21442r7, false), PorterDuff.Mode.MULTIPLY));
                    spannableString.setSpan(new ImageSpan(mutate2, 0), str.length(), str.length() + 1, 33);
                }
            } else {
                if (h9Var.h == null) {
                    Drawable mutate3 = h9Var.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
                    i13 = 0;
                    mutate3.setBounds(0, 0, mutate3.getIntrinsicWidth(), mutate3.getIntrinsicHeight());
                    org.telegram.ui.ActionBar.r6.z(i6Var, mutate3, org.telegram.ui.ActionBar.k6.A6, null, PorterDuff.Mode.MULTIPLY);
                    h9Var.h = mutate3;
                } else {
                    i13 = 0;
                }
                spannableString.setSpan(new ImageSpan(h9Var.h, i13), str.length(), str.length() + 1, 33);
            }
            obj = null;
        } else {
            if (h9Var.f37791f == null) {
                Drawable mutate4 = h9Var.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
                i12 = 0;
                mutate4.setBounds(0, 0, mutate4.getIntrinsicWidth(), mutate4.getIntrinsicHeight());
                obj = null;
                org.telegram.ui.ActionBar.r6.z(i6Var, mutate4, org.telegram.ui.ActionBar.k6.A6, null, PorterDuff.Mode.MULTIPLY);
                h9Var.f37791f = mutate4;
            } else {
                i12 = 0;
                obj = null;
            }
            spannableString.setSpan(new ImageSpan(h9Var.f37791f, i12), str.length(), str.length() + 1, 33);
        }
        if (i9Var.f38182a != 0) {
            StringBuilder sb2 = new StringBuilder();
            for (int i17 = 0; i17 < Math.min(3, arrayList2.size()); i17++) {
                if (i17 > 0) {
                    sb2.append(", ");
                }
                sb2.append(DialogObject.getShortName((TLObject) arrayList2.get(i17)));
            }
            if (arrayList2.size() > 3) {
                sb2.append(" ");
                r12 = 0;
                sb2.append(LocaleController.formatPluralString("AndOther", arrayList2.size() - 3, new Object[0]));
            } else {
                r12 = 0;
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            arrayList3.add(UserConfig.getInstance(i14).getCurrentUser());
            i6Var.setAllowEmojiStatus(r12);
            org.telegram.ui.Cells.i6 i6Var2 = h9Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(r12);
            }
            i6Var2.t(obj, null, sb2.toString(), spannableString, false, false);
            i9Var2.setVisibility(r12);
            i6Var.f22526r.clearImage();
            i6Var.f22513f = true;
            int min = Math.min(3, arrayList3.size());
            for (int i18 = 0; i18 < min; i18++) {
                i9Var2.b(i18, (TLObject) arrayList3.get(i18), i14);
            }
            z12 = false;
            i9Var2.a(false);
        } else {
            SpannableString spannableString2 = spannableString;
            z12 = false;
            i6Var.setAllowEmojiStatus(true);
            org.telegram.ui.Cells.i6 i6Var3 = h9Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(0);
            }
            i6Var3.t(obj, null, null, spannableString2, false, false);
            i9Var2.setVisibility(8);
            i6Var.f22513f = false;
        }
        imageView.setTag(i9Var);
        imageView.setOnClickListener(onClickListener);
        boolean z15 = l61Var.e;
        org.telegram.ui.Components.vp vpVar = h9Var.e;
        if (vpVar == null) {
            return;
        }
        vpVar.a(z15, z12);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.lm0 lm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new h9(context, i10);
    }
}
