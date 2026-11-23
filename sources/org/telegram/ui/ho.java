package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ho extends org.telegram.ui.Components.ek0 {
    public static final int j3 = 0;
    public final go f48599f3;
    public boolean f48600g3;
    public final Paint f48601h3;
    public final io f48602i3;

    public ho(io ioVar, Context context) {
        super(context, null);
        this.f48602i3 = ioVar;
        this.f48600g3 = false;
        this.f48601h3 = new Paint(1);
        go goVar = new go(this);
        this.f48599f3 = goVar;
        setAdapter(goVar);
        setLayoutManager(new v4.c0());
        setOnItemClickListener(new fo(this));
        new v4.z(new gi.c(this, 2)).h(this);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int R;
        int size = this.f48602i3.O.size();
        int i7 = Integer.MAX_VALUE;
        int i10 = Integer.MIN_VALUE;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt != null && (R = RecyclerView.R(childAt)) >= 1 && R <= size) {
                i7 = Math.min(childAt.getTop(), i7);
                i10 = Math.max(childAt.getBottom(), i10);
            }
        }
        if (i7 < i10) {
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29451d6, this.f34767o2);
            Paint paint = this.f48601h3;
            paint.setColor(w02);
            canvas2 = canvas;
            canvas2.drawRect(0.0f, i7, getWidth(), i10, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(9999999, Integer.MIN_VALUE));
    }

    public final void z1(TLRPC.TL_username tL_username, boolean z10, boolean z11) {
        TLRPC.TL_username tL_username2;
        int min;
        io ioVar = this.f48602i3;
        ArrayList arrayList = ioVar.O;
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) == tL_username) {
                int i11 = i10 + 1;
                if (i10 >= 0 && i10 < arrayList.size() && (tL_username2 = (TLRPC.TL_username) arrayList.get(i10)) != null) {
                    int i12 = -1;
                    if (tL_username2.active != z10) {
                        tL_username2.active = z10;
                        if (z10) {
                            int i13 = 0;
                            while (true) {
                                if (i13 < arrayList.size()) {
                                    if (!((TLRPC.TL_username) arrayList.get(i13)).active) {
                                        break;
                                    }
                                    i13++;
                                } else {
                                    i13 = -1;
                                    break;
                                }
                            }
                            if (i13 >= 0) {
                                min = Math.max(0, i13 - 1);
                                i12 = min + 1;
                            }
                        } else {
                            int i14 = -1;
                            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                                if (((TLRPC.TL_username) arrayList.get(i15)).active) {
                                    i14 = i15;
                                }
                            }
                            if (i14 >= 0) {
                                min = Math.min(arrayList.size() - 1, i14 + 1);
                                i12 = min + 1;
                            }
                        }
                    }
                    int i16 = 0;
                    while (true) {
                        if (i16 >= getChildCount()) {
                            break;
                        }
                        View childAt = getChildAt(i16);
                        if (RecyclerView.R(childAt) == i11) {
                            if (z11) {
                                org.telegram.messenger.g0.D3(childAt);
                            }
                            if (childAt instanceof ia) {
                                ia iaVar = (ia) childAt;
                                iaVar.setLoading(ioVar.Q.contains(tL_username2.username));
                                TLRPC.TL_username tL_username3 = iaVar.f48762w;
                                if (tL_username3 != null) {
                                    iaVar.a(tL_username3, iaVar.f48763x, true, iaVar.f48764y);
                                }
                            }
                        } else {
                            i16++;
                        }
                    }
                    if (i12 >= 0 && i11 != i12) {
                        int i17 = i12 - 1;
                        go goVar = this.f48599f3;
                        ArrayList arrayList2 = goVar.f48337c.f48602i3.O;
                        if (i10 < arrayList2.size() && i17 < arrayList2.size()) {
                            arrayList2.add(i17, (TLRPC.TL_username) arrayList2.remove(i10));
                            goVar.j(i11, i12);
                            while (i7 < arrayList2.size()) {
                                i7++;
                                goVar.g(i7);
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
