package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.utils.GradientProtectionDrawable;
import org.telegram.ui.ActionBar.Theme;

public final class MessageEnterTransitionContainer extends View {
    public final int $r8$classId = 1;
    public final int currentAccount;
    public final Object hideRunnable;
    public final Object parent;
    public final Object transitions;

    public interface Transition {
        void onDraw(Canvas canvas);
    }

    public MessageEnterTransitionContainer(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.parent = new GradientProtectionDrawable(2);
        this.hideRunnable = new GradientProtectionDrawable(2);
        this.transitions = resourcesProvider;
        this.currentAccount = i;
    }

    public void checkVisibility() {
        ArrayList arrayList = (ArrayList) this.transitions;
        boolean zIsEmpty = arrayList.isEmpty();
        IntroActivity$$ExternalSyntheticLambda6 introActivity$$ExternalSyntheticLambda6 = (IntroActivity$$ExternalSyntheticLambda6) this.hideRunnable;
        int i = this.currentAccount;
        if (zIsEmpty && getVisibility() != 8) {
            NotificationCenter.getInstance(i).removeDelayed(introActivity$$ExternalSyntheticLambda6);
            NotificationCenter.getInstance(i).doOnIdle(introActivity$$ExternalSyntheticLambda6);
        } else {
            if (arrayList.isEmpty() || getVisibility() == 0) {
                return;
            }
            NotificationCenter.getInstance(i).removeDelayed(introActivity$$ExternalSyntheticLambda6);
            setVisibility(0);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.$r8$classId) {
            case 0:
                ArrayList arrayList = (ArrayList) this.transitions;
                if (!arrayList.isEmpty()) {
                    for (int i = 0; i < arrayList.size(); i++) {
                        ((Transition) arrayList.get(i)).onDraw(canvas);
                    }
                    break;
                }
                break;
            default:
                int i2 = this.currentAccount;
                Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) this.transitions;
                int iMultAlpha = Theme.multAlpha(0.5f, Theme.getColor(i2, resourcesProvider));
                GradientProtectionDrawable gradientProtectionDrawable = (GradientProtectionDrawable) this.parent;
                gradientProtectionDrawable.setColor(iMultAlpha);
                gradientProtectionDrawable.draw(canvas);
                int iMultAlpha2 = Theme.multAlpha(0.95f, Theme.getColor(i2, resourcesProvider));
                GradientProtectionDrawable gradientProtectionDrawable2 = (GradientProtectionDrawable) this.hideRunnable;
                gradientProtectionDrawable2.setColor(iMultAlpha2);
                gradientProtectionDrawable2.draw(canvas);
                break;
        }
    }

    @Override
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.$r8$classId) {
            case 1:
                super.onSizeChanged(i, i2, i3, i4);
                int i5 = AndroidUtilities.statusBarHeight;
                int iDp = AndroidUtilities.dp(12.0f) + i5;
                GradientProtectionDrawable gradientProtectionDrawable = (GradientProtectionDrawable) this.parent;
                gradientProtectionDrawable.setInsets(iDp, 0);
                gradientProtectionDrawable.setBounds(0, 0, i, AndroidUtilities.dp(52.0f) + i5);
                GradientProtectionDrawable gradientProtectionDrawable2 = (GradientProtectionDrawable) this.hideRunnable;
                gradientProtectionDrawable2.setInsets(i5 / 3, 0);
                gradientProtectionDrawable2.setBounds(0, 0, i, i5);
                break;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                break;
        }
    }

    public MessageEnterTransitionContainer(ViewGroup viewGroup, int i) {
        super(viewGroup.getContext());
        this.transitions = new ArrayList();
        this.hideRunnable = new IntroActivity$$ExternalSyntheticLambda6(this, 25);
        this.parent = viewGroup;
        this.currentAccount = i;
    }
}
