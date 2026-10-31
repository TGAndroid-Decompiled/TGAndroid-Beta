package org.telegram.ui;
public final class fg implements q0.a {
    public final int f37262a;
    public final un f37263b;

    public fg(un unVar, int i10) {
        this.f37262a = i10;
        this.f37263b = unVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f37262a) {
            case 0:
                Integer num = (Integer) obj;
                un unVar = this.f37263b;
                unVar.getClass();
                if (num.intValue() == 0) {
                    unVar.f42493z1 = 0;
                    unVar.Vc(true);
                    unVar.getMessagesController().q3(unVar.f42297j6, unVar.b());
                    return;
                }
                unVar.Vc(true);
                unVar.k(num.intValue(), 0, false, 0, true, 0);
                return;
            case 1:
                Integer num2 = (Integer) obj;
                un unVar2 = this.f37263b;
                unVar2.getClass();
                if (num2.intValue() == 0) {
                    unVar2.A1 = 0;
                    unVar2.Uc(true);
                    unVar2.getMessagesController().p3(unVar2.f42297j6, unVar2.b());
                    return;
                }
                int i10 = unVar2.A1 - 1;
                unVar2.A1 = i10;
                if (i10 <= 0) {
                    unVar2.getMessagesController().p3(unVar2.f42297j6, unVar2.b());
                }
                unVar2.Uc(true);
                unVar2.k(num2.intValue(), 0, false, 0, true, 0);
                return;
            default:
                un unVar3 = this.f37263b;
                unVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                unVar3.f42448v7 = booleanValue;
                if (!booleanValue) {
                    unVar3.C8();
                    return;
                }
                return;
        }
    }
}
