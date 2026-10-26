package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;
public final class k31 extends qg.a {
    public final SaveToGallerySettingsHelper.DialogException f40795c;
    public final String d;

    public k31(int i10) {
        super(i10, false);
        this.f40795c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || k31.class != obj.getClass()) {
            return false;
        }
        k31 k31Var = (k31) obj;
        if (this.f47040a != k31Var.f47040a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, k31Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.f40795c;
        if (dialogException2 == null || (dialogException = k31Var.f40795c) == null || dialogException2.dialogId == dialogException.dialogId) {
            return true;
        }
        return false;
    }

    public k31(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.f40795c = dialogException;
    }

    public k31(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.f40795c = null;
    }
}
