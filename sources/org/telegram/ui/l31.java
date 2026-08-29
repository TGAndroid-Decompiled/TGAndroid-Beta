package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;
public final class l31 extends zf.a {
    public final SaveToGallerySettingsHelper.DialogException f40083c;
    public final String d;

    public l31(int i10) {
        super(i10, false);
        this.f40083c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || l31.class != obj.getClass()) {
            return false;
        }
        l31 l31Var = (l31) obj;
        if (this.f50845a != l31Var.f50845a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, l31Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.f40083c;
        if (dialogException2 == null || (dialogException = l31Var.f40083c) == null || dialogException2.dialogId == dialogException.dialogId) {
            return true;
        }
        return false;
    }

    public l31(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.f40083c = dialogException;
    }

    public l31(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.f40083c = null;
    }
}
