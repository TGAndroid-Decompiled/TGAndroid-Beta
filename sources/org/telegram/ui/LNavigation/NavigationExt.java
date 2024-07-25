package org.telegram.ui.LNavigation;

import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
public class NavigationExt {

    public interface FragmentConsumer {
        boolean consume(BaseFragment baseFragment);
    }

    public static boolean backToFragment(BaseFragment baseFragment, FragmentConsumer fragmentConsumer) {
        boolean z;
        if (baseFragment == null || baseFragment.getParentLayout() == null) {
            return false;
        }
        INavigationLayout parentLayout = baseFragment.getParentLayout();
        BaseFragment lastFragment = baseFragment.getParentLayout().getLastFragment();
        List<BaseFragment> fragmentStack = lastFragment.getParentLayout().getFragmentStack();
        ArrayList arrayList = new ArrayList();
        int size = parentLayout.getFragmentStack().size() - 1;
        while (true) {
            if (size < 0) {
                z = false;
                break;
            } else if (fragmentConsumer.consume(fragmentStack.get(size))) {
                z = true;
                break;
            } else {
                arrayList.add(fragmentStack.get(size));
                size--;
            }
        }
        if (z) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                if (arrayList.get(size2) != lastFragment) {
                    ((BaseFragment) arrayList.get(size2)).removeSelfFromStack();
                }
            }
            lastFragment.finishFragment();
            return true;
        }
        return false;
    }
}
