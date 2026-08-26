package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Cells.GroupCreateUserCell;

public final class PassportActivity$$ExternalSyntheticLambda33 implements View.OnTouchListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public PassportActivity$$ExternalSyntheticLambda33(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$r8$classId) {
            case 0:
                return ((PassportActivity) this.f$0).lambda$createIdentityInterface$49((Context) this.f$1, view, motionEvent);
            case 1:
                return ((EditWidgetActivity.ListAdapter) this.f$0).lambda$onCreateViewHolder$0((GroupCreateUserCell) this.f$1, view, motionEvent);
            default:
                return ((FiltersSetupActivity.ListAdapter) this.f$0).lambda$onCreateViewHolder$0((FiltersSetupActivity.FilterCell) this.f$1, view, motionEvent);
        }
    }
}
