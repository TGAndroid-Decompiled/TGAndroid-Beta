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
import org.telegram.ui.e10;
import org.telegram.ui.g10;
public final class e10 extends org.telegram.ui.Components.hm0 {
    public final Context f36368c;
    public final g10 d;

    public e10(g10 g10Var, Context context) {
        this.d = g10Var;
        this.f36368c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override
    public final int h() {
        g10 g10Var = this.d;
        ArrayList arrayList = g10Var.f37089f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(arrayList.size() / g10Var.f37104s)) + (!g10Var.N ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        g10 g10Var = this.d;
        if (i10 < ((int) Math.ceil(g10Var.f37089f.size() / g10Var.f37104s))) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        g10 g10Var = this.d;
        y00 y00Var = g10Var.S;
        ArrayList arrayList = g10Var.f37089f;
        int i11 = b1Var.f45941f;
        View view = b1Var.f45938a;
        boolean z11 = true;
        if (i11 == 0) {
            org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
            t7Var.setItemsCount(g10Var.f37104s);
            if (i10 != 0) {
                z11 = false;
            }
            t7Var.setIsFirst(z11);
            int i12 = 0;
            while (true) {
                int i13 = g10Var.f37104s;
                if (i12 < i13) {
                    int i14 = (i13 * i10) + i12;
                    if (i14 < arrayList.size()) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i14);
                        t7Var.c(messageObject, i12, arrayList.indexOf(messageObject));
                        if (g10Var.f37099o0.g()) {
                            int id2 = messageObject.getId();
                            y00Var.f43301a = messageObject.getDialogId();
                            y00Var.f43302b = id2;
                            t7Var.b(i12, g10Var.f37099o0.b(y00Var));
                        } else {
                            t7Var.b(i12, false);
                        }
                    } else {
                        t7Var.c(null, i12, i14);
                    }
                    i12++;
                } else {
                    t7Var.requestLayout();
                    return;
                }
            }
        } else if (i11 == 3) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
            if (i10 != h() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            r2Var.f22896s2 = z10;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10);
            if (r2Var.getMessage() == null || r2Var.getMessage().getId() != messageObject2.getId()) {
                z11 = false;
            }
            r2Var.O = g10Var.f37100p0;
            r2Var.W(messageObject2.getDialogId(), messageObject2, messageObject2.messageOwner.date, false, false);
            if (g10Var.f37099o0.g()) {
                int id3 = messageObject2.getId();
                y00Var.f43301a = messageObject2.getDialogId();
                y00Var.f43302b = id3;
                r2Var.V(g10Var.f37099o0.b(y00Var), z11);
                return;
            }
            r2Var.V(false, z11);
        } else if (i11 == 1) {
            int i15 = g10Var.f37104s;
            ((org.telegram.ui.Components.b10) view).v = i15 - ((((int) Math.ceil(arrayList.size() / g10Var.f37104s)) * i15) - arrayList.size());
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        u00 u00Var;
        u00 u00Var2;
        Context context = this.f36368c;
        if (i10 != 0) {
            if (i10 != 2) {
                u00Var2 = new u00(this, context, 1);
                u00Var2.setIsSingleCell(true);
                u00Var2.setViewType(2);
                return com.google.android.gms.internal.cast.a6.l(u00Var2, u00Var2, -1, -2);
            }
            ?? u3Var = new org.telegram.ui.Cells.u3(context, null);
            u3Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.e7, false) & (-218103809));
            u00Var = u3Var;
        } else {
            final ?? frameLayout = new FrameLayout(context);
            Paint paint = new Paint();
            frameLayout.f23203n = paint;
            frameLayout.f23205s = UserConfig.selectedAccount;
            frameLayout.f23204r = 1;
            paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Lh, false));
            frameLayout.f23200b = new MessageObject[6];
            frameLayout.f23199a = new org.telegram.ui.Cells.p7[6];
            frameLayout.f23201c = new int[6];
            for (int i11 = 0; i11 < 6; i11++) {
                frameLayout.f23199a[i11] = new org.telegram.ui.Cells.p7(frameLayout, context);
                frameLayout.addView(frameLayout.f23199a[i11]);
                frameLayout.f23199a[i11].setVisibility(4);
                frameLayout.f23199a[i11].setTag(Integer.valueOf(i11));
                frameLayout.f23199a[i11].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 10));
                frameLayout.f23199a[i11].setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        t7 t7Var = t7.this;
                        if (t7Var.d != null) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            q7 q7Var = t7Var.d;
                            int i12 = t7Var.f23201c[intValue];
                            MessageObject messageObject = t7Var.f23200b[intValue];
                            org.telegram.ui.g gVar = (org.telegram.ui.g) q7Var;
                            g10 g10Var = ((e10) gVar.f37062b).d;
                            if (g10Var.f37099o0.g()) {
                                g10 g10Var2 = ((e10) gVar.f37062b).d;
                                SpannableStringBuilder[] spannableStringBuilderArr = g10.f37080s0;
                                g10Var2.f(i12, t7Var, messageObject, intValue);
                                return true;
                            }
                            g10.a(g10Var, messageObject, t7Var, intValue);
                            return true;
                        }
                        return false;
                    }
                });
            }
            frameLayout.setDelegate(new g(this, 17));
            u00Var = frameLayout;
        }
        u00Var2 = u00Var;
        return com.google.android.gms.internal.cast.a6.l(u00Var2, u00Var2, -1, -2);
    }
}
