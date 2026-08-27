package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;

public final class k31 extends xf.a {

    public final SaveToGallerySettingsHelper.DialogException f39588c;
    public final String d;

    public k31(int i10) {
        super(i10, false);
        this.f39588c = null;
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
        if (this.f49413a != k31Var.f49413a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, k31Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.f39588c;
        return dialogException2 == null || (dialogException = k31Var.f39588c) == null || dialogException2.dialogId == dialogException.dialogId;
    }

    public k31(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.f39588c = dialogException;
    }

    public k31(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.f39588c = null;
    }
}
