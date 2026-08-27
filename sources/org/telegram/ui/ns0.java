package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;

public final class ns0 implements Runnable {

    public final int f40913a;

    public final os0 f40914b;

    public ns0(os0 os0Var, int i10) {
        this.f40913a = i10;
        this.f40914b = os0Var;
    }

    @Override
    public final void run() {
        e5.b bVar;
        int i10;
        switch (this.f40913a) {
            case 0:
                PhotoViewer photoViewer = this.f40914b.f41162b;
                tt0 tt0Var = photoViewer.A2;
                if (tt0Var != null) {
                    org.telegram.ui.Components.m61 m61Var = photoViewer.B2;
                    if (tt0Var.f43015e != m61Var) {
                        tt0Var.f43014c = false;
                        tt0Var.d = false;
                        if (tt0Var.f43013b) {
                            tt0Var.f43012a++;
                            tt0Var.f43013b = false;
                        }
                        tt0Var.setImageResource(17170445);
                    }
                    if (m61Var != null) {
                        h3.k0 k0Var = m61Var.d;
                        if (k0Var == null) {
                            long jQ = m61Var.q() - m61Var.o();
                            if (!tt0Var.f43014c && !tt0Var.d && !tt0Var.f43013b && jQ < 5250.0f) {
                                Uri uri = m61Var.B;
                                int i11 = tt0Var.f43012a + 1;
                                tt0Var.f43012a = i11;
                                Utilities.globalQueue.postRunnable(new ol0(tt0Var, uri, i11, 2));
                                tt0Var.f43013b = true;
                            }
                        } else {
                            try {
                                k0Var.q0();
                                h3.t0 t0Var = k0Var.P;
                                if (t0Var == null || (bVar = t0Var.N) == null || ((i10 = bVar.f5233c) != 6 && i10 != 7)) {
                                    long jQ2 = m61Var.q() - m61Var.o();
                                    if (!tt0Var.f43014c) {
                                        Uri uri2 = m61Var.B;
                                        int i12 = tt0Var.f43012a + 1;
                                        tt0Var.f43012a = i12;
                                        Utilities.globalQueue.postRunnable(new ol0(tt0Var, uri2, i12, 2));
                                        tt0Var.f43013b = true;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                    tt0Var.f43015e = m61Var;
                }
                break;
            case 1:
                tt0.a(this.f40914b.f41162b.A2);
                break;
            default:
                tt0.a(this.f40914b.f41162b.A2);
                break;
        }
    }
}
