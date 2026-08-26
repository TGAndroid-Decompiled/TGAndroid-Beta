package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.RecyclerListView;

public final class ProxyListActivity$$ExternalSyntheticLambda2 implements RecyclerListView.OnItemLongClickListener, AlertDialog.OnButtonClickListener {
    public final ProxyListActivity f$0;

    public ProxyListActivity$$ExternalSyntheticLambda2(ProxyListActivity proxyListActivity) {
        this.f$0 = proxyListActivity;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        ProxyListActivity proxyListActivity = this.f$0;
        ArrayList arrayList = proxyListActivity.proxyList;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            SharedConfig.deleteProxy((SharedConfig.ProxyInfo) obj);
        }
        proxyListActivity.useProxyForCalls = false;
        proxyListActivity.useProxySettings = false;
        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
        int i3 = NotificationCenter.proxySettingsChanged;
        globalInstance.removeObserver(proxyListActivity, i3);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i3, new Object[0]);
        NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i3);
        proxyListActivity.updateRows$7(true);
        ProxyListActivity.ListAdapter listAdapter = proxyListActivity.listAdapter;
        if (listAdapter != null) {
            listAdapter.mObservable.notifyItemRangeChanged(0, 1, 0);
            ProxyListActivity.ListAdapter listAdapter2 = proxyListActivity.listAdapter;
            listAdapter2.mObservable.notifyItemRangeChanged(proxyListActivity.callsRow, 1, 0);
            proxyListActivity.listAdapter.clearSelected();
        }
    }

    @Override
    public boolean onItemClick(int i, View view) {
        ProxyListActivity proxyListActivity = this.f$0;
        if (i < proxyListActivity.proxyStartRow || i >= proxyListActivity.proxyEndRow) {
            return false;
        }
        proxyListActivity.listAdapter.toggleSelected(i);
        return true;
    }
}
