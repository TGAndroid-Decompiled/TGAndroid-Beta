package org.telegram.ui;
public final class hg implements q0.a {
    public final int f37810a;
    public final un f37811b;

    public hg(un unVar, int i10) {
        this.f37810a = i10;
        this.f37811b = unVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f37810a) {
            case 0:
                Integer num = (Integer) obj;
                un unVar = this.f37811b;
                unVar.getClass();
                if (num.intValue() == 0) {
                    unVar.f42304z1 = 0;
                    unVar.ad(true);
                    unVar.getMessagesController().q3(unVar.f42108j6, unVar.b());
                    return;
                }
                unVar.ad(true);
                unVar.l(num.intValue(), 0, false, 0, true, 0);
                return;
            case 1:
                Integer num2 = (Integer) obj;
                un unVar2 = this.f37811b;
                unVar2.getClass();
                if (num2.intValue() == 0) {
                    unVar2.A1 = 0;
                    unVar2.Zc(true);
                    unVar2.getMessagesController().p3(unVar2.f42108j6, unVar2.b());
                    return;
                }
                int i10 = unVar2.A1 - 1;
                unVar2.A1 = i10;
                if (i10 <= 0) {
                    unVar2.getMessagesController().p3(unVar2.f42108j6, unVar2.b());
                }
                unVar2.Zc(true);
                unVar2.l(num2.intValue(), 0, false, 0, true, 0);
                return;
            default:
                un unVar3 = this.f37811b;
                unVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                unVar3.f42259v7 = booleanValue;
                if (!booleanValue) {
                    unVar3.G8();
                    return;
                }
                return;
        }
    }
}
