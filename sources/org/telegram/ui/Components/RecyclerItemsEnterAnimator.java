package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatUsersActivity;

public final class RecyclerItemsEnterAnimator {
    public final boolean alwaysCheckItemsAlpha;
    public boolean invalidateAlpha;
    public final RecyclerListView listView;
    public final SparseArray listAlphaItems = new SparseArray();
    public final HashSet ignoreView = new HashSet();
    public final boolean animateAlphaProgressView = true;
    public final ArrayList currentAnimations = new ArrayList();
    public final ArrayList preDrawListeners = new ArrayList();

    public RecyclerItemsEnterAnimator(RecyclerListView recyclerListView, boolean z) {
        this.listView = recyclerListView;
        this.alwaysCheckItemsAlpha = z;
        recyclerListView.setItemsEnterAnimator(this);
    }

    public final void cancel() {
        ArrayList arrayList = this.currentAnimations;
        int i = 0;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                ((AnimatorSet) arrayList2.get(i2)).end();
                ((AnimatorSet) arrayList2.get(i2)).cancel();
            }
        }
        arrayList.clear();
        while (true) {
            ArrayList arrayList3 = this.preDrawListeners;
            int size = arrayList3.size();
            RecyclerListView recyclerListView = this.listView;
            if (i >= size) {
                arrayList3.clear();
                this.listAlphaItems.clear();
                recyclerListView.invalidate();
                this.invalidateAlpha = true;
                return;
            }
            recyclerListView.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) arrayList3.get(i));
            i++;
        }
    }

    public final void showItemsAnimated(int i) {
        int i2 = 2;
        RecyclerListView recyclerListView = this.listView;
        int childCount = recyclerListView.getChildCount();
        View view = null;
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerListView.getChildAt(i3);
            if (RecyclerView.getChildAdapterPosition(childAt) >= 0 && (childAt instanceof FlickerLoadingView)) {
                view = childAt;
            }
        }
        RecyclerView.LayoutManager layoutManager = recyclerListView.getLayoutManager();
        if (view != null && layoutManager != null) {
            recyclerListView.removeView(view);
            this.ignoreView.add(view);
            recyclerListView.addView(view);
            layoutManager.ignoreView(view);
            Animator animatorOfFloat = this.animateAlphaProgressView ? ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f) : ValueAnimator.ofFloat(0.0f, 1.0f);
            animatorOfFloat.addListener(new ChatActivity.AnonymousClass74(this, (FlickerLoadingView) view, z, 27));
            animatorOfFloat.start();
            i--;
        }
        ChatUsersActivity.AnonymousClass12 anonymousClass12 = new ChatUsersActivity.AnonymousClass12(this, (FlickerLoadingView) view, i, i2);
        this.preDrawListeners.add(anonymousClass12);
        recyclerListView.getViewTreeObserver().addOnPreDrawListener(anonymousClass12);
    }
}
