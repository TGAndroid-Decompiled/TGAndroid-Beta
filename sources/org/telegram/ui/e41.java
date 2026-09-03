package org.telegram.ui;

import j$.util.Objects;
import org.telegram.messenger.SaveToGallerySettingsHelper;
public final class e41 extends cg.b {
    public final SaveToGallerySettingsHelper.DialogException f36359c;
    public final String d;

    public e41(int i10) {
        super(i10, false);
        this.f36359c = null;
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
        if (this.f2505a != e41Var.f2505a) {
            return false;
        }
        String str = this.d;
        if (str != null) {
            return Objects.equals(str, e41Var.d);
        }
        SaveToGallerySettingsHelper.DialogException dialogException2 = this.f36359c;
        if (dialogException2 == null || (dialogException = e41Var.f36359c) == null || dialogException2.dialogId == dialogException.dialogId) {
            return true;
        }
        return false;
    }

    public e41(SaveToGallerySettingsHelper.DialogException dialogException) {
        super(2, false);
        this.f36359c = dialogException;
    }

    public e41(int i10, String str) {
        super(i10, false);
        this.d = str;
        this.f36359c = null;
    }
}
