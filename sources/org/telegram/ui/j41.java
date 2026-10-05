package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;
public final class j41 extends og.a {
    public final SaveToGallerySettingsHelper.DialogException f37570c;
    public final String d;

    public j41(int i10) {
        super(i10, false);
        this.f37570c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || j41.class != obj.getClass()) {
            return false;
        }
        j41 j41Var = (j41) obj;
        if (this.f17192a != j41Var.f17192a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, j41Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.f37570c;
        if (dialogException2 == null || (dialogException = j41Var.f37570c) == null || dialogException2.dialogId == dialogException.dialogId) {
            return true;
        }
        return false;
    }

    public j41(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.f37570c = dialogException;
    }

    public j41(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.f37570c = null;
    }
}
