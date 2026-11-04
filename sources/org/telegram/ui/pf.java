package org.telegram.ui;
public final class pf implements q0.a {
    public final int f48568a;
    public final wm f48569b;

    public pf(wm wmVar, int i3) {
        this.f48568a = i3;
        this.f48569b = wmVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f48568a) {
            case 0:
                Integer num = (Integer) obj;
                wm wmVar = this.f48569b;
                wmVar.getClass();
                if (num.intValue() == 0) {
                    wmVar.A1 = 0;
                    wmVar.fd(true);
                    wmVar.getMessagesController().t3(wmVar.f51376k6, wmVar.b());
                    return;
                }
                wmVar.fd(true);
                wmVar.l(num.intValue(), 0, false, 0, true, 0);
                return;
            case 1:
                Integer num2 = (Integer) obj;
                wm wmVar2 = this.f48569b;
                wmVar2.getClass();
                if (num2.intValue() == 0) {
                    wmVar2.B1 = 0;
                    wmVar2.ed(true);
                    wmVar2.getMessagesController().s3(wmVar2.f51376k6, wmVar2.b());
                    return;
                }
                int i3 = wmVar2.B1 - 1;
                wmVar2.B1 = i3;
                if (i3 <= 0) {
                    wmVar2.getMessagesController().s3(wmVar2.f51376k6, wmVar2.b());
                }
                wmVar2.ed(true);
                wmVar2.l(num2.intValue(), 0, false, 0, true, 0);
                return;
            default:
                wm wmVar3 = this.f48569b;
                wmVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                wmVar3.f51528w7 = booleanValue;
                if (!booleanValue) {
                    wmVar3.J8();
                    return;
                }
                return;
        }
    }
}
