package org.telegram.messenger;
public final class z00 implements Runnable {
    public final int f19465a;
    public final t10 f19466b;
    public final String f19467c;
    public final jj d;
    public final long e;
    public final int f19468f;

    public z00(t10 t10Var, String str, jj jjVar, long j10, int i10, int i11) {
        this.f19465a = i11;
        this.f19466b = t10Var;
        this.f19467c = str;
        this.d = jjVar;
        this.e = j10;
        this.f19468f = i10;
    }

    @Override
    public final void run() {
        switch (this.f19465a) {
            case 0:
                t10 t10Var = this.f19466b;
                jj jjVar = this.d;
                long j10 = this.e;
                int i10 = this.f19468f;
                js.d(this.f19467c, new c10(t10Var, jjVar, j10, i10), new c10(t10Var, jjVar, j10, i10), false);
                return;
            default:
                t10 t10Var2 = this.f19466b;
                t10Var2.getClass();
                String str = this.f19467c;
                if (str == null) {
                    str = "und";
                }
                jj jjVar2 = this.d;
                jjVar2.f16337k.originalLanguage = str;
                t10Var2.getMessagesStorage().X1(this.e, jjVar2.f16337k);
                t10Var2.f17990w.remove(Integer.valueOf(this.f19468f));
                t10Var2.f(jjVar2);
                return;
        }
    }
}
