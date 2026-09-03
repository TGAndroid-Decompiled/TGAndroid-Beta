package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ep extends org.telegram.ui.Components.rl0 {
    public static final int Y2 = 0;
    public final dp U2;
    public boolean V2;
    public final Paint W2;
    public final fp X2;

    public ep(fp fpVar, Context context) {
        super(context, null);
        this.X2 = fpVar;
        this.V2 = false;
        this.W2 = new Paint(1);
        dp dpVar = new dp(this);
        this.U2 = dpVar;
        setAdapter(dpVar);
        setLayoutManager(new f2.i0());
        setOnItemClickListener(new cp(this));
        new f2.e0(new oh.f(this, 1)).d(this);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int R;
        int size = this.X2.K.size();
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && (R = RecyclerView.R(childAt)) >= 1 && R <= size) {
                i10 = Math.min(childAt.getTop(), i10);
                i11 = Math.max(childAt.getBottom(), i11);
            }
        }
        if (i10 < i11) {
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19881d6, this.f28511m2);
            Paint paint = this.W2;
            paint.setColor(v02);
            canvas2 = canvas;
            canvas2.drawRect(0.0f, i10, getWidth(), i11, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(9999999, Integer.MIN_VALUE));
    }

    public final void v1(TLRPC.TL_username tL_username, boolean z4, boolean z10) {
        TLRPC.TL_username tL_username2;
        int min;
        fp fpVar = this.X2;
        ArrayList arrayList = fpVar.K;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (arrayList.get(i11) == tL_username) {
                int i12 = i11 + 1;
                if (i11 >= 0 && i11 < arrayList.size() && (tL_username2 = (TLRPC.TL_username) arrayList.get(i11)) != null) {
                    int i13 = -1;
                    if (tL_username2.active != z4) {
                        tL_username2.active = z4;
                        if (z4) {
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList.size()) {
                                    if (!((TLRPC.TL_username) arrayList.get(i14)).active) {
                                        break;
                                    }
                                    i14++;
                                } else {
                                    i14 = -1;
                                    break;
                                }
                            }
                            if (i14 >= 0) {
                                min = Math.max(0, i14 - 1);
                                i13 = min + 1;
                            }
                        } else {
                            int i15 = -1;
                            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                if (((TLRPC.TL_username) arrayList.get(i16)).active) {
                                    i15 = i16;
                                }
                            }
                            if (i15 >= 0) {
                                min = Math.min(arrayList.size() - 1, i15 + 1);
                                i13 = min + 1;
                            }
                        }
                    }
                    int i17 = 0;
                    while (true) {
                        if (i17 >= getChildCount()) {
                            break;
                        }
                        View childAt = getChildAt(i17);
                        if (RecyclerView.R(childAt) == i12) {
                            if (z10) {
                                AndroidUtilities.shakeView(childAt);
                            }
                            if (childAt instanceof oa) {
                                oa oaVar = (oa) childAt;
                                oaVar.setLoading(fpVar.M.contains(tL_username2.username));
                                TLRPC.TL_username tL_username3 = oaVar.v;
                                if (tL_username3 != null) {
                                    oaVar.a(tL_username3, oaVar.f36705w, true, oaVar.f36706x);
                                }
                            }
                        } else {
                            i17++;
                        }
                    }
                    if (i13 >= 0 && i12 != i13) {
                        int i18 = i13 - 1;
                        dp dpVar = this.U2;
                        ArrayList arrayList2 = dpVar.f33509c.X2.K;
                        if (i11 < arrayList2.size() && i18 < arrayList2.size()) {
                            arrayList2.add(i18, (TLRPC.TL_username) arrayList2.remove(i11));
                            dpVar.p(i12, i13);
                            while (i10 < arrayList2.size()) {
                                i10++;
                                dpVar.m(i10);
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }
}
