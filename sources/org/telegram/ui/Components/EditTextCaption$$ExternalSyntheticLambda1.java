package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;

public final class EditTextCaption$$ExternalSyntheticLambda1 implements EditTextCaption.InputDialogCallback, RecyclerListView.OnItemClickListenerExtended {
    public final KeyEvent.Callback f$0;
    public final int f$1;
    public final int f$2;
    public final Object f$3;

    public EditTextCaption$$ExternalSyntheticLambda1(EditTextCaption editTextCaption, int i, int i2, Runnable runnable) {
        this.f$0 = editTextCaption;
        this.f$1 = i;
        this.f$2 = i2;
        this.f$3 = runnable;
    }

    @Override
    public boolean hasDoubleTap(View view) {
        return false;
    }

    @Override
    public void onDoubleTap(View view, float f, float f2) {
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        ((UserSelectorBottomSheet) this.f$0).lambda$new$8(this.f$1, this.f$2, view, (Theme.ResourcesProvider) this.f$3);
    }

    @Override
    public void run(String str) {
        ((EditTextCaption) this.f$0).lambda$makeSelectedUrl$3(this.f$1, this.f$2, (Runnable) this.f$3, str);
    }

    public EditTextCaption$$ExternalSyntheticLambda1(UserSelectorBottomSheet userSelectorBottomSheet, int i, Theme.ResourcesProvider resourcesProvider, int i2) {
        this.f$0 = userSelectorBottomSheet;
        this.f$1 = i;
        this.f$3 = resourcesProvider;
        this.f$2 = i2;
    }
}
