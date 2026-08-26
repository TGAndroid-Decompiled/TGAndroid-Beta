package org.telegram.ui.Components;

import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;

public final class HashtagHistoryView$$ExternalSyntheticLambda1 implements Utilities.Callback5, Utilities.Callback5Return {
    public final HashtagHistoryView f$0;

    public HashtagHistoryView$$ExternalSyntheticLambda1(HashtagHistoryView hashtagHistoryView) {
        this.f$0 = hashtagHistoryView;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z = true;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        HashtagHistoryView hashtagHistoryView = this.f$0;
        hashtagHistoryView.getClass();
        int i = ((UItem) obj).id;
        if (i != 0) {
            String str = (String) hashtagHistoryView.history.get(i - 1);
            AlertDialog.Builder builder = new AlertDialog.Builder(hashtagHistoryView.getContext(), 0, hashtagHistoryView.resourcesProvider);
            String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string;
            alertDialog.message = LocaleController.formatString(R.string.ClearSearchSingleHashtagAlertText, str);
            builder.setPositiveButton(LocaleController.getString(R.string.ClearSearchRemove), new RateCallLayout$$ExternalSyntheticLambda1(6, hashtagHistoryView, str));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            alertDialog.show();
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override
    public void mo1067run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        HashtagHistoryView hashtagHistoryView = this.f$0;
        hashtagHistoryView.getClass();
        int i = ((UItem) obj).id;
        if (i == 0) {
            HashtagSearchController.getInstance(hashtagHistoryView.currentAccount).clearHistory();
            hashtagHistoryView.adapter.update(true);
        } else {
            Utilities.Callback callback = hashtagHistoryView.onClickListener;
            if (callback != null) {
                callback.run((String) hashtagHistoryView.history.get(i - 1));
            }
        }
    }
}
