package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

public final class my extends org.telegram.ui.Components.yk0 {

    public final Context f40612c;
    public final py d;

    public my(py pyVar, Context context) {
        this.d = pyVar;
        this.f40612c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f5793f;
        return i10 == 1 || i10 == 3;
    }

    @Override
    public final int h() {
        return this.d.v;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        py pyVar = this.d;
        if (i10 == pyVar.h) {
            return 1;
        }
        return i10 == pyVar.f41449s ? 0 : 3;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        py pyVar = this.d;
        if (i11 == 0) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            if (i10 == pyVar.f41449s) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i12 = pyVar.f41450w;
                if (i12 == 0) {
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetChatsInfo));
                } else if (i12 == 1) {
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetContactsInfo));
                }
                if (SharedConfig.passcodeHash.length() > 0) {
                    spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.WidgetPasscode2)));
                }
                x8Var.setText(spannableStringBuilder);
                return;
            }
            return;
        }
        if (i11 != 1) {
            if (i11 != 3) {
                return;
            }
            org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) view;
            Long l10 = (Long) pyVar.f41445e.get(i10 - pyVar.f41447n);
            long jLongValue = l10.longValue();
            if (DialogObject.isUserDialog(jLongValue)) {
                d4Var.e(pyVar.getMessagesController().getUser(l10), null, null, i10 != pyVar.f41448r - 1);
                return;
            } else {
                d4Var.e(pyVar.getMessagesController().getChat(Long.valueOf(-jLongValue)), null, null, i10 != pyVar.f41448r - 1);
                return;
            }
        }
        org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
        l8Var.e(-1, org.telegram.ui.ActionBar.g6.q6);
        Context context = this.f40612c;
        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.N6, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(iW0, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23182k7, false), mode));
        l8Var.n(LocaleController.getString(R.string.SelectChats), new org.telegram.ui.Components.dq(drawable, drawable2), pyVar.f41447n != -1);
        l8Var.getImageView().setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.f40612c;
        if (i10 == 0) {
            org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context);
            x8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
            view = x8Var;
        } else if (i10 == 1) {
            org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(context);
            l8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
            view = l8Var;
        } else if (i10 != 2) {
            org.telegram.ui.Cells.d4 d4Var = new org.telegram.ui.Cells.d4(context, 0, 0, false);
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.list_reorder);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            d4Var.setTag(R.id.object_tag, imageView);
            d4Var.addView(imageView, h7.z5.d(40, -1.0f, (LocaleController.isRTL ? 3 : 5) | 16, 10.0f, 0.0f, 10.0f, 0.0f));
            imageView.setOnTouchListener(new lh.p1(5, this, d4Var));
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23020b9, false), PorterDuff.Mode.MULTIPLY));
            view = d4Var;
        } else {
            py pyVar = this.d;
            oy oyVar = new oy(pyVar, context);
            pyVar.f41446f = oyVar;
            view = oyVar;
        }
        return new org.telegram.ui.Components.lk0(view);
    }

    @Override
    public final void y(f2.o1 o1Var) {
        int i10 = o1Var.f5793f;
        if (i10 == 3 || i10 == 1) {
            o1Var.f5789a.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        }
    }
}
