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
public final class t6 implements q0.a {
    public final IdentityHashMap f30018a = new IdentityHashMap();
    public boolean f30019b;
    public int f30020c;
    public HashSet d;
    public boolean f30021e;

    public final void a() {
        this.f30018a.clear();
        this.d = null;
        this.f30021e = false;
    }

    @Override
    public final void accept(Object obj) {
        b((View) obj);
    }

    public final void b(View view) {
        v4.w0 recycledViewPool;
        if (view != null && this.f30018a.put(view, Boolean.TRUE) == null) {
            int i7 = 0;
            if (this.f30020c == 0) {
                if (view instanceof c6) {
                    try {
                        ((c6) view).updateColors();
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                }
                try {
                    u6.a0(view);
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
                Drawable background = view.getBackground();
                if (background instanceof c6) {
                    try {
                        ((c6) background).updateColors();
                    } catch (Exception e12) {
                        a8.g(e12, true);
                    }
                    background.invalidateSelf();
                }
                Drawable foreground = view.getForeground();
                if (foreground instanceof c6) {
                    try {
                        ((c6) foreground).updateColors();
                    } catch (Exception e13) {
                        a8.g(e13, true);
                    }
                    foreground.invalidateSelf();
                }
                view.invalidate();
            } else {
                HashSet hashSet = this.d;
                if (view instanceof c6) {
                    ((c6) view).addColorKeys(hashSet);
                }
                p6 o4 = u6.o(view, false);
                if (o4 != null) {
                    for (int i10 = 0; i10 < 6; i10++) {
                        o6 o6Var = o4.f29871a[i10];
                        if (o6Var != null) {
                            u6.f(o6Var, hashSet);
                        }
                    }
                    if (o4.f29872b != null) {
                        for (int i11 = 0; i11 < o4.f29872b.size(); i11++) {
                            u6.f((o6) o4.f29872b.get(i11), hashSet);
                        }
                    }
                    if (o4.f29873c != null) {
                        for (int i12 = 0; i12 < o4.f29873c.size(); i12++) {
                            u6.f((o6) o4.f29873c.get(i12), hashSet);
                        }
                    }
                    o6 o6Var2 = o4.f29874e;
                    if (o6Var2 != null) {
                        u6.f(o6Var2, hashSet);
                    }
                    o6 o6Var3 = o4.f29875f;
                    if (o6Var3 != null) {
                        u6.f(o6Var3, hashSet);
                    }
                }
            }
            if (view instanceof RecyclerView) {
                RecyclerView recyclerView = (RecyclerView) view;
                boolean z10 = this.f30019b;
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
                    SparseArray sparseArray = recycledViewPool.f59249a;
                    for (int i17 = 0; i17 < sparseArray.size(); i17++) {
                        ArrayList arrayList2 = ((v4.v0) sparseArray.valueAt(i17)).f59243a;
                        for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                            arrayList.add(((v4.f1) arrayList2.get(i18)).f59122a);
                        }
                    }
                    while (i7 < arrayList.size()) {
                        b((View) arrayList.get(i7));
                        i7++;
                    }
                }
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                while (i7 < viewGroup.getChildCount()) {
                    b(viewGroup.getChildAt(i7));
                    i7++;
                }
            }
        }
    }
}
