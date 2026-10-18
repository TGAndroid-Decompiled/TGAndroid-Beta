package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;
public final class g31 extends pg.a {
    public final SaveToGallerySettingsHelper.DialogException f37059c;
    public final String d;

    public g31(int i10) {
        super(i10, false);
        this.f37059c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || g31.class != obj.getClass()) {
            return false;
        }
        g31 g31Var = (g31) obj;
        if (this.f44291a != g31Var.f44291a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, g31Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.f37059c;
        if (dialogException2 == null || (dialogException = g31Var.f37059c) == null || dialogException2.dialogId == dialogException.dialogId) {
            return true;
        }
        return false;
    }

    public g31(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.f37059c = dialogException;
    }

    public g31(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.f37059c = null;
    }
}
