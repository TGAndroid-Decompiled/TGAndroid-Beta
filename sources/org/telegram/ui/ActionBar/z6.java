package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.IdentityHashMap;
import org.telegram.messenger.f8;
public final class z6 implements q0.a {
    public final IdentityHashMap f21627a = new IdentityHashMap();
    public boolean f21628b;
    public int f21629c;
    public HashSet d;
    public boolean e;

    public final void a() {
        this.f21627a.clear();
        this.d = null;
        this.e = false;
    }

    @Override
    public final void accept(Object obj) {
        b((View) obj);
    }

    public final void b(View view) {
        s4.u0 recycledViewPool;
        if (view != null && this.f21627a.put(view, Boolean.TRUE) == null) {
            int i10 = 0;
            if (this.f21629c == 0) {
                if (view instanceof k6) {
                    try {
                        ((k6) view).updateColors();
                    } catch (Exception e) {
                        f8.g(e, true);
                    }
                }
                try {
                    a7.b0(view);
                } catch (Exception e7) {
                    f8.g(e7, true);
                }
                Drawable background = view.getBackground();
                if (background instanceof k6) {
                    try {
                        ((k6) background).updateColors();
                    } catch (Exception e10) {
                        f8.g(e10, true);
                    }
                    background.invalidateSelf();
                }
                Drawable foreground = view.getForeground();
                if (foreground instanceof k6) {
                    try {
                        ((k6) foreground).updateColors();
                    } catch (Exception e11) {
                        f8.g(e11, true);
                    }
                    foreground.invalidateSelf();
                }
                view.invalidate();
            } else {
                HashSet hashSet = this.d;
                if (view instanceof k6) {
                    ((k6) view).addColorKeys(hashSet);
                }
                v6 p5 = a7.p(view, false);
                if (p5 != null) {
                    for (int i11 = 0; i11 < 6; i11++) {
                        u6 u6Var = p5.f21415a[i11];
                        if (u6Var != null) {
                            a7.g(u6Var, hashSet);
                        }
                    }
                    if (p5.f21416b != null) {
                        for (int i12 = 0; i12 < p5.f21416b.size(); i12++) {
                            a7.g((u6) p5.f21416b.get(i12), hashSet);
                        }
                    }
                    if (p5.f21417c != null) {
                        for (int i13 = 0; i13 < p5.f21417c.size(); i13++) {
                            a7.g((u6) p5.f21417c.get(i13), hashSet);
                        }
                    }
                    u6 u6Var2 = p5.e;
                    if (u6Var2 != null) {
                        a7.g(u6Var2, hashSet);
                    }
                    u6 u6Var3 = p5.f21418f;
                    if (u6Var3 != null) {
                        a7.g(u6Var3, hashSet);
                    }
                }
            }
            if (view instanceof RecyclerView) {
                RecyclerView recyclerView = (RecyclerView) view;
                boolean z10 = this.f21628b;
                for (int i14 = 0; i14 < recyclerView.getChildCount(); i14++) {
                    b(recyclerView.getChildAt(i14));
                }
                for (int i15 = 0; i15 < recyclerView.getHiddenChildCount(); i15++) {
                    b(recyclerView.V(i15));
                }
                for (int i16 = 0; i16 < recyclerView.getAttachedScrapChildCount(); i16++) {
                    b(recyclerView.O(i16));
                }
                for (int i17 = 0; i17 < recyclerView.getCachedChildCount(); i17++) {
                    b(recyclerView.P(i17));
                }
                if (z10 && (recycledViewPool = recyclerView.getRecycledViewPool()) != null) {
                    ArrayList arrayList = new ArrayList();
                    SparseArray sparseArray = recycledViewPool.f48027a;
                    for (int i18 = 0; i18 < sparseArray.size(); i18++) {
                        ArrayList arrayList2 = ((s4.t0) sparseArray.valueAt(i18)).f48021a;
                        for (int i19 = 0; i19 < arrayList2.size(); i19++) {
                            arrayList.add(((s4.c1) arrayList2.get(i19)).f47909a);
                        }
                    }
                    while (i10 < arrayList.size()) {
                        b((View) arrayList.get(i10));
                        i10++;
                    }
                }
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                while (i10 < viewGroup.getChildCount()) {
                    b(viewGroup.getChildAt(i10));
                    i10++;
                }
            }
        }
    }
}
