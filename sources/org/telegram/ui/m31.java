package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;
public final class m31 extends qg.a {
    public final SaveToGallerySettingsHelper.DialogException f41322c;
    public final String d;

    public m31(int i10) {
        super(i10, false);
        this.f41322c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || m31.class != obj.getClass()) {
            return false;
        }
        m31 m31Var = (m31) obj;
        if (this.f47075a != m31Var.f47075a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, m31Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.f41322c;
        if (dialogException2 == null || (dialogException = m31Var.f41322c) == null || dialogException2.dialogId == dialogException.dialogId) {
            return true;
        }
        return false;
    }

    public m31(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.f41322c = dialogException;
    }

    public m31(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.f41322c = null;
    }
}
