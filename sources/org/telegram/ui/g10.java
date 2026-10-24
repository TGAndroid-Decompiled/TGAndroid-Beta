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
import org.telegram.ui.g10;
import org.telegram.ui.i10;
public final class g10 extends org.telegram.ui.Components.km0 {
    public final Context f37418c;
    public final i10 d;

    public g10(i10 i10Var, Context context) {
        this.d = i10Var;
        this.f37418c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override
    public final int h() {
        i10 i10Var = this.d;
        ArrayList arrayList = i10Var.f38101f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(arrayList.size() / i10Var.f38116s)) + (!i10Var.N ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        i10 i10Var = this.d;
        if (i10 < ((int) Math.ceil(i10Var.f38101f.size() / i10Var.f38116s))) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        boolean z11;
        i10 i10Var = this.d;
        a10 a10Var = i10Var.S;
        ArrayList arrayList = i10Var.f38101f;
        int i11 = b1Var.f46345f;
        View view = b1Var.f46342a;
        boolean z12 = true;
        if (i11 == 0) {
            org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
            t7Var.setItemsCount(i10Var.f38116s);
            if (i10 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            t7Var.setIsFirst(z11);
            int i12 = 0;
            while (true) {
                int i13 = i10Var.f38116s;
                if (i12 < i13) {
                    int i14 = (i13 * i10) + i12;
                    if (i14 < arrayList.size()) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i14);
                        t7Var.c(messageObject, i12, arrayList.indexOf(messageObject));
                        if (i10Var.f38111o0.g()) {
                            int id2 = messageObject.getId();
                            a10Var.f35547a = messageObject.getDialogId();
                            a10Var.f35548b = id2;
                            t7Var.b(i12, i10Var.f38111o0.b(a10Var), true);
                        } else {
                            t7Var.b(i12, false, true);
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
            org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) view;
            if (i10 != h() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            q2Var.f23011s2 = z10;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10);
            if (q2Var.getMessage() == null || q2Var.getMessage().getId() != messageObject2.getId()) {
                z12 = false;
            }
            q2Var.O = i10Var.f38112p0;
            q2Var.V(messageObject2.getDialogId(), messageObject2, messageObject2.messageOwner.date, false, false);
            if (i10Var.f38111o0.g()) {
                int id3 = messageObject2.getId();
                a10Var.f35547a = messageObject2.getDialogId();
                a10Var.f35548b = id3;
                q2Var.U(i10Var.f38111o0.b(a10Var), z12);
                return;
            }
            q2Var.U(false, z12);
        } else if (i11 == 1) {
            int i15 = i10Var.f38116s;
            ((org.telegram.ui.Components.z00) view).v = i15 - ((((int) Math.ceil(arrayList.size() / i10Var.f38116s)) * i15) - arrayList.size());
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        v00 v00Var;
        v00 v00Var2;
        Context context = this.f37418c;
        if (i10 != 0) {
            if (i10 != 2) {
                v00Var2 = new v00(this, context, 1);
                v00Var2.setIsSingleCell(true);
                v00Var2.setViewType(2);
                return com.google.android.gms.internal.play_billing.k3.l(v00Var2, v00Var2, -1, -2);
            }
            ?? u3Var = new org.telegram.ui.Cells.u3(context, null);
            u3Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.e7, false) & (-218103809));
            v00Var = u3Var;
        } else {
            final ?? frameLayout = new FrameLayout(context);
            Paint paint = new Paint();
            frameLayout.f23709n = paint;
            frameLayout.f23711s = UserConfig.selectedAccount;
            frameLayout.f23710r = 1;
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Lh, false));
            frameLayout.f23706b = new MessageObject[6];
            frameLayout.f23705a = new org.telegram.ui.Cells.p7[6];
            frameLayout.f23707c = new int[6];
            for (int i11 = 0; i11 < 6; i11++) {
                frameLayout.f23705a[i11] = new org.telegram.ui.Cells.p7(frameLayout, context);
                frameLayout.addView(frameLayout.f23705a[i11]);
                frameLayout.f23705a[i11].setVisibility(4);
                frameLayout.f23705a[i11].setTag(Integer.valueOf(i11));
                frameLayout.f23705a[i11].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 10));
                frameLayout.f23705a[i11].setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        t7 t7Var = t7.this;
                        if (t7Var.d != null) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            q7 q7Var = t7Var.d;
                            int i12 = t7Var.f23707c[intValue];
                            MessageObject messageObject = t7Var.f23706b[intValue];
                            org.telegram.ui.f fVar = (org.telegram.ui.f) q7Var;
                            i10 i10Var = ((g10) fVar.f37153b).d;
                            if (i10Var.f38111o0.g()) {
                                i10 i10Var2 = ((g10) fVar.f37153b).d;
                                SpannableStringBuilder[] spannableStringBuilderArr = i10.f38092s0;
                                i10Var2.f(i12, t7Var, messageObject, intValue);
                                return true;
                            }
                            i10.a(i10Var, messageObject, t7Var, intValue);
                            return true;
                        }
                        return false;
                    }
                });
            }
            frameLayout.setDelegate(new f(this, 17));
            v00Var = frameLayout;
        }
        v00Var2 = v00Var;
        return com.google.android.gms.internal.play_billing.k3.l(v00Var2, v00Var2, -1, -2);
    }
}
