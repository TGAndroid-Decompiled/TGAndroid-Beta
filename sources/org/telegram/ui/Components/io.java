package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class io implements View.OnClickListener {
    public final int f25164a;
    public final lo f25165b;
    public final TLRPC.Document f25166c;

    public io(lo loVar, TLRPC.Document document, int i10) {
        this.f25164a = i10;
        this.f25165b = loVar;
        this.f25166c = document;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25164a) {
            case 0:
                ko koVar = this.f25165b.d;
                if (koVar != null) {
                    koVar.c(this.f25166c);
                    return;
                }
                return;
            default:
                ko koVar2 = this.f25165b.d;
                if (koVar2 != null) {
                    koVar2.c(this.f25166c);
                    return;
                }
                return;
        }
    }
}
