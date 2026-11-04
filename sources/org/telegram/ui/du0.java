package org.telegram.ui;

import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Consumer;
public final class du0 implements Consumer {
    public final ProfileActivity f44814a;

    public du0(ProfileActivity profileActivity) {
        this.f44814a = profileActivity;
    }

    @Override
    public final void accept(Object obj) {
        ProfileActivity profileActivity = this.f44814a;
        HashSet hashSet = profileActivity.f41783i5;
        ArrayList arrayList = new ArrayList((HashSet) obj);
        int i3 = 0;
        while (i3 < arrayList.size()) {
            if (profileActivity.getMessagesController().f23102q7.f(profileActivity.f41759f1, ((Integer) arrayList.get(i3)).intValue()) == null) {
                arrayList.remove(i3);
                i3--;
            }
            i3++;
        }
        hashSet.clear();
        hashSet.addAll(arrayList);
        profileActivity.F5(true);
    }

    public Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
