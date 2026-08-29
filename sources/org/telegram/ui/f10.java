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
public final class f10 extends org.telegram.ui.Components.il0 {
    public final Context f37955c;
    public final h10 d;

    public f10(h10 h10Var, Context context) {
        this.d = h10Var;
        this.f37955c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return false;
    }

    @Override
    public final int h() {
        h10 h10Var = this.d;
        ArrayList arrayList = h10Var.f38727f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(arrayList.size() / h10Var.f38738s)) + (!h10Var.J ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        h10 h10Var = this.d;
        if (i10 < ((int) Math.ceil(h10Var.f38727f.size() / h10Var.f38738s))) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        h10 h10Var = this.d;
        z00 z00Var = h10Var.O;
        ArrayList arrayList = h10Var.f38727f;
        int i11 = n1Var.f6436f;
        View view = n1Var.f6432a;
        boolean z11 = true;
        if (i11 == 0) {
            org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) view;
            q7Var.setItemsCount(h10Var.f38738s);
            if (i10 != 0) {
                z11 = false;
            }
            q7Var.setIsFirst(z11);
            int i12 = 0;
            while (true) {
                int i13 = h10Var.f38738s;
                if (i12 < i13) {
                    int i14 = (i13 * i10) + i12;
                    if (i14 < arrayList.size()) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i14);
                        q7Var.c(i12, arrayList.indexOf(messageObject), messageObject);
                        if (h10Var.f38733k0.f()) {
                            int id2 = messageObject.getId();
                            z00Var.f45005a = messageObject.getDialogId();
                            z00Var.f45006b = id2;
                            q7Var.b(i12, h10Var.f38733k0.b(z00Var));
                        } else {
                            q7Var.b(i12, false);
                        }
                    } else {
                        q7Var.c(i12, i14, null);
                    }
                    i12++;
                } else {
                    q7Var.requestLayout();
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
            p2Var.f24898o2 = z10;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10);
            z11 = (p2Var.getMessage() == null || p2Var.getMessage().getId() != messageObject2.getId()) ? false : false;
            p2Var.K = h10Var.f38734l0;
            p2Var.W(messageObject2.getDialogId(), messageObject2, messageObject2.messageOwner.date, false, false);
            if (h10Var.f38733k0.f()) {
                int id3 = messageObject2.getId();
                z00Var.f45005a = messageObject2.getDialogId();
                z00Var.f45006b = id3;
                p2Var.V(h10Var.f38733k0.b(z00Var), z11);
                return;
            }
            p2Var.V(false, z11);
        } else if (i11 == 1) {
            int i15 = h10Var.f38738s;
            ((org.telegram.ui.Components.p00) view).v = i15 - ((((int) Math.ceil(arrayList.size() / h10Var.f38738s)) * i15) - arrayList.size());
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        v00 v00Var;
        v00 v00Var2;
        Context context = this.f37955c;
        if (i10 != 0) {
            if (i10 != 2) {
                v00Var2 = new v00(this, context, 1);
                v00Var2.setIsSingleCell(true);
                v00Var2.setViewType(2);
                return th.m(v00Var2, v00Var2, -1, -2);
            }
            ?? s3Var = new org.telegram.ui.Cells.s3(context, null);
            s3Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23081e7, false) & (-218103809));
            v00Var = s3Var;
        } else {
            final ?? frameLayout = new FrameLayout(context);
            Paint paint = new Paint();
            frameLayout.f25077n = paint;
            frameLayout.f25079s = UserConfig.selectedAccount;
            frameLayout.f25078r = 1;
            paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Lh, false));
            frameLayout.f25073b = new MessageObject[6];
            frameLayout.f25072a = new org.telegram.ui.Cells.m7[6];
            frameLayout.f25074c = new int[6];
            for (int i11 = 0; i11 < 6; i11++) {
                frameLayout.f25072a[i11] = new org.telegram.ui.Cells.m7(frameLayout, context);
                frameLayout.addView(frameLayout.f25072a[i11]);
                frameLayout.f25072a[i11].setVisibility(4);
                frameLayout.f25072a[i11].setTag(Integer.valueOf(i11));
                frameLayout.f25072a[i11].setOnClickListener(new org.telegram.ui.Cells.a(frameLayout, 10));
                frameLayout.f25072a[i11].setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        q7 q7Var = q7.this;
                        if (q7Var.d != null) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            n7 n7Var = q7Var.d;
                            int i12 = q7Var.f25074c[intValue];
                            MessageObject messageObject = q7Var.f25073b[intValue];
                            org.telegram.ui.h hVar = (org.telegram.ui.h) n7Var;
                            h10 h10Var = ((f10) hVar.f38706b).d;
                            if (h10Var.f38733k0.f()) {
                                h10 h10Var2 = ((f10) hVar.f38706b).d;
                                SpannableStringBuilder[] spannableStringBuilderArr = h10.f38717o0;
                                h10Var2.f(i12, q7Var, messageObject, intValue);
                                return true;
                            }
                            h10.a(h10Var, messageObject, q7Var, intValue);
                            return true;
                        }
                        return false;
                    }
                });
            }
            frameLayout.setDelegate(new h(this, 17));
            v00Var = frameLayout;
        }
        v00Var2 = v00Var;
        return th.m(v00Var2, v00Var2, -1, -2);
    }
}
