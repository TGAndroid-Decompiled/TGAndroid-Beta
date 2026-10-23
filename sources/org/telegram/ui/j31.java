package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;
public final class j31 extends pg.a {
    public final SaveToGallerySettingsHelper.DialogException f38453c;
    public final String d;

    public j31(int i10) {
        super(i10, false);
        this.f38453c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || j31.class != obj.getClass()) {
            return false;
        }
        j31 j31Var = (j31) obj;
        if (this.f44713a != j31Var.f44713a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, j31Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.f38453c;
        if (dialogException2 == null || (dialogException = j31Var.f38453c) == null || dialogException2.dialogId == dialogException.dialogId) {
            return true;
        }
        return false;
    }

    public j31(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.f38453c = dialogException;
    }

    public j31(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.f38453c = null;
    }
}
