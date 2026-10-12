package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class os0 implements Utilities.Callback {
    public final int f40766a;
    public final us0 f40767b;
    public final boolean f40768c;

    public os0(us0 us0Var, boolean z10, int i10) {
        this.f40766a = i10;
        this.f40767b = us0Var;
        this.f40768c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f40766a) {
            case 0:
                org.telegram.ui.Components.zc.F(this.f40767b.f42561b.f33741e0, this.f40768c).j();
                return;
            default:
                org.telegram.ui.Components.zc.F(this.f40767b.f42561b.f33741e0, this.f40768c).j();
                return;
        }
    }
}
