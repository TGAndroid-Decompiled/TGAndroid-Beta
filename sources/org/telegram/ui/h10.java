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
import org.telegram.ui.h10;
import org.telegram.ui.j10;
public final class h10 extends org.telegram.ui.Components.mm0 {
    public final Context f39747c;
    public final j10 d;

    public h10(j10 j10Var, Context context) {
        this.d = j10Var;
        this.f39747c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    @Override
    public final int h() {
        j10 j10Var = this.d;
        ArrayList arrayList = j10Var.f40328f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(arrayList.size() / j10Var.f40343s)) + (!j10Var.N ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        j10 j10Var = this.d;
        if (i10 < ((int) Math.ceil(j10Var.f40328f.size() / j10Var.f40343s))) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        boolean z11;
        j10 j10Var = this.d;
        b10 b10Var = j10Var.S;
        ArrayList arrayList = j10Var.f40328f;
        int i11 = e1Var.f47776f;
        View view = e1Var.f47773a;
        boolean z12 = true;
        if (i11 == 0) {
            org.telegram.ui.Cells.x7 x7Var = (org.telegram.ui.Cells.x7) view;
            x7Var.setItemsCount(j10Var.f40343s);
            if (i10 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            x7Var.setIsFirst(z11);
            int i12 = 0;
            while (true) {
                int i13 = j10Var.f40343s;
                if (i12 < i13) {
                    int i14 = (i13 * i10) + i12;
                    if (i14 < arrayList.size()) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i14);
                        x7Var.c(messageObject, i12, arrayList.indexOf(messageObject));
                        if (j10Var.f40338o0.g()) {
                            int id2 = messageObject.getId();
                            b10Var.f37862a = messageObject.getDialogId();
                            b10Var.f37863b = id2;
                            x7Var.b(i12, j10Var.f40338o0.c(b10Var), true);
                        } else {
                            x7Var.b(i12, false, true);
                        }
                    } else {
                        x7Var.c(null, i12, i14);
                    }
                    i12++;
                } else {
                    x7Var.requestLayout();
                    return;
                }
            }
        } else if (i11 == 3) {
            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
            if (i10 != h() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            p2Var.f24723s2 = z10;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10);
            if (p2Var.getMessage() == null || p2Var.getMessage().getId() != messageObject2.getId()) {
                z12 = false;
            }
            p2Var.O = j10Var.f40339p0;
            p2Var.V(messageObject2.getDialogId(), messageObject2, messageObject2.messageOwner.date, false, false);
            if (j10Var.f40338o0.g()) {
                int id3 = messageObject2.getId();
                b10Var.f37862a = messageObject2.getDialogId();
                b10Var.f37863b = id3;
                p2Var.U(j10Var.f40338o0.c(b10Var), z12);
                return;
            }
            p2Var.U(false, z12);
        } else if (i11 == 1) {
            int i15 = j10Var.f40343s;
            ((org.telegram.ui.Components.c10) view).v = i15 - ((((int) Math.ceil(arrayList.size() / j10Var.f40343s)) * i15) - arrayList.size());
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        w00 w00Var;
        w00 w00Var2;
        Context context = this.f39747c;
        if (i10 != 0) {
            if (i10 != 2) {
                w00Var2 = new w00(this, context, 1);
                w00Var2.setIsSingleCell(true);
                w00Var2.setViewType(2);
                return ic.a.n(w00Var2, w00Var2, -1, -2);
            }
            ?? z3Var = new org.telegram.ui.Cells.z3(context, null);
            z3Var.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23377e7, false) & (-218103809));
            w00Var = z3Var;
        } else {
            final ?? frameLayout = new FrameLayout(context);
            Paint paint = new Paint();
            frameLayout.f25725n = paint;
            frameLayout.f25727s = UserConfig.selectedAccount;
            frameLayout.f25726r = 1;
            paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Lh, false));
            frameLayout.f25722b = new MessageObject[6];
            frameLayout.f25721a = new org.telegram.ui.Cells.t7[6];
            frameLayout.f25723c = new int[6];
            for (int i11 = 0; i11 < 6; i11++) {
                frameLayout.f25721a[i11] = new org.telegram.ui.Cells.t7(frameLayout, context);
                frameLayout.addView(frameLayout.f25721a[i11]);
                frameLayout.f25721a[i11].setVisibility(4);
                frameLayout.f25721a[i11].setTag(Integer.valueOf(i11));
                frameLayout.f25721a[i11].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 10));
                frameLayout.f25721a[i11].setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        x7 x7Var = x7.this;
                        if (x7Var.d != null) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            u7 u7Var = x7Var.d;
                            int i12 = x7Var.f25723c[intValue];
                            MessageObject messageObject = x7Var.f25722b[intValue];
                            org.telegram.ui.f fVar = (org.telegram.ui.f) u7Var;
                            j10 j10Var = ((h10) fVar.f39115b).d;
                            if (j10Var.f40338o0.g()) {
                                j10 j10Var2 = ((h10) fVar.f39115b).d;
                                SpannableStringBuilder[] spannableStringBuilderArr = j10.f40319s0;
                                j10Var2.f(i12, x7Var, messageObject, intValue);
                                return true;
                            }
                            j10.a(j10Var, messageObject, x7Var, intValue);
                            return true;
                        }
                        return false;
                    }
                });
            }
            frameLayout.setDelegate(new f(this, 17));
            w00Var = frameLayout;
        }
        w00Var2 = w00Var;
        return ic.a.n(w00Var2, w00Var2, -1, -2);
    }
}
