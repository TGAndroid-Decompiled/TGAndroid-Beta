package org.telegram.ui;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.RecyclerAnimationScrollHelper;
import org.telegram.ui.Components.UItem;

public final class CallLogActivity$$ExternalSyntheticLambda4 implements OnApplyWindowInsetsListener, Utilities.Callback5, Utilities.Callback5Return, RecyclerAnimationScrollHelper.ScrollListener {
    public final CallLogActivity f$0;

    public CallLogActivity$$ExternalSyntheticLambda4(CallLogActivity callLogActivity) {
        this.f$0 = callLogActivity;
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return this.f$0.onInsetsInternal(view, windowInsetsCompat);
    }

    @Override
    public void onScroll() {
        this.f$0.blur3_InvalidateBlur();
    }

    @Override
    public void mo1067run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        this.f$0.onClick$7((UItem) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        CallLogActivity callLogActivity = this.f$0;
        callLogActivity.getClass();
        Object obj6 = ((UItem) obj).object;
        if (obj6 instanceof CallLogActivity.CallLogRow) {
            callLogActivity.addOrRemoveSelectedDialog(((CallLogActivity.CallLogRow) obj6).calls, (CallLogActivity.CallCell) view);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
