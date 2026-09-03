package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;
public final class e41 extends bg.b {
    public final SaveToGallerySettingsHelper.DialogException f33608c;
    public final String d;

    public e41(int i10) {
        super(i10, false);
        this.f33608c = null;
    }

    public final boolean equals(Object obj) {
        SaveToGallerySettingsHelper.DialogException dialogException;
        if (this == obj) {
            return true;
        }
        if (obj == null || e41.class != obj.getClass()) {
            return false;
        }
        e41 e41Var = (e41) obj;
        if (this.f1830a != e41Var.f1830a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, e41Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.f33608c;
        if (dialogException2 == null || (dialogException = e41Var.f33608c) == null || dialogException2.dialogId == dialogException.dialogId) {
            return true;
        }
        return false;
    }

    public e41(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.f33608c = dialogException;
    }

    public e41(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.f33608c = null;
    }
}
