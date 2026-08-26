package org.telegram.ui.community;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.UItem;

public final class CommunityPendingRequestsActivity$$ExternalSyntheticLambda1 implements Utilities.Callback5, Utilities.Callback5Return, OnApplyWindowInsetsListener {
    public final CommunityPendingRequestsActivity f$0;

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        this.f$0.checkPaddings(windowInsetsCompat.mImpl.getInsets(519).bottom);
        return WindowInsetsCompat.CONSUMED;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        this.f$0.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo1067run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        this.f$0.onClick$15((UItem) obj);
    }
}
