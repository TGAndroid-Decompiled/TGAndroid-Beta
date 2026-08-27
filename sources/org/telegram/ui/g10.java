package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.g10;
import org.telegram.ui.i10;

public final class g10 extends org.telegram.ui.Components.yk0 {

    public final Context f38272c;
    public final i10 d;

    public g10(i10 i10Var, Context context) {
        this.d = i10Var;
        this.f38272c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return false;
    }

    @Override
    public final int h() {
        i10 i10Var = this.d;
        ArrayList arrayList = i10Var.f38943f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(arrayList.size() / i10Var.f38954s)) + (!i10Var.J ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        i10 i10Var = this.d;
        return i10 < ((int) Math.ceil((double) (((float) i10Var.f38943f.size()) / ((float) i10Var.f38954s)))) ? 0 : 1;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        i10 i10Var = this.d;
        a10 a10Var = i10Var.O;
        ArrayList arrayList = i10Var.f38943f;
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i11 != 0) {
            if (i11 != 3) {
                if (i11 == 1) {
                    int iCeil = (int) Math.ceil(arrayList.size() / i10Var.f38954s);
                    int i12 = i10Var.f38954s;
                    ((org.telegram.ui.Components.h00) view).v = i12 - ((iCeil * i12) - arrayList.size());
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
            p2Var.f24907o2 = i10 != h() - 1;
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            boolean z10 = p2Var.getMessage() != null && p2Var.getMessage().getId() == messageObject.getId();
            p2Var.K = i10Var.f38950l0;
            p2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            if (!i10Var.f38949k0.f()) {
                p2Var.V(false, z10);
                return;
            }
            int id2 = messageObject.getId();
            a10Var.f36332a = messageObject.getDialogId();
            a10Var.f36333b = id2;
            p2Var.V(i10Var.f38949k0.b(a10Var), z10);
            return;
        }
        org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
        p7Var.setItemsCount(i10Var.f38954s);
        p7Var.setIsFirst(i10 == 0);
        int i13 = 0;
        while (true) {
            int i14 = i10Var.f38954s;
            if (i13 >= i14) {
                p7Var.requestLayout();
                return;
            }
            int i15 = (i14 * i10) + i13;
            if (i15 < arrayList.size()) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(i15);
                p7Var.c(i13, arrayList.indexOf(messageObject2), messageObject2);
                if (i10Var.f38949k0.f()) {
                    int id3 = messageObject2.getId();
                    a10Var.f36332a = messageObject2.getDialogId();
                    a10Var.f36333b = id3;
                    p7Var.b(i13, i10Var.f38949k0.b(a10Var));
                } else {
                    p7Var.b(i13, false);
                }
            } else {
                p7Var.c(i13, i15, null);
            }
            i13++;
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        Context context = this.f38272c;
        if (i10 != 0) {
            if (i10 != 2) {
                w00 w00Var = new w00(this, context, 1);
                w00Var.setIsSingleCell(true);
                w00Var.setViewType(2);
                view2 = w00Var;
            } else {
                org.telegram.ui.Cells.s3 s3Var = new org.telegram.ui.Cells.s3(context, null);
                s3Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23073e7, false) & (-218103809));
                view = s3Var;
            }
            return org.telegram.ui.Cells.pa.l(view2, view2, -1, -2);
        }
        final org.telegram.ui.Cells.p7 p7Var = new org.telegram.ui.Cells.p7(context);
        Paint paint = new Paint();
        p7Var.f24997n = paint;
        p7Var.f24999s = UserConfig.selectedAccount;
        p7Var.f24998r = 1;
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Lh, false));
        p7Var.f24993b = new MessageObject[6];
        p7Var.f24992a = new org.telegram.ui.Cells.l7[6];
        p7Var.f24994c = new int[6];
        for (int i11 = 0; i11 < 6; i11++) {
            p7Var.f24992a[i11] = new org.telegram.ui.Cells.l7(p7Var, context);
            p7Var.addView(p7Var.f24992a[i11]);
            p7Var.f24992a[i11].setVisibility(4);
            p7Var.f24992a[i11].setTag(Integer.valueOf(i11));
            p7Var.f24992a[i11].setOnClickListener(new org.telegram.ui.Cells.a(p7Var, 10));
            p7Var.f24992a[i11].setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public final boolean onLongClick(View view3) {
                    p7 p7Var2 = p7Var;
                    if (p7Var2.d == null) {
                        return false;
                    }
                    int iIntValue = ((Integer) view3.getTag()).intValue();
                    m7 m7Var = p7Var2.d;
                    int i12 = p7Var2.f24994c[iIntValue];
                    MessageObject messageObject = p7Var2.f24993b[iIntValue];
                    org.telegram.ui.g gVar = (org.telegram.ui.g) m7Var;
                    i10 i10Var = ((g10) gVar.f38248b).d;
                    if (!i10Var.f38949k0.f()) {
                        i10.a(i10Var, messageObject, p7Var2, iIntValue);
                        return true;
                    }
                    i10 i10Var2 = ((g10) gVar.f38248b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = i10.f38933o0;
                    i10Var2.f(i12, p7Var2, messageObject, iIntValue);
                    return true;
                }
            });
        }
        p7Var.setDelegate(new g(this, 17));
        view = p7Var;
        view2 = view;
        return org.telegram.ui.Cells.pa.l(view2, view2, -1, -2);
    }
}
