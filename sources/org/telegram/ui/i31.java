package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;
public final class i31 extends pg.a {
    public final SaveToGallerySettingsHelper.DialogException f38136c;
    public final String d;

    public i31(int i10) {
        super(i10, false);
        this.f38136c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || i31.class != obj.getClass()) {
            return false;
        }
        i31 i31Var = (i31) obj;
        if (this.f44712a != i31Var.f44712a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, i31Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.f38136c;
        if (dialogException2 == null || (dialogException = i31Var.f38136c) == null || dialogException2.dialogId == dialogException.dialogId) {
            return true;
        }
        return false;
    }

    public i31(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.f38136c = dialogException;
    }

    public i31(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.f38136c = null;
    }
}
