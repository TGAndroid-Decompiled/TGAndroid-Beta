package org.telegram.ui;
public final class nn implements Runnable {
    public final int f48024a;
    public final bo f48025b;

    public nn(bo boVar, int i3) {
        this.f48024a = i3;
        this.f48025b = boVar;
    }

    @Override
    public final void run() {
        switch (this.f48024a) {
            case 0:
                bo boVar = this.f48025b;
                boVar.f44094d0 = true;
                boVar.h0();
                return;
            case 1:
                bo boVar2 = this.f48025b;
                boVar2.Y = boVar2.getMessagesController().M0(Long.valueOf(boVar2.f44089a0));
                boVar2.e0();
                return;
            case 2:
                this.f48025b.g0(false);
                return;
            case 3:
                bo boVar3 = this.f48025b;
                boVar3.f44094d0 = true;
                if (boVar3.f44090b.length() > 0) {
                    boVar3.c0(boVar3.f44090b.getText().toString());
                }
                boVar3.h0();
                return;
            case 4:
                this.f48025b.e0();
                return;
            default:
                this.f48025b.g0(true);
                return;
        }
    }
}
