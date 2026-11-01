package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class bp extends org.telegram.ui.Components.uk0 {
    public static final int f36091i3 = 0;
    public final ap f36092e3;
    public boolean f36093f3;
    public final Paint f36094g3;
    public final cp f36095h3;

    public bp(cp cpVar, Context context) {
        super(context, null);
        this.f36095h3 = cpVar;
        this.f36093f3 = false;
        this.f36094g3 = new Paint(1);
        ap apVar = new ap(this);
        this.f36092e3 = apVar;
        setAdapter(apVar);
        setLayoutManager(new s4.a0());
        setOnItemClickListener(new zo(this));
        new s4.x(new ja(this, 1)).h(this);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int R;
        int size = this.f36095h3.N.size();
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
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, this.f31008n2);
            Paint paint = this.f36094g3;
            paint.setColor(w02);
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

    public final void z1(TLRPC.TL_username tL_username, boolean z10, boolean z11) {
        TLRPC.TL_username tL_username2;
        int min;
        cp cpVar = this.f36095h3;
        ArrayList arrayList = cpVar.N;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (arrayList.get(i11) == tL_username) {
                int i12 = i11 + 1;
                if (i11 >= 0 && i11 < arrayList.size() && (tL_username2 = (TLRPC.TL_username) arrayList.get(i11)) != null) {
                    int i13 = -1;
                    if (tL_username2.active != z10) {
                        tL_username2.active = z10;
                        if (z10) {
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
                            if (z11) {
                                org.telegram.messenger.i0.E3(childAt);
                            }
                            if (childAt instanceof la) {
                                la laVar = (la) childAt;
                                laVar.setLoading(cpVar.P.contains(tL_username2.username));
                                TLRPC.TL_username tL_username3 = laVar.f39164w;
                                if (tL_username3 != null) {
                                    laVar.a(tL_username3, laVar.f39165x, true, laVar.f39166y);
                                }
                            }
                        } else {
                            i17++;
                        }
                    }
                    if (i13 >= 0 && i12 != i13) {
                        int i18 = i13 - 1;
                        ap apVar = this.f36092e3;
                        ArrayList arrayList2 = apVar.f35820c.f36095h3.N;
                        if (i11 < arrayList2.size() && i18 < arrayList2.size()) {
                            arrayList2.add(i18, (TLRPC.TL_username) arrayList2.remove(i11));
                            apVar.j(i12, i13);
                            while (i10 < arrayList2.size()) {
                                i10++;
                                apVar.g(i10);
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
