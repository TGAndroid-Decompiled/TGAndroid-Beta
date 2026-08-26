package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.RecyclerListView;

public final class ProxyListActivity$$ExternalSyntheticLambda4 implements RecyclerListView.OnItemLongClickListener, AlertDialog.OnButtonClickListener {
    public final ProxyListActivity f$0;

    public ProxyListActivity$$ExternalSyntheticLambda4(ProxyListActivity proxyListActivity) {
        this.f$0 = proxyListActivity;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        this.f$0.lambda$createView$0(alertDialog, i);
    }

    @Override
    public boolean onItemClick(View view, int i) {
        return this.f$0.lambda$createView$2(view, i);
    }
}
