package org.telegram.messenger;

import android.content.SharedPreferences;
public final class zz implements Runnable {
    public final int f28392a;
    public final f00 f28393b;

    public zz(f00 f00Var, int i7) {
        this.f28392a = i7;
        this.f28393b = f00Var;
    }

    @Override
    public final void run() {
        int i7 = this.f28392a;
        f00 f00Var = this.f28393b;
        switch (i7) {
            case 0:
                ls f10 = ls.f(f00Var.currentAccount);
                int i10 = np.I8;
                f10.k(2, 512);
                return;
            default:
                f00Var.f23771a.b();
                f00Var.f23772b.b();
                f00Var.d.clear();
                SharedPreferences.Editor edit = f00Var.getUserConfig().k().edit();
                for (String str : f00Var.getUserConfig().k().getAll().keySet()) {
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
