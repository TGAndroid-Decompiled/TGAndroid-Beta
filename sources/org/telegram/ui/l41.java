package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;
public final class l41 extends og.a {
    public final SaveToGallerySettingsHelper.DialogException f35244c;
    public final String d;

    public l41(int i10) {
        super(i10, false);
        this.f35244c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || l41.class != obj.getClass()) {
            return false;
        }
        l41 l41Var = (l41) obj;
        if (this.f15754a != l41Var.f15754a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, l41Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.f35244c;
        if (dialogException2 == null || (dialogException = l41Var.f35244c) == null || dialogException2.dialogId == dialogException.dialogId) {
            return true;
        }
        return false;
    }

    public l41(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.f35244c = dialogException;
    }

    public l41(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.f35244c = null;
    }
}
