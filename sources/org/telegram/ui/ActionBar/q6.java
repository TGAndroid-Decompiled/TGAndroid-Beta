package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.IdentityHashMap;
import org.telegram.messenger.a8;
public final class q6 implements q0.a {
    public final IdentityHashMap f28488a = new IdentityHashMap();
    public boolean f28489b;
    public int f28490c;
    public HashSet d;
    public boolean f28491e;

    public final void a() {
        this.f28488a.clear();
        this.d = null;
        this.f28491e = false;
    }

    @Override
    public final void accept(Object obj) {
        b((View) obj);
    }

    public final void b(View view) {
        u4.v0 recycledViewPool;
        if (view != null && this.f28488a.put(view, Boolean.TRUE) == null) {
            int i3 = 0;
            if (this.f28490c == 0) {
                if (view instanceof z5) {
                    try {
                        ((z5) view).updateColors();
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                }
                try {
                    r6.b0(view);
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
                Drawable background = view.getBackground();
                if (background instanceof z5) {
                    try {
                        ((z5) background).updateColors();
                    } catch (Exception e12) {
                        a8.g(e12, true);
                    }
                    background.invalidateSelf();
                }
                Drawable foreground = view.getForeground();
                if (foreground instanceof z5) {
                    try {
                        ((z5) foreground).updateColors();
                    } catch (Exception e13) {
                        a8.g(e13, true);
                    }
                    foreground.invalidateSelf();
                }
                view.invalidate();
            } else {
                HashSet hashSet = this.d;
                if (view instanceof z5) {
                    ((z5) view).addColorKeys(hashSet);
                }
                m6 p10 = r6.p(view, false);
                if (p10 != null) {
                    for (int i10 = 0; i10 < 6; i10++) {
                        l6 l6Var = p10.f28346a[i10];
                        if (l6Var != null) {
                            r6.g(l6Var, hashSet);
                        }
                    }
                    if (p10.f28347b != null) {
                        for (int i11 = 0; i11 < p10.f28347b.size(); i11++) {
                            r6.g((l6) p10.f28347b.get(i11), hashSet);
                        }
                    }
                    if (p10.f28348c != null) {
                        for (int i12 = 0; i12 < p10.f28348c.size(); i12++) {
                            r6.g((l6) p10.f28348c.get(i12), hashSet);
                        }
                    }
                    l6 l6Var2 = p10.f28349e;
                    if (l6Var2 != null) {
                        r6.g(l6Var2, hashSet);
                    }
                    l6 l6Var3 = p10.f28350f;
                    if (l6Var3 != null) {
                        r6.g(l6Var3, hashSet);
                    }
                }
            }
            if (view instanceof RecyclerView) {
                RecyclerView recyclerView = (RecyclerView) view;
                boolean z10 = this.f28489b;
                for (int i13 = 0; i13 < recyclerView.getChildCount(); i13++) {
                    b(recyclerView.getChildAt(i13));
                }
                for (int i14 = 0; i14 < recyclerView.getHiddenChildCount(); i14++) {
                    b(recyclerView.V(i14));
                }
                for (int i15 = 0; i15 < recyclerView.getAttachedScrapChildCount(); i15++) {
                    b(recyclerView.O(i15));
                }
                for (int i16 = 0; i16 < recyclerView.getCachedChildCount(); i16++) {
                    b(recyclerView.P(i16));
                }
                if (z10 && (recycledViewPool = recyclerView.getRecycledViewPool()) != null) {
                    ArrayList arrayList = new ArrayList();
                    SparseArray sparseArray = recycledViewPool.f55672a;
                    for (int i17 = 0; i17 < sparseArray.size(); i17++) {
                        ArrayList arrayList2 = ((u4.u0) sparseArray.valueAt(i17)).f55666a;
                        for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                            arrayList.add(((u4.d1) arrayList2.get(i18)).f55540a);
                        }
                    }
                    while (i3 < arrayList.size()) {
                        b((View) arrayList.get(i3));
                        i3++;
                    }
                }
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                while (i3 < viewGroup.getChildCount()) {
                    b(viewGroup.getChildAt(i3));
                    i3++;
                }
            }
        }
    }
}
