package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;
public final class q41 extends og.a {
    public final SaveToGallerySettingsHelper.DialogException f36757c;
    public final String d;

    public q41(int i10) {
        super(i10, false);
        this.f36757c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || q41.class != obj.getClass()) {
            return false;
        }
        q41 q41Var = (q41) obj;
        if (this.f15531a != q41Var.f15531a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, q41Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.f36757c;
        if (dialogException2 == null || (dialogException = q41Var.f36757c) == null || dialogException2.dialogId == dialogException.dialogId) {
            return true;
        }
        return false;
    }

    public q41(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.f36757c = dialogException;
    }

    public q41(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.f36757c = null;
    }
}
