package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class fg0 implements View.OnClickListener {
    public final int f45275a;
    public final kg0 f45276b;

    public fg0(kg0 kg0Var, int i3) {
        this.f45275a = i3;
        this.f45276b = kg0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45275a) {
            case 0:
                kg0 kg0Var = this.f45276b;
                jg0 jg0Var = kg0Var.f46932j2;
                HashSet hashSet = kg0Var.W1;
                if (hashSet.size() != 0 && jg0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : kg0Var.f46925b2.values()) {
                        if (hashSet.contains(Long.valueOf(user.f27150id))) {
                            arrayList.add(Long.valueOf(user.f27150id));
                        }
                    }
                    jg0Var.a(arrayList);
                    kg0Var.dismiss();
                    return;
                }
                return;
            default:
                kg0 kg0Var2 = this.f45276b;
                kg0Var2.W1.clear();
                kg0Var2.R1.d.b(true);
                kg0Var2.g1(true, false);
                return;
        }
    }
}
