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
public final class i9 extends org.telegram.ui.Components.t61 {
    public static final int f40068a = 0;

    static {
        org.telegram.ui.Components.t61.setup(new org.telegram.ui.Components.t61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.u61 u61Var, boolean z10, org.telegram.ui.Components.k71 k71Var, org.telegram.ui.Components.s71 s71Var) {
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
        k9 k9Var = (k9) u61Var.G;
        j9 j9Var = (j9) view;
        View.OnClickListener onClickListener = u61Var.D;
        int i14 = j9Var.f40468a;
        org.telegram.ui.Components.m9 m9Var = j9Var.f40469b;
        org.telegram.ui.Cells.m6 m6Var = j9Var.d;
        ImageView imageView = j9Var.f40470c;
        boolean z13 = k9Var.e;
        ArrayList arrayList = k9Var.f40694c;
        ArrayList arrayList2 = k9Var.f40693b;
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
            StringBuilder l4 = org.telegram.ui.Components.b10.l(str, "  ");
            i11 = 1;
            l4.append(LocaleController.formatDateCallLog(message.date));
            spannableString = new SpannableString(l4.toString());
            z11 = false;
        } else {
            i11 = 1;
            z11 = false;
            spannableString = new SpannableString(String.format(str.concat("  (%d) %s"), Integer.valueOf(arrayList.size()), LocaleController.formatDateCallLog(message.date)));
        }
        int i15 = k9Var.d;
        if (i15 != 0) {
            if (i15 != i11) {
                if (i15 != 2) {
                    if (i15 != 3) {
                        obj = null;
                    } else {
                        Drawable mutate = j9Var.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
                        boolean z14 = z11;
                        mutate.setBounds(z14 ? 1 : 0, z14 ? 1 : 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23616r7, z14), PorterDuff.Mode.MULTIPLY));
                        spannableString.setSpan(new ImageSpan(mutate, z14 ? 1 : 0), str.length(), str.length() + 1, 33);
                    }
                } else {
                    Drawable mutate2 = j9Var.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
                    mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23616r7, false), PorterDuff.Mode.MULTIPLY));
                    spannableString.setSpan(new ImageSpan(mutate2, 0), str.length(), str.length() + 1, 33);
                }
            } else {
                if (j9Var.h == null) {
                    Drawable mutate3 = j9Var.getContext().getResources().getDrawable(R.drawable.mini_call_in_16).mutate();
                    i13 = 0;
                    mutate3.setBounds(0, 0, mutate3.getIntrinsicWidth(), mutate3.getIntrinsicHeight());
                    org.telegram.ui.ActionBar.f7.y(m6Var, mutate3, org.telegram.ui.ActionBar.y6.A6, null, PorterDuff.Mode.MULTIPLY);
                    j9Var.h = mutate3;
                } else {
                    i13 = 0;
                }
                spannableString.setSpan(new ImageSpan(j9Var.h, i13), str.length(), str.length() + 1, 33);
            }
            obj = null;
        } else {
            if (j9Var.f40471f == null) {
                Drawable mutate4 = j9Var.getContext().getResources().getDrawable(R.drawable.mini_call_out_16).mutate();
                i12 = 0;
                mutate4.setBounds(0, 0, mutate4.getIntrinsicWidth(), mutate4.getIntrinsicHeight());
                obj = null;
                org.telegram.ui.ActionBar.f7.y(m6Var, mutate4, org.telegram.ui.ActionBar.y6.A6, null, PorterDuff.Mode.MULTIPLY);
                j9Var.f40471f = mutate4;
            } else {
                i12 = 0;
                obj = null;
            }
            spannableString.setSpan(new ImageSpan(j9Var.f40471f, i12), str.length(), str.length() + 1, 33);
        }
        if (k9Var.f40692a != 0) {
            StringBuilder sb2 = new StringBuilder();
            for (int i16 = 0; i16 < Math.min(3, arrayList2.size()); i16++) {
                if (i16 > 0) {
                    sb2.append(", ");
                }
                sb2.append(DialogObject.getShortName((TLObject) arrayList2.get(i16)));
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
            m6Var.setAllowEmojiStatus(r12);
            org.telegram.ui.Cells.m6 m6Var2 = j9Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(r12);
            }
            m6Var2.s(obj, null, sb2.toString(), spannableString, false, false);
            m9Var.setVisibility(r12);
            m6Var.f24472r.clearImage();
            m6Var.f24459f = true;
            int min = Math.min(3, arrayList3.size());
            for (int i17 = 0; i17 < min; i17++) {
                m9Var.b(i17, (TLObject) arrayList3.get(i17), i14);
            }
            z12 = false;
            m9Var.a(false);
        } else {
            SpannableString spannableString2 = spannableString;
            z12 = false;
            m6Var.setAllowEmojiStatus(true);
            org.telegram.ui.Cells.m6 m6Var3 = j9Var.d;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(0);
            }
            m6Var3.s(obj, null, null, spannableString2, false, false);
            m9Var.setVisibility(8);
            m6Var.f24459f = false;
        }
        imageView.setTag(k9Var);
        imageView.setOnClickListener(onClickListener);
        boolean z15 = u61Var.e;
        org.telegram.ui.Components.aq aqVar = j9Var.e;
        if (aqVar == null) {
            return;
        }
        aqVar.a(z15, z12);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new j9(context, i10);
    }
}
