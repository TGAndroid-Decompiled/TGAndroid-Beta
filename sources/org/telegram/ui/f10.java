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
import org.telegram.ui.f10;
import org.telegram.ui.h10;
public final class f10 extends org.telegram.ui.Components.lm0 {
    public final Context f39237c;
    public final h10 d;

    public f10(h10 h10Var, Context context) {
        this.d = h10Var;
        this.f39237c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    @Override
    public final int h() {
        h10 h10Var = this.d;
        ArrayList arrayList = h10Var.f39834f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(arrayList.size() / h10Var.f39849s)) + (!h10Var.N ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        h10 h10Var = this.d;
        if (i10 < ((int) Math.ceil(h10Var.f39834f.size() / h10Var.f39849s))) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        boolean z11;
        h10 h10Var = this.d;
        z00 z00Var = h10Var.S;
        ArrayList arrayList = h10Var.f39834f;
        int i11 = e1Var.f47741f;
        View view = e1Var.f47738a;
        boolean z12 = true;
        if (i11 == 0) {
            org.telegram.ui.Cells.x7 x7Var = (org.telegram.ui.Cells.x7) view;
            x7Var.setItemsCount(h10Var.f39849s);
            if (i10 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            x7Var.setIsFirst(z11);
            int i12 = 0;
            while (true) {
                int i13 = h10Var.f39849s;
                if (i12 < i13) {
                    int i14 = (i13 * i10) + i12;
                    if (i14 < arrayList.size()) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i14);
                        x7Var.c(messageObject, i12, arrayList.indexOf(messageObject));
                        if (h10Var.f39844o0.g()) {
                            int id2 = messageObject.getId();
                            z00Var.f46148a = messageObject.getDialogId();
                            z00Var.f46149b = id2;
                            x7Var.b(i12, h10Var.f39844o0.c(z00Var), true);
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
            p2Var.f24721s2 = z10;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10);
            if (p2Var.getMessage() == null || p2Var.getMessage().getId() != messageObject2.getId()) {
                z12 = false;
            }
            p2Var.O = h10Var.f39845p0;
            p2Var.V(messageObject2.getDialogId(), messageObject2, messageObject2.messageOwner.date, false, false);
            if (h10Var.f39844o0.g()) {
                int id3 = messageObject2.getId();
                z00Var.f46148a = messageObject2.getDialogId();
                z00Var.f46149b = id3;
                p2Var.U(h10Var.f39844o0.c(z00Var), z12);
                return;
            }
            p2Var.U(false, z12);
        } else if (i11 == 1) {
            int i15 = h10Var.f39849s;
            ((org.telegram.ui.Components.c10) view).v = i15 - ((((int) Math.ceil(arrayList.size() / h10Var.f39849s)) * i15) - arrayList.size());
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        u00 u00Var;
        u00 u00Var2;
        Context context = this.f39237c;
        if (i10 != 0) {
            if (i10 != 2) {
                u00Var2 = new u00(this, context, 1);
                u00Var2.setIsSingleCell(true);
                u00Var2.setViewType(2);
                return ic.a.n(u00Var2, u00Var2, -1, -2);
            }
            ?? z3Var = new org.telegram.ui.Cells.z3(context, null);
            z3Var.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23376e7, false) & (-218103809));
            u00Var = z3Var;
        } else {
            final ?? frameLayout = new FrameLayout(context);
            Paint paint = new Paint();
            frameLayout.f25723n = paint;
            frameLayout.f25725s = UserConfig.selectedAccount;
            frameLayout.f25724r = 1;
            paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Lh, false));
            frameLayout.f25720b = new MessageObject[6];
            frameLayout.f25719a = new org.telegram.ui.Cells.t7[6];
            frameLayout.f25721c = new int[6];
            for (int i11 = 0; i11 < 6; i11++) {
                frameLayout.f25719a[i11] = new org.telegram.ui.Cells.t7(frameLayout, context);
                frameLayout.addView(frameLayout.f25719a[i11]);
                frameLayout.f25719a[i11].setVisibility(4);
                frameLayout.f25719a[i11].setTag(Integer.valueOf(i11));
                frameLayout.f25719a[i11].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 10));
                frameLayout.f25719a[i11].setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        x7 x7Var = x7.this;
                        if (x7Var.d != null) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            u7 u7Var = x7Var.d;
                            int i12 = x7Var.f25721c[intValue];
                            MessageObject messageObject = x7Var.f25720b[intValue];
                            org.telegram.ui.f fVar = (org.telegram.ui.f) u7Var;
                            h10 h10Var = ((f10) fVar.f39224b).d;
                            if (h10Var.f39844o0.g()) {
                                h10 h10Var2 = ((f10) fVar.f39224b).d;
                                SpannableStringBuilder[] spannableStringBuilderArr = h10.f39825s0;
                                h10Var2.f(i12, x7Var, messageObject, intValue);
                                return true;
                            }
                            h10.a(h10Var, messageObject, x7Var, intValue);
                            return true;
                        }
                        return false;
                    }
                });
            }
            frameLayout.setDelegate(new f(this, 17));
            u00Var = frameLayout;
        }
        u00Var2 = u00Var;
        return ic.a.n(u00Var2, u00Var2, -1, -2);
    }
}
