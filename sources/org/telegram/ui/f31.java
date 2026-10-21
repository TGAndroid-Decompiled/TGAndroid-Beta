package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;
public final class f31 extends pg.a {
    public final SaveToGallerySettingsHelper.DialogException f36888c;
    public final String d;

    public f31(int i10) {
        super(i10, false);
        this.f36888c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || f31.class != obj.getClass()) {
            return false;
        }
        f31 f31Var = (f31) obj;
        if (this.f44296a != f31Var.f44296a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, f31Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.f36888c;
        if (dialogException2 == null || (dialogException = f31Var.f36888c) == null || dialogException2.dialogId == dialogException.dialogId) {
            return true;
        }
        return false;
    }

    public f31(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.f36888c = dialogException;
    }

    public f31(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.f36888c = null;
    }
}
