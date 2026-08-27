package org.telegram.ui.Components;

public final class va implements q0.a {

    public final int f33338a;

    public final Object f33339b;

    public va(Object obj, int i10) {
        this.f33338a = i10;
        this.f33339b = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f33338a) {
            case 0:
                ec ecVar = (ec) this.f33339b;
                Float f10 = (Float) obj;
                db dbVar = ecVar.f28026p;
                if (dbVar != null) {
                    jb jbVar = ecVar.f28016e;
                    if (!jbVar.top) {
                        dbVar.c(jbVar.getHeight() - f10.floatValue());
                    }
                }
                break;
            default:
                ei eiVar = ((gi) this.f33339b).V1;
                if (eiVar != null) {
                    eiVar.I(obj);
                }
                break;
        }
    }
}
