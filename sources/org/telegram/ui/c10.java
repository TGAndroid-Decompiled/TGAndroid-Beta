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
import org.telegram.ui.c10;
import org.telegram.ui.e10;
public final class c10 extends org.telegram.ui.Components.im0 {
    public final Context f35785c;
    public final e10 d;

    public c10(e10 e10Var, Context context) {
        this.d = e10Var;
        this.f35785c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override
    public final int h() {
        e10 e10Var = this.d;
        ArrayList arrayList = e10Var.f36499f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(arrayList.size() / e10Var.f36514s)) + (!e10Var.N ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        e10 e10Var = this.d;
        if (i10 < ((int) Math.ceil(e10Var.f36499f.size() / e10Var.f36514s))) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        e10 e10Var = this.d;
        w00 w00Var = e10Var.S;
        ArrayList arrayList = e10Var.f36499f;
        int i11 = b1Var.f45920f;
        View view = b1Var.f45917a;
        boolean z11 = true;
        if (i11 == 0) {
            org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
            t7Var.setItemsCount(e10Var.f36514s);
            if (i10 != 0) {
                z11 = false;
            }
            t7Var.setIsFirst(z11);
            int i12 = 0;
            while (true) {
                int i13 = e10Var.f36514s;
                if (i12 < i13) {
                    int i14 = (i13 * i10) + i12;
                    if (i14 < arrayList.size()) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i14);
                        t7Var.c(messageObject, i12, arrayList.indexOf(messageObject));
                        if (e10Var.f36509o0.g()) {
                            int id2 = messageObject.getId();
                            w00Var.f42425a = messageObject.getDialogId();
                            w00Var.f42426b = id2;
                            t7Var.b(i12, e10Var.f36509o0.b(w00Var));
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
            r2Var.f22897s2 = z10;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10);
            if (r2Var.getMessage() == null || r2Var.getMessage().getId() != messageObject2.getId()) {
                z11 = false;
            }
            r2Var.O = e10Var.f36510p0;
            r2Var.W(messageObject2.getDialogId(), messageObject2, messageObject2.messageOwner.date, false, false);
            if (e10Var.f36509o0.g()) {
                int id3 = messageObject2.getId();
                w00Var.f42425a = messageObject2.getDialogId();
                w00Var.f42426b = id3;
                r2Var.V(e10Var.f36509o0.b(w00Var), z11);
                return;
            }
            r2Var.V(false, z11);
        } else if (i11 == 1) {
            int i15 = e10Var.f36514s;
            ((org.telegram.ui.Components.b10) view).v = i15 - ((((int) Math.ceil(arrayList.size() / e10Var.f36514s)) * i15) - arrayList.size());
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        s00 s00Var;
        s00 s00Var2;
        Context context = this.f35785c;
        if (i10 != 0) {
            if (i10 != 2) {
                s00Var2 = new s00(this, context, 1);
                s00Var2.setIsSingleCell(true);
                s00Var2.setViewType(2);
                return com.google.android.gms.internal.play_billing.k3.l(s00Var2, s00Var2, -1, -2);
            }
            ?? u3Var = new org.telegram.ui.Cells.u3(context, null);
            u3Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.e7, false) & (-218103809));
            s00Var = u3Var;
        } else {
            final ?? frameLayout = new FrameLayout(context);
            Paint paint = new Paint();
            frameLayout.f23204n = paint;
            frameLayout.f23206s = UserConfig.selectedAccount;
            frameLayout.f23205r = 1;
            paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Lh, false));
            frameLayout.f23201b = new MessageObject[6];
            frameLayout.f23200a = new org.telegram.ui.Cells.p7[6];
            frameLayout.f23202c = new int[6];
            for (int i11 = 0; i11 < 6; i11++) {
                frameLayout.f23200a[i11] = new org.telegram.ui.Cells.p7(frameLayout, context);
                frameLayout.addView(frameLayout.f23200a[i11]);
                frameLayout.f23200a[i11].setVisibility(4);
                frameLayout.f23200a[i11].setTag(Integer.valueOf(i11));
                frameLayout.f23200a[i11].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 10));
                frameLayout.f23200a[i11].setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        t7 t7Var = t7.this;
                        if (t7Var.d != null) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            q7 q7Var = t7Var.d;
                            int i12 = t7Var.f23202c[intValue];
                            MessageObject messageObject = t7Var.f23201b[intValue];
                            org.telegram.ui.g gVar = (org.telegram.ui.g) q7Var;
                            e10 e10Var = ((c10) gVar.f37149b).d;
                            if (e10Var.f36509o0.g()) {
                                e10 e10Var2 = ((c10) gVar.f37149b).d;
                                SpannableStringBuilder[] spannableStringBuilderArr = e10.f36490s0;
                                e10Var2.f(i12, t7Var, messageObject, intValue);
                                return true;
                            }
                            e10.a(e10Var, messageObject, t7Var, intValue);
                            return true;
                        }
                        return false;
                    }
                });
            }
            frameLayout.setDelegate(new g(this, 17));
            s00Var = frameLayout;
        }
        s00Var2 = s00Var;
        return com.google.android.gms.internal.play_billing.k3.l(s00Var2, s00Var2, -1, -2);
    }
}
