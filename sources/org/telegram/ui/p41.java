package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;
public final class p41 extends og.a {
    public final SaveToGallerySettingsHelper.DialogException f36434c;
    public final String d;

    public p41(int i10) {
        super(i10, false);
        this.f36434c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || p41.class != obj.getClass()) {
            return false;
        }
        p41 p41Var = (p41) obj;
        if (this.f15533a != p41Var.f15533a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, p41Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.f36434c;
        if (dialogException2 == null || (dialogException = p41Var.f36434c) == null || dialogException2.dialogId == dialogException.dialogId) {
            return true;
        }
        return false;
    }

    public p41(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.f36434c = dialogException;
    }

    public p41(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.f36434c = null;
    }
}
