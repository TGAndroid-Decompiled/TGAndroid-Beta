package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.mlkit_vision_common.zzkt;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LoginActivity;

public abstract class UniversalFragment extends BaseFragment {
    public AnonymousClass3 listView;
    public int savedScrollOffset;
    public int savedScrollPosition;

    public UniversalFragment() {
        super(null);
        this.savedScrollPosition = -1;
    }

    @Override
    public View createView(Context context) {
        zzkt.m(this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(getTitle());
        this.actionBar.setActionBarMenuOnItemClick(new LoginActivity.AnonymousClass1(this, 7));
        LaunchActivity.AnonymousClass11 anonymousClass11 = new LaunchActivity.AnonymousClass11(context, null, 2);
        anonymousClass11.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        ?? r1 = new UniversalRecyclerView(this, new GiftSheet$$ExternalSyntheticLambda8(this, 11), new UniversalFragment$$ExternalSyntheticLambda1(this), new UniversalFragment$$ExternalSyntheticLambda1(this)) {
            {
                super(this.getParentActivity(), this.getCurrentAccount(), this.getClassGuid(), giftSheet$$ExternalSyntheticLambda8, universalFragment$$ExternalSyntheticLambda1, universalFragment$$ExternalSyntheticLambda1, this.getResourceProvider());
            }

            @Override
            public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
                UniversalFragment.this.savedScrollPosition = -1;
            }
        };
        this.listView = r1;
        anonymousClass11.addView((View) r1, LayoutHelper.createFrame(-1.0f, -1));
        this.fragmentView = anonymousClass11;
        return anonymousClass11;
    }

    public abstract void fillItems$1(ArrayList arrayList, UniversalAdapter universalAdapter);

    public abstract CharSequence getTitle();

    public abstract void onClick$1(UItem uItem, View view);

    public abstract boolean onLongClick(UItem uItem, View view);
}
