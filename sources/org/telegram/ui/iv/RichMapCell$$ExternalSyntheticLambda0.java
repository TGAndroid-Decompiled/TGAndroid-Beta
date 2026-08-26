package org.telegram.ui.iv;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.web.AddressBarList;
import org.telegram.ui.web.AddressBarList$$ExternalSyntheticLambda3;

public final class RichMapCell$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final int $r8$classId;
    public final FrameLayout f$0;

    public RichMapCell$$ExternalSyntheticLambda0(FrameLayout frameLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = frameLayout;
    }

    @Override
    public final void onClick(View view) {
        RichMapCell.Delegate delegate;
        switch (this.$r8$classId) {
            case 0:
                RichMapCell richMapCell = (RichMapCell) this.f$0;
                BlockRow blockRow = richMapCell.currentRow;
                if (blockRow != null && (delegate = richMapCell.delegate) != null) {
                    RichEditorListView.this.delegate.onOpenLocationRequest(blockRow);
                    break;
                }
                break;
            default:
                AddressBarList addressBarList = (AddressBarList) this.f$0;
                new AlertDialog.Builder(addressBarList.getContext(), 0, null).setTitle(LocaleController.getString(R.string.WebRecentClearTitle)).setMessage(LocaleController.getString(R.string.WebRecentClearText)).setPositiveButton(LocaleController.getString(R.string.OK), new AddressBarList$$ExternalSyntheticLambda3(addressBarList)).setNegativeButton(LocaleController.getString(R.string.Cancel), null).show();
                break;
        }
    }
}
