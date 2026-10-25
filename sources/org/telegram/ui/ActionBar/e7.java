package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.IdentityHashMap;
import org.telegram.messenger.FileLog;
public final class e7 implements q0.a {
    public final IdentityHashMap f22608a = new IdentityHashMap();
    public boolean f22609b;
    public int f22610c;
    public HashSet d;
    public boolean e;

    public final void a() {
        this.f22608a.clear();
        this.d = null;
        this.e = false;
    }

    @Override
    public final void accept(Object obj) {
        b((View) obj);
    }

    public final void b(View view) {
        s4.w0 recycledViewPool;
        if (view != null && this.f22608a.put(view, Boolean.TRUE) == null) {
            int i10 = 0;
            if (this.f22610c == 0) {
                if (view instanceof p6) {
                    try {
                        ((p6) view).updateColors();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                try {
                    f7.c0(view);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                Drawable background = view.getBackground();
                if (background instanceof p6) {
                    try {
                        ((p6) background).updateColors();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                    background.invalidateSelf();
                }
                Drawable foreground = view.getForeground();
                if (foreground instanceof p6) {
                    try {
                        ((p6) foreground).updateColors();
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                    foreground.invalidateSelf();
                }
                view.invalidate();
            } else {
                HashSet hashSet = this.d;
                if (view instanceof p6) {
                    ((p6) view).addColorKeys(hashSet);
                }
                a7 p10 = f7.p(view, false);
                if (p10 != null) {
                    for (int i11 = 0; i11 < 6; i11++) {
                        z6 z6Var = p10.f22417a[i11];
                        if (z6Var != null) {
                            f7.g(z6Var, hashSet);
                        }
                    }
                    if (p10.f22418b != null) {
                        for (int i12 = 0; i12 < p10.f22418b.size(); i12++) {
                            f7.g((z6) p10.f22418b.get(i12), hashSet);
                        }
                    }
                    if (p10.f22419c != null) {
                        for (int i13 = 0; i13 < p10.f22419c.size(); i13++) {
                            f7.g((z6) p10.f22419c.get(i13), hashSet);
                        }
                    }
                    z6 z6Var2 = p10.e;
                    if (z6Var2 != null) {
                        f7.g(z6Var2, hashSet);
                    }
                    z6 z6Var3 = p10.f22420f;
                    if (z6Var3 != null) {
                        f7.g(z6Var3, hashSet);
                    }
                }
            }
            if (view instanceof RecyclerView) {
                RecyclerView recyclerView = (RecyclerView) view;
                boolean z10 = this.f22609b;
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
                    SparseArray sparseArray = recycledViewPool.f47853a;
                    for (int i18 = 0; i18 < sparseArray.size(); i18++) {
                        ArrayList arrayList2 = ((s4.v0) sparseArray.valueAt(i18)).f47847a;
                        for (int i19 = 0; i19 < arrayList2.size(); i19++) {
                            arrayList.add(((s4.e1) arrayList2.get(i19)).f47735a);
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
