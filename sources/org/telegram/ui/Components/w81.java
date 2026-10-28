package org.telegram.ui.Components;

import org.telegram.ui.PhotoViewer;
public final class w81 implements Runnable {
    public final int f34472a;
    public final a91 f34473b;

    public w81(a91 a91Var, int i10) {
        this.f34472a = i10;
        this.f34473b = a91Var;
    }

    @Override
    public final void run() {
        switch (this.f34472a) {
            case 0:
                a91 a91Var = this.f34473b;
                a91Var.h = 0.0f;
                g6 g6Var = a91Var.f26467b;
                if (g6Var != null) {
                    g6Var.u();
                    a91Var.f26467b = null;
                    return;
                }
                return;
            case 1:
                a91 a91Var2 = this.f34473b;
                a91Var2.f26465a = true;
                a91Var2.e = null;
                if (a91Var2.f26467b != null) {
                    a91Var2.f26478s = true;
                    PhotoViewer photoViewer = a91Var2.M.f39955a;
                    if (photoViewer.f35814u3) {
                        photoViewer.e3(true);
                        return;
                    }
                    return;
                }
                return;
            default:
                a91 a91Var3 = this.f34473b;
                a91Var3.f26465a = true;
                a91Var3.e = null;
                if (a91Var3.f26467b != null) {
                    a91Var3.f26478s = true;
                    PhotoViewer photoViewer2 = a91Var3.M.f39955a;
                    if (photoViewer2.f35814u3) {
                        photoViewer2.e3(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
