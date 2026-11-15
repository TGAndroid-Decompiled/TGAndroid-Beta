package org.telegram.ui;
public final class qf implements q0.a {
    public final int f50593a;
    public final an f50594b;

    public qf(an anVar, int i7) {
        this.f50593a = i7;
        this.f50594b = anVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f50593a) {
            case 0:
                Integer num = (Integer) obj;
                an anVar = this.f50594b;
                anVar.getClass();
                if (num.intValue() == 0) {
                    anVar.A1 = 0;
                    anVar.jd(true);
                    anVar.getMessagesController().t3(anVar.f45258k6, anVar.b());
                    return;
                }
                anVar.jd(true);
                anVar.l(num.intValue(), 0, false, 0, true, 0);
                return;
            case 1:
                Integer num2 = (Integer) obj;
                an anVar2 = this.f50594b;
                anVar2.getClass();
                if (num2.intValue() == 0) {
                    anVar2.B1 = 0;
                    anVar2.id(true);
                    anVar2.getMessagesController().s3(anVar2.f45258k6, anVar2.b());
                    return;
                }
                int i7 = anVar2.B1 - 1;
                anVar2.B1 = i7;
                if (i7 <= 0) {
                    anVar2.getMessagesController().s3(anVar2.f45258k6, anVar2.b());
                }
                anVar2.id(true);
                anVar2.l(num2.intValue(), 0, false, 0, true, 0);
                return;
            default:
                an anVar3 = this.f50594b;
                anVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                anVar3.f45410w7 = booleanValue;
                if (!booleanValue) {
                    anVar3.L8();
                    return;
                }
                return;
        }
    }
}
