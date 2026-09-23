package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;
public final class i41 extends og.a {
    public final SaveToGallerySettingsHelper.DialogException f34027c;
    public final String d;

    public i41(int i10) {
        super(i10, false);
        this.f34027c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || i41.class != obj.getClass()) {
            return false;
        }
        i41 i41Var = (i41) obj;
        if (this.f15508a != i41Var.f15508a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, i41Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.f34027c;
        if (dialogException2 == null || (dialogException = i41Var.f34027c) == null || dialogException2.dialogId == dialogException.dialogId) {
            return true;
        }
        return false;
    }

    public i41(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.f34027c = dialogException;
    }

    public i41(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.f34027c = null;
    }
}
