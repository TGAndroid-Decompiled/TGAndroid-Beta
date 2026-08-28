package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.d10;
import org.telegram.ui.f10;
public final class d10 extends org.telegram.ui.Components.vk0 {
    public final Context f37377c;
    public final f10 d;

    public d10(f10 f10Var, Context context) {
        this.d = f10Var;
        this.f37377c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    @Override
    public final int h() {
        f10 f10Var = this.d;
        ArrayList arrayList = f10Var.f38094f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(arrayList.size() / f10Var.f38105s)) + (!f10Var.J ? 1 : 0);
    }

    @Override
    public final int j(int i9) {
        f10 f10Var = this.d;
        if (i9 < ((int) Math.ceil(f10Var.f38094f.size() / f10Var.f38105s))) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        f10 f10Var = this.d;
        x00 x00Var = f10Var.O;
        ArrayList arrayList = f10Var.f38094f;
        int i10 = q1Var.f5505f;
        View view = q1Var.f5501a;
        boolean z11 = true;
        if (i10 == 0) {
            org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
            s7Var.setItemsCount(f10Var.f38105s);
            if (i9 != 0) {
                z11 = false;
            }
            s7Var.setIsFirst(z11);
            int i11 = 0;
            while (true) {
                int i12 = f10Var.f38105s;
                if (i11 < i12) {
                    int i13 = (i12 * i9) + i11;
                    if (i13 < arrayList.size()) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i13);
                        s7Var.c(i11, arrayList.indexOf(messageObject), messageObject);
                        if (f10Var.f38100k0.f()) {
                            int id2 = messageObject.getId();
                            x00Var.f44299a = messageObject.getDialogId();
                            x00Var.f44300b = id2;
                            s7Var.b(i11, f10Var.f38100k0.b(x00Var));
                        } else {
                            s7Var.b(i11, false);
                        }
                    } else {
                        s7Var.c(i11, i13, null);
                    }
                    i11++;
                } else {
                    s7Var.requestLayout();
                    return;
                }
            }
        } else if (i10 == 3) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
            if (i9 != h() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            r2Var.f25024o2 = z10;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i9);
            z11 = (r2Var.getMessage() == null || r2Var.getMessage().getId() != messageObject2.getId()) ? false : false;
            r2Var.K = f10Var.f38101l0;
            r2Var.V(messageObject2.getDialogId(), messageObject2, messageObject2.messageOwner.date, false, false);
            if (f10Var.f38100k0.f()) {
                int id3 = messageObject2.getId();
                x00Var.f44299a = messageObject2.getDialogId();
                x00Var.f44300b = id3;
                r2Var.U(f10Var.f38100k0.b(x00Var), z11);
                return;
            }
            r2Var.U(false, z11);
        } else if (i10 == 1) {
            int i14 = f10Var.f38105s;
            ((org.telegram.ui.Components.e00) view).v = i14 - ((((int) Math.ceil(arrayList.size() / f10Var.f38105s)) * i14) - arrayList.size());
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        t00 t00Var;
        t00 t00Var2;
        Context context = this.f37377c;
        if (i9 != 0) {
            if (i9 != 2) {
                t00Var2 = new t00(this, context, 1);
                t00Var2.setIsSingleCell(true);
                t00Var2.setViewType(2);
                return j3.r0.s(t00Var2, t00Var2, -1, -2);
            }
            ?? v3Var = new org.telegram.ui.Cells.v3(context, null);
            v3Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23020e7, false) & (-218103809));
            t00Var = v3Var;
        } else {
            final ?? frameLayout = new FrameLayout(context);
            Paint paint = new Paint();
            frameLayout.f25285n = paint;
            frameLayout.f25287s = UserConfig.selectedAccount;
            frameLayout.f25286r = 1;
            paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Lh, false));
            frameLayout.f25281b = new MessageObject[6];
            frameLayout.f25280a = new org.telegram.ui.Cells.o7[6];
            frameLayout.f25282c = new int[6];
            for (int i10 = 0; i10 < 6; i10++) {
                frameLayout.f25280a[i10] = new org.telegram.ui.Cells.o7(frameLayout, context);
                frameLayout.addView(frameLayout.f25280a[i10]);
                frameLayout.f25280a[i10].setVisibility(4);
                frameLayout.f25280a[i10].setTag(Integer.valueOf(i10));
                frameLayout.f25280a[i10].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 10));
                frameLayout.f25280a[i10].setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        s7 s7Var = s7.this;
                        if (s7Var.d != null) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            p7 p7Var = s7Var.d;
                            int i11 = s7Var.f25282c[intValue];
                            MessageObject messageObject = s7Var.f25281b[intValue];
                            org.telegram.ui.g gVar = (org.telegram.ui.g) p7Var;
                            f10 f10Var = ((d10) gVar.f38388b).d;
                            if (f10Var.f38100k0.f()) {
                                f10 f10Var2 = ((d10) gVar.f38388b).d;
                                SpannableStringBuilder[] spannableStringBuilderArr = f10.f38084o0;
                                f10Var2.f(i11, s7Var, messageObject, intValue);
                                return true;
                            }
                            f10.a(f10Var, messageObject, s7Var, intValue);
                            return true;
                        }
                        return false;
                    }
                });
            }
            frameLayout.setDelegate(new g(this, 17));
            t00Var = frameLayout;
        }
        t00Var2 = t00Var;
        return j3.r0.s(t00Var2, t00Var2, -1, -2);
    }
}
