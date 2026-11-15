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
public final class p6 implements q0.a {
    public final IdentityHashMap f29489a = new IdentityHashMap();
    public boolean f29490b;
    public int f29491c;
    public HashSet d;
    public boolean f29492e;

    public final void a() {
        this.f29489a.clear();
        this.d = null;
        this.f29492e = false;
    }

    @Override
    public final void accept(Object obj) {
        b((View) obj);
    }

    public final void b(View view) {
        v4.v0 recycledViewPool;
        if (view != null && this.f29489a.put(view, Boolean.TRUE) == null) {
            int i7 = 0;
            if (this.f29491c == 0) {
                if (view instanceof z5) {
                    try {
                        ((z5) view).updateColors();
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                }
                try {
                    q6.a0(view);
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
                l6 o4 = q6.o(view, false);
                if (o4 != null) {
                    for (int i10 = 0; i10 < 6; i10++) {
                        k6 k6Var = o4.f29369a[i10];
                        if (k6Var != null) {
                            q6.f(k6Var, hashSet);
                        }
                    }
                    if (o4.f29370b != null) {
                        for (int i11 = 0; i11 < o4.f29370b.size(); i11++) {
                            q6.f((k6) o4.f29370b.get(i11), hashSet);
                        }
                    }
                    if (o4.f29371c != null) {
                        for (int i12 = 0; i12 < o4.f29371c.size(); i12++) {
                            q6.f((k6) o4.f29371c.get(i12), hashSet);
                        }
                    }
                    k6 k6Var2 = o4.f29372e;
                    if (k6Var2 != null) {
                        q6.f(k6Var2, hashSet);
                    }
                    k6 k6Var3 = o4.f29373f;
                    if (k6Var3 != null) {
                        q6.f(k6Var3, hashSet);
                    }
                }
            }
            if (view instanceof RecyclerView) {
                RecyclerView recyclerView = (RecyclerView) view;
                boolean z10 = this.f29490b;
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
                    SparseArray sparseArray = recycledViewPool.f58664a;
                    for (int i17 = 0; i17 < sparseArray.size(); i17++) {
                        ArrayList arrayList2 = ((v4.u0) sparseArray.valueAt(i17)).f58658a;
                        for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                            arrayList.add(((v4.e1) arrayList2.get(i18)).f58535a);
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
