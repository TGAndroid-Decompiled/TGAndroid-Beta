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
import org.telegram.ui.a20;
import org.telegram.ui.c20;
public final class a20 extends org.telegram.ui.Components.lm0 {
    public final Context f34024c;
    public final c20 d;

    public a20(c20 c20Var, Context context) {
        this.d = c20Var;
        this.f34024c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override
    public final int h() {
        c20 c20Var = this.d;
        ArrayList arrayList = c20Var.f34687f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(arrayList.size() / c20Var.f34702s)) + (!c20Var.N ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        c20 c20Var = this.d;
        if (i10 < ((int) Math.ceil(c20Var.f34687f.size() / c20Var.f34702s))) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        c20 c20Var = this.d;
        u10 u10Var = c20Var.S;
        ArrayList arrayList = c20Var.f34687f;
        int i11 = b1Var.f44841f;
        View view = b1Var.f44838a;
        boolean z11 = true;
        if (i11 == 0) {
            org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
            u7Var.setItemsCount(c20Var.f34702s);
            if (i10 != 0) {
                z11 = false;
            }
            u7Var.setIsFirst(z11);
            int i12 = 0;
            while (true) {
                int i13 = c20Var.f34702s;
                if (i12 < i13) {
                    int i14 = (i13 * i10) + i12;
                    if (i14 < arrayList.size()) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i14);
                        u7Var.c(i12, arrayList.indexOf(messageObject), messageObject);
                        if (c20Var.f34697o0.g()) {
                            int id2 = messageObject.getId();
                            u10Var.f40516a = messageObject.getDialogId();
                            u10Var.f40517b = id2;
                            u7Var.b(i12, c20Var.f34697o0.b(u10Var));
                        } else {
                            u7Var.b(i12, false);
                        }
                    } else {
                        u7Var.c(i12, i14, null);
                    }
                    i12++;
                } else {
                    u7Var.requestLayout();
                    return;
                }
            }
        } else if (i11 == 3) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
            if (i10 != h() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            s2Var.f21895s2 = z10;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10);
            if (s2Var.getMessage() == null || s2Var.getMessage().getId() != messageObject2.getId()) {
                z11 = false;
            }
            s2Var.O = c20Var.f34698p0;
            s2Var.W(messageObject2.getDialogId(), messageObject2, messageObject2.messageOwner.date, false, false);
            if (c20Var.f34697o0.g()) {
                int id3 = messageObject2.getId();
                u10Var.f40516a = messageObject2.getDialogId();
                u10Var.f40517b = id3;
                s2Var.V(c20Var.f34697o0.b(u10Var), z11);
                return;
            }
            s2Var.V(false, z11);
        } else if (i11 == 1) {
            int i15 = c20Var.f34702s;
            ((org.telegram.ui.Components.f10) view).v = i15 - ((((int) Math.ceil(arrayList.size() / c20Var.f34702s)) * i15) - arrayList.size());
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        q10 q10Var;
        q10 q10Var2;
        Context context = this.f34024c;
        if (i10 != 0) {
            if (i10 != 2) {
                q10Var2 = new q10(this, context, 1);
                q10Var2.setIsSingleCell(true);
                q10Var2.setViewType(2);
                return com.google.android.gms.internal.play_billing.k3.l(q10Var2, q10Var2, -1, -2);
            }
            ?? v3Var = new org.telegram.ui.Cells.v3(context, null);
            v3Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.e7, false) & (-218103809));
            q10Var = v3Var;
        } else {
            final ?? frameLayout = new FrameLayout(context);
            Paint paint = new Paint();
            frameLayout.f22539n = paint;
            frameLayout.f22541s = UserConfig.selectedAccount;
            frameLayout.f22540r = 1;
            paint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Lh, false));
            frameLayout.f22536b = new MessageObject[6];
            frameLayout.f22535a = new org.telegram.ui.Cells.q7[6];
            frameLayout.f22537c = new int[6];
            for (int i11 = 0; i11 < 6; i11++) {
                frameLayout.f22535a[i11] = new org.telegram.ui.Cells.q7(frameLayout, context);
                frameLayout.addView(frameLayout.f22535a[i11]);
                frameLayout.f22535a[i11].setVisibility(4);
                frameLayout.f22535a[i11].setTag(Integer.valueOf(i11));
                frameLayout.f22535a[i11].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 10));
                frameLayout.f22535a[i11].setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        u7 u7Var = u7.this;
                        if (u7Var.d != null) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            r7 r7Var = u7Var.d;
                            int i12 = u7Var.f22537c[intValue];
                            MessageObject messageObject = u7Var.f22536b[intValue];
                            org.telegram.ui.g gVar = (org.telegram.ui.g) r7Var;
                            c20 c20Var = ((a20) gVar.f36263b).d;
                            if (c20Var.f34697o0.g()) {
                                c20 c20Var2 = ((a20) gVar.f36263b).d;
                                SpannableStringBuilder[] spannableStringBuilderArr = c20.f34678s0;
                                c20Var2.f(i12, u7Var, messageObject, intValue);
                                return true;
                            }
                            c20.a(c20Var, messageObject, u7Var, intValue);
                            return true;
                        }
                        return false;
                    }
                });
            }
            frameLayout.setDelegate(new g(this, 17));
            q10Var = frameLayout;
        }
        q10Var2 = q10Var;
        return com.google.android.gms.internal.play_billing.k3.l(q10Var2, q10Var2, -1, -2);
    }
}
