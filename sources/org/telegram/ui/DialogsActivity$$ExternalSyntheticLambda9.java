package org.telegram.ui;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.RecyclerAnimationScrollHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ShareTopView;

public final class DialogsActivity$$ExternalSyntheticLambda9 implements ShareTopView.OnModeChangeListener, RecyclerListView.OnItemClickListenerExtended, RecyclerListView.OnItemLongClickListener, FilteredSearchView.Delegate, AlertDialog.OnButtonClickListener, RecyclerAnimationScrollHelper.ScrollListener, OnApplyWindowInsetsListener {
    public final int $r8$classId;
    public final DialogsActivity f$0;

    public DialogsActivity$$ExternalSyntheticLambda9(DialogsActivity dialogsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = dialogsActivity;
    }

    @Override
    public boolean hasDoubleTap(View view, int i) {
        int i2 = this.$r8$classId;
        return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i);
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return this.f$0.onApplyWindowInsets(view, windowInsetsCompat);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$performSelectedDialogsAction$110(alertDialog, i);
                break;
            case 7:
                this.f$0.lambda$showSuggestion$122(alertDialog, i);
                break;
            case 10:
                this.f$0.lambda$onResume$83(alertDialog, i);
                break;
            default:
                this.f$0.lambda$onResume$85(alertDialog, i);
                break;
        }
    }

    @Override
    public void onDoubleTap(View view, int i, float f, float f2) {
        int i2 = this.$r8$classId;
        RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i, f, f2);
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        switch (this.$r8$classId) {
            case 2:
                this.f$0.lambda$createSearchViewPager$148(view, i, f, f2);
                break;
            case 3:
                this.f$0.lambda$createSearchViewPager$149(view, i, f, f2);
                break;
            default:
                this.f$0.lambda$createSearchViewPager$153(view, i, f, f2);
                break;
        }
    }

    @Override
    public void onModeChanged(int i, int i2) {
        this.f$0.lambda$attachShareTopView$129(i, i2);
    }

    @Override
    public void onScroll() {
        this.f$0.lambda$createView$17();
    }

    @Override
    public void updateFiltersView(boolean z, ArrayList arrayList, ArrayList arrayList2, boolean z2) {
        this.f$0.lambda$createSearchViewPager$154(z, arrayList, arrayList2, z2);
    }

    @Override
    public boolean onItemClick(View view, int i) {
        return this.f$0.lambda$createSearchViewPager$152(view, i);
    }
}
