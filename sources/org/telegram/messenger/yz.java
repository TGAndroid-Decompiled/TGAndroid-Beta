package org.telegram.messenger;

import android.content.SharedPreferences;
public final class yz implements Runnable {
    public final int f28260a;
    public final e00 f28261b;

    public yz(e00 e00Var, int i7) {
        this.f28260a = i7;
        this.f28261b = e00Var;
    }

    @Override
    public final void run() {
        int i7 = this.f28260a;
        e00 e00Var = this.f28261b;
        switch (i7) {
            case 0:
                ks f10 = ks.f(e00Var.currentAccount);
                int i10 = mp.I8;
                f10.k(2, 512);
                return;
            default:
                e00Var.f23648a.b();
                e00Var.f23649b.b();
                e00Var.d.clear();
                SharedPreferences.Editor edit = e00Var.getUserConfig().k().edit();
                for (String str : e00Var.getUserConfig().k().getAll().keySet()) {
                    if (str.startsWith("topics_load_offset_message_id_")) {
                        edit.remove(str);
                    }
                    if (str.startsWith("topics_load_offset_date_")) {
                        edit.remove(str);
                    }
                    if (str.startsWith("topics_load_offset_topic_id_")) {
                        edit.remove(str);
                    }
                    if (str.startsWith("topics_end_reached_")) {
                        edit.remove(str);
                    }
                }
                edit.apply();
                return;
        }
    }
}
