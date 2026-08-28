package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;
public final class l31 extends wf.a {
    public final SaveToGallerySettingsHelper.DialogException f39987c;
    public final String d;

    public l31(int i9) {
        super(i9, false);
        this.f39987c = null;
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
        if (this.f48814a != l31Var.f48814a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, l31Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.f39987c;
        if (dialogException2 == null || (dialogException = l31Var.f39987c) == null || dialogException2.dialogId == dialogException.dialogId) {
            return true;
        }
        return false;
    }

    public l31(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.f39987c = dialogException;
    }

    public l31(int i9, String str) {
        super(i9, false);
        this.d = str;
        this.f39987c = null;
    }
}
